package de.uka.ipd.sdq.simulation.abstractsimengine;

public interface ISimEventFactory {
    
    public <E extends IEntity> ISimEvent<E> createSimEvent(ISimRunnable<E> myEvent, String name);

}
