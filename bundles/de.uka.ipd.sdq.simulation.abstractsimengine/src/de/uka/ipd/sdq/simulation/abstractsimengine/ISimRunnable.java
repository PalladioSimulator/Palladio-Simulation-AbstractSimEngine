package de.uka.ipd.sdq.simulation.abstractsimengine;

/**
 * This interface captures a runnable which is triggered by a simulation event.
 * 
 * It has been factored out from {@link AbstractSimEventDelegator} in an effort to reduce the
 * required coupling between simulation entity {@link IEntity} and simulation event
 * {@link ISimEvent}.
 * 
 * @author Sebastian Krach
 *
 * @param <E>
 */
@FunctionalInterface
public interface ISimRunnable<E extends IEntity> {

    /**
     * Executes the simulation logic associated with this event.
     * <p>
     * Notice, that this method is not intended to be called by clients. Instead, the event
     * scheduler of the respective simulation library invokes this method as soon as the simulation
     * is reached at which the event has been scheduled.
     * 
     * @param who
     *            the entity associated with this event
     */
    void eventRoutine(E who);

}
