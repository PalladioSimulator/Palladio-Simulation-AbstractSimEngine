package de.uka.ipd.sdq.simulation.abstractsimengine;

import java.util.Observer;

/**
 * @author Steffen Becker (this code has been factored out from SimuCom)
 * @author Philipp Merkle
 * 
 */
public interface ISimulationControl extends ISimulationTimeProvider {

    /**
     * Starts the simulation.
     */
    void start();

    /**
     * Stops the simulation.
     */
    void stop();

    void addStopCondition(SimCondition maxMeasurementsStopCondition);

    void addTimeObserver(Observer observer);

    /**
     * Returns whether the simulation is running.
     */
    boolean isRunning();
    
    /**
     * Sets the simulation time at which the simulation is supposed to stop.
     * 
     * @param simTime
     *            the time instant at which the simulation is to stop, expressed in simulated time
     *            units
     */
    default void setMaxSimTime(long simTime) {
        addStopCondition(() -> getCurrentSimulationTime() >= simTime);
    }

}