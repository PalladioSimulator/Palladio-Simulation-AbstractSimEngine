/**
 * 
 */
package org.palladiosimulator.simulation.abstractsimengine.ssj;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractSimProcessDelegator;
import de.uka.ipd.sdq.simulation.abstractsimengine.processes.ProcessState;
import de.uka.ipd.sdq.simulation.abstractsimengine.processes.SimProcessThreadingStrategy;
import de.uka.ipd.sdq.simulation.abstractsimengine.processes.SimulatedProcess;
import umontreal.ssj.simevents.Event;
import umontreal.ssj.simevents.Simulator;

/**
 * Simulation Process implementation for SSJ
 * 
 * @author Snowball, Michael H. & Jens (bugfixing, refactorings, cleanup) 
 */
public class SSJSimProcess extends SimulatedProcess {

    public static final Logger logger = Logger.getLogger(SSJSimProcess.class);

    /**
     * Underlying abstract simulation process
     */
    public final AbstractSimProcessDelegator myAbstractProcess;
    
    /**
     * Reference to the actual and concrete simulation engine 
     */
    private final Simulator sim;
    
    /**
	 * Reference to the underlying SSJ experiment 
	 */
	private final SSJExperiment ssjExperiment;

    /**
     * Constructor
     * @param myProcess Underlying abstract sim process
     * @param name an ID
     */
    public SSJSimProcess(AbstractSimProcessDelegator myProcess, String name) {
        super(new SimProcessThreadingStrategy());
        this.myAbstractProcess = myProcess;
        this.ssjExperiment = (SSJExperiment) myAbstractProcess.getModel().getSimulationControl();
        this.sim = ssjExperiment.getSimulator();

        startProcess(processStrategy);
    }

    /* (non-Javadoc)
     * @see de.uka.ipd.sdq.simulation.abstractsimengine.ISimProcess#scheduleAt(double)
     */
    public void scheduleAt(double delay) {
        if (!isTerminated()) {
        	if (this.myProcessState != ProcessState.SUSPENDED) {
        		throw new IllegalStateException("Tried to schedule thread which was not suspended ["
        				+ this.myAbstractProcess.getId() + "]");
        	}

        	// Resume process immediately to force process cleanup
        	if (!simIsRunning()) {
        		resume();
        	}

            new Event(sim) {
                @Override
                public void actions() {
                    if (!isTerminated()) {
                        resume();
                    }
                }
            }.schedule(delay);
        }
    }
    
    public void passivate(double delay) {
        if (!isTerminated()) {
            if (this.myProcessState != ProcessState.RUNNING) {
                throw new IllegalStateException("Tried to passivate thread which was not running ["
                        + this.myAbstractProcess.getId() + "]");
            }

            // Resume process immediately to force process cleanup
            if (!simIsRunning()) {
                resume();
            }

            new Event(sim) {
                @Override
                public void actions() {
                    if (!isTerminated()) {
                        resume();
                    }
                }
            }.schedule(delay);
            
            suspend();
        }
    }

    private boolean simIsRunning() {
        return !ssjExperiment.getSimulator().isStopped();
    }

    @Override
    protected AbstractSimProcessDelegator getAbstractProcess() {
        return this.myAbstractProcess;
    }

    @Override
    public boolean isScheduled() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reschedule(double delay) {
        throw new UnsupportedOperationException();
    }

}
