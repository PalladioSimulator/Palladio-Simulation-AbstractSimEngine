package de.uka.ipd.sdq.simulation.abstractsimengine;

/**
 * @author Steffen Becker (this code has been factored out from SimuCom)
 * @author Philipp Merkle
 * 
 * @param <M>
 *            the type of the simulation model
 * @param <E>
 *            the type of the entity which is modified by this event
 * @see ISimEvent
 */
public abstract class AbstractSimEventDelegator<E extends IEntity> extends SimulationElement implements ISimEvent<E>, ISimRunnable<E> {

    /**
     * the delegate has the simulation-library-specific knowledge of how this event can be scheduled
     * or removed from the event list. The delegate, however, is not aware of the simulation logic
     * associated with this event, which is why it invokes the <code>eventRoutine</code> method
     * whenever the event is to be executed.
     */
    private ISimEvent<E> delegate;

    protected AbstractSimEventDelegator(ISimulationModel model, String name) {
        super(model, name);
        delegate = model.getSimEngineFactory().createSimEvent(this, name);
    }

    /**
     * {@inheritDoc}
     */
    public void schedule(E entity, double delay) {
        // delegate the method call
        delegate.schedule(entity, delay);
    }

    /**
     * {@inheritDoc}
     */
    public void removeEvent() {
        // delegate the method call
        delegate.removeEvent();
    }

    /**
     * {@inheritDoc}
     */
    public double scheduledAtTime() {
        return delegate.scheduledAtTime();
    }

}
