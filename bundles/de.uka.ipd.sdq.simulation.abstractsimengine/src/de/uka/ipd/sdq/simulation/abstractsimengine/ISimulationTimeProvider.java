package de.uka.ipd.sdq.simulation.abstractsimengine;

public interface ISimulationTimeProvider {
    
    /**
     * Returns the current simulation time.
     */
    public abstract double getCurrentSimulationTime();

}
