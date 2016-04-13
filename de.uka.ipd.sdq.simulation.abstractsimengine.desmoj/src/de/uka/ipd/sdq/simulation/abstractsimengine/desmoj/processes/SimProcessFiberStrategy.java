package de.uka.ipd.sdq.simulation.abstractsimengine.desmoj.processes;

import co.paralleluniverse.strands.concurrent.Semaphore;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import co.paralleluniverse.common.util.SameThreadExecutor;
import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.FiberExecutorScheduler;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;
import co.paralleluniverse.strands.Strand;
import co.paralleluniverse.strands.SuspendableRunnable;
import co.paralleluniverse.strands.SuspendableUtils;
import de.uka.ipd.sdq.simulation.abstractsimengine.processes.ISimProcessStrategy;
import desmoj.core.simulator.Experiment;

public class SimProcessFiberStrategy implements ISimProcessStrategy {

    private Semaphore waitingSemaphore = new Semaphore(0, true);
    private Semaphore waitingForSuspendSemaphore = new Semaphore(0, true);
    private Fiber<Void> myFiber;
    private Experiment experiment;
    
    public SimProcessFiberStrategy(Experiment experiment) {
        this.experiment = experiment;
    }

    @Suspendable
    public void startProcess(final SuspendableRunnable asSuspendable) {
//        SuspendableRunnable asSuspendable = new SuspendableRunnable() {
//            @Override
//            public void run() throws SuspendExecution, InterruptedException {
//                runnable.run();
//            }
//        };
        
        Method m;
        try {
            m = experiment.getClass().getDeclaredMethod("getStrandFactory",null);
            m.setAccessible(true);
            Object strandSimFactoryObj = m.invoke(experiment, null);
            Class factory = Class.forName("desmoj.core.simulator.FiberSimStrandFactory");
            Method factoryMethod = factory.getDeclaredMethod("create", String.class, SuspendableRunnable.class);
            factoryMethod.setAccessible(true);
            this.myFiber = (Fiber) factoryMethod.invoke(strandSimFactoryObj, asSuspendable.toString(), asSuspendable);
        } catch (NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//        while(this.experiment.isPreparing() || this.experiment.isStopped() || this.experiment.isConnected()) {
//            Strand.yield();
//        }

        this.myFiber.start();
        waitingForSuspendSemaphore.acquireUninterruptibly();
    }

    @Suspendable
    public void resumeProcess() {
        waitingSemaphore.release();
        waitingForSuspendSemaphore.acquireUninterruptibly();
    }
    
    @Suspendable
    public void finishProcess() {
        // This process is done and will not suspend any more...
        // Hence, release its wait for suspend semaphore held by the main control thread.
        this.waitingForSuspendSemaphore.release();
    }
    
    @Suspendable
    public void suspendProcess() {
        waitingForSuspendSemaphore.release();
        waitingSemaphore.acquireUninterruptibly();
    }

}
