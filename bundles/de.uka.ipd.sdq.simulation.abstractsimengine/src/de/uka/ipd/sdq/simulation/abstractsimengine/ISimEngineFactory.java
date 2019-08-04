package de.uka.ipd.sdq.simulation.abstractsimengine;

import de.uka.ipd.sdq.simulation.abstractsimengine.processes.ISimProcessStrategy;

public interface ISimEngineFactory {

    public void setModel(ISimulationModel model);

    public ISimulationControl createSimulationControl();

    public ISimProcess createSimProcess(AbstractSimProcessDelegator myProcess, String name);

    public ISimProcess createSimProcess(AbstractSimProcessDelegator myProcess, String name, ISimProcessStrategy processStrategy);
    
    public <E extends IEntity> ISimEvent<E> createSimEvent(AbstractSimEventDelegator<E> myEvent, String name);

    public IEntity createEntity(AbstractSimEntityDelegator e, String name);

}
