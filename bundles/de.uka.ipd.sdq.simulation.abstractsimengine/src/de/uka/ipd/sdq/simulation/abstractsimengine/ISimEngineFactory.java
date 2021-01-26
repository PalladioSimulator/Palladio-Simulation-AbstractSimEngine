package de.uka.ipd.sdq.simulation.abstractsimengine;

public interface ISimEngineFactory extends ISimEventFactory {

    public void setModel(ISimulationModel model);

    public ISimulationControl createSimulationControl();

    public ISimProcess createSimProcess(AbstractSimProcessDelegator myProcess, String name);

    public IEntity createEntity(AbstractSimEntityDelegator e, String name);

}
