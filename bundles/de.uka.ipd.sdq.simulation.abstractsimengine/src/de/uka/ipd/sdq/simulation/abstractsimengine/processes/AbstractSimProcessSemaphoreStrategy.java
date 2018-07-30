package de.uka.ipd.sdq.simulation.abstractsimengine.processes;

import java.util.concurrent.Semaphore;

public abstract class AbstractSimProcessSemaphoreStrategy implements ISimProcessStrategy {
    private Semaphore waitingSemaphore = new Semaphore(0);
    private Semaphore waitingForSuspendSemaphore = new Semaphore(0);

    public void startProcess(Runnable myRunnable) {
    	doStartProcess(myRunnable);
        waitingForSuspendSemaphore.acquireUninterruptibly();
    }

    protected abstract void doStartProcess(Runnable myRunnable);

	public void resumeProcess() {
        waitingSemaphore.release();
        waitingForSuspendSemaphore.acquireUninterruptibly();
    }

    public void finishProcess() {
        // This process is done and will not suspend any more...
        // Hence, release its wait for suspend semaphore held by the main control thread.
        this.waitingForSuspendSemaphore.release();
    }

    public void suspendProcess() {
        waitingForSuspendSemaphore.release();
        waitingSemaphore.acquireUninterruptibly();
    }
}
