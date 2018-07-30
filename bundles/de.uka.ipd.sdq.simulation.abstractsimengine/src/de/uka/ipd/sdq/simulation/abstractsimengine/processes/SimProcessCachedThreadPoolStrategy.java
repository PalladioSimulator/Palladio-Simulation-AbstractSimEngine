package de.uka.ipd.sdq.simulation.abstractsimengine.processes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimProcessCachedThreadPoolStrategy extends AbstractSimProcessSemaphoreStrategy {
	private static ExecutorService executorService = Executors.newCachedThreadPool();

	@Override
	protected void doStartProcess(Runnable myRunnable) {
		executorService.submit(myRunnable);	
	}

}
