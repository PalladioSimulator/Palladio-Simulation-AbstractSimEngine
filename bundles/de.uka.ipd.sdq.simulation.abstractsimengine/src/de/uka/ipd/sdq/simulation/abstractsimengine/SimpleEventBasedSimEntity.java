package de.uka.ipd.sdq.simulation.abstractsimengine;

import java.util.Optional;

/**
 * A simplified version of {@link AbstractSimEntityDelegator}.
 * 
 * The entity supports re-occuring schedules. After being activated, the entityRouting is executed
 * at the specified initialDelay. If the entity should be rescheduled, the entityRoutine needs to
 * return the amount of time to the next occurence.
 * 
 * @author Sebastian Krach
 */
public abstract class SimpleEventBasedSimEntity implements IEntity {
    private Optional<ISimEvent<SimpleEventBasedSimEntity>> entityEvent = Optional.empty();

    private final ISimEventFactory eventFactory;
    private final String name;

    protected SimpleEventBasedSimEntity(ISimEventFactory eventFactory, String name) {
        this.eventFactory = eventFactory;
        this.name = name;
    }

    @Override
    public boolean isScheduled() {
        return entityEvent.isPresent();
    }
    
    public Optional<Double> getNextOccurence() {
        return entityEvent.map(ISimEvent::scheduledAtTime);
    }

    public void activate(double initialDelay) {
        entityEvent = Optional.of(eventFactory.createSimEvent(this::eventRoutine, name));
        entityEvent.get().schedule(this, initialDelay);
    }
    
    @Override
    public void reschedule(double d) {
        if (entityEvent.isEmpty()) {
            activate(d);
        } else {
            entityEvent.get().schedule(this, d);
        }
    }
    
    public void unschedule() {
        if (entityEvent.isPresent()) {
            entityEvent.get().removeEvent();
            entityEvent = Optional.empty();
        }
    }

    private void eventRoutine(SimpleEventBasedSimEntity e) {
        entityRoutine().ifPresentOrElse(this::reschedule, () -> SimpleEventBasedSimEntity.this.entityEvent = null);
    }

    abstract protected Optional<Double> entityRoutine();

}
