package de.uka.ipd.sdq.simulation.abstractsimengine.desmoj;

import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractSimEntityDelegator;
import de.uka.ipd.sdq.simulation.abstractsimengine.IEntity;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimEvent;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimRunnable;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Entity;
import desmoj.core.simulator.TimeSpan;

/**
 * @author Steffen Becker
 * @author Philipp Merkle
 */
public class DesmoJSimEvent<E extends IEntity> extends Event<Entity> implements ISimEvent<E> {

    private final ISimRunnable<E> event;
    private final Entity anonymousEntity;

    public DesmoJSimEvent(final ISimRunnable<E> event, final DesmoJModel owner, final String name) {
        super(owner, name, false);
        this.event = event;
        this.anonymousEntity = new Entity(owner, "Anonymous Entity", false) {};
    }

    /**
     * The event handler, which is called by DESMO-J when an event occurred.
     * <p>
     * {@inheritDoc}
     *
     * @see Event#eventRoutine(desmoj.core.simulator.Entity)
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eventRoutine(final Entity who) {
        E entity = null;
        if (who != null && who instanceof DesmoJEntity) {
            // delegate the event handling to the encapsulated event
            entity = (E) ((DesmoJEntity)who).getEncapsulatedEntity();
        }
        this.event.eventRoutine(entity);
    }

    @Override
    public void schedule(final E entity, final double delay) {
        Entity desmoJEntity = anonymousEntity;
        if (entity != null && entity instanceof AbstractSimEntityDelegator) {
            final AbstractSimEntityDelegator simEntity = (AbstractSimEntityDelegator) entity;
            desmoJEntity = (Entity) simEntity.getEncapsulatedEntity();
        }
        this.schedule(desmoJEntity, new TimeSpan(delay));
    }

    @Override
    public void removeEvent() {
        if (this.isScheduled()) {
            this.cancel();
        }
    }

    @Override
    public double scheduledAtTime() {
        return this.scheduledNext().getTimeAsDouble();
    }

}
