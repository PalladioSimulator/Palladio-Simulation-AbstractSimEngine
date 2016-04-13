package de.uka.ipd.sdq.simulation.abstractsimengine.processes;

import co.paralleluniverse.strands.SuspendableRunnable;

public interface ISimProcessStrategy {

    public abstract void startProcess(SuspendableRunnable myRunnable);

    public abstract void resumeProcess();

    public abstract void finishProcess();

    public abstract void suspendProcess();

}