package de.uka.ipd.sdq.simulation.abstractsimengine.processes;

public class SimProcessThreadingStrategy extends AbstractSimProcessSemaphoreStrategy {
    private Thread myThread = null;

	@Override
	protected void doStartProcess(Runnable myRunnable) {
        this.myThread = new Thread(myRunnable);
        this.myThread.start();
	}
}
