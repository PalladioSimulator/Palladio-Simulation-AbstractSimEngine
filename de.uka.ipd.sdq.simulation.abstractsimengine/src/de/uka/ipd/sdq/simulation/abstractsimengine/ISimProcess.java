package de.uka.ipd.sdq.simulation.abstractsimengine;

import co.paralleluniverse.fibers.SuspendExecution;

/**
 * A simulated process, which executes a sequence of actions as specified by the
 * <code>lifeCycle</code> method. in this way, this class supports the so-called process-interaction
 * simulation modelling.
 * <p>
 * By contrast to {@link AbstractSimEventDelegator}s, simulated time may pass while executing the
 * process lifecycle.
 * 
 * @author Steffen Becker (this code has been factored out from SimuCom)
 * @author Philipp Merkle
 */
public interface ISimProcess extends IEntity {

    /**
     * Passivates this process. This will suspend the simulation of the process until it is resumed
     * again using the <code>scheduleAt</code> method.
     * @throws SuspendExecution 
     */
    public void passivate() throws SuspendExecution;

    /**
     * Resumes the process after waiting <code>delay</code> simulated time units.
     * 
     * @param delay
     *            the period of simulated time to wait before this process is activated again.
     * @throws SuspendExecution 
     */
    public void scheduleAt(double delay) throws SuspendExecution;

    /**
     * Puts the process asleep and resumes after waiting <code>delay</code> simulated time units.
     * 
     * @param delay
     *            the period of simulated time to wait before this process is activated again.
     * @throws SuspendExecution 
     */
    public void passivate(double delay) throws SuspendExecution;

    /**
     * Returns whether this process has finished its execution.
     */
    public boolean isTerminated();

    public void addProcessListener(ISimProcessListener l);

    public void removeProcessListener(ISimProcessListener l);

}