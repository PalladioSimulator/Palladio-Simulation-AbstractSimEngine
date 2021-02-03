package de.uka.ipd.sdq.simulation.abstractsimengine;

/**
 * This interface provides capabilities to access the current simulation time.
 * 
 * It has been factored out from {@link ISimulationControl} in an effort to slim down interfaces.
 * 
 * @author Sebastian Krach
 *
 */
public interface ISimulationTimeProvider {
    
    /**
     * Returns the current simulation time.
     */
    public abstract double getCurrentSimulationTime();

}
