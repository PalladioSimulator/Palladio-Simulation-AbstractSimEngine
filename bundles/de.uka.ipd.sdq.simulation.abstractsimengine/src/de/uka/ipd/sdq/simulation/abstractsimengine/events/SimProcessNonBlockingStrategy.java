package de.uka.ipd.sdq.simulation.abstractsimengine.events;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.simulation.abstractsimengine.processes.ISimProcessStrategy;


/** SimProcessNonBlockingStrategy is an ISimProcessStrategy which is thread-free, meaning 
 * that it does not associate a thread for a simulated process. This is a wrapper class
 * to enable event-based simulation on a thread-based designed framework. 
 * 
 * @author Floriment Klinaku
 *
 */
public class SimProcessNonBlockingStrategy implements ISimProcessStrategy {
	
	private static final Logger LOGGER = Logger.getLogger(SimProcessNonBlockingStrategy.class);
	
	@Override
	public void suspendProcess() {
		LOGGER.info("Suspend PROCESS CALLED - DEMAND IS PROCESSED");
	}
	
	/**
	 *@param myRunnable is ignored
	 */
	@Override
	public void startProcess(Runnable myRunnable) {
		LOGGER.info("Start PROCESS CALLED - DEMAND IS PROCESSED");	
	}
	
	@Override
	public void resumeProcess() {
		// TODO Filled in later 
		LOGGER.info("RESUME PROCESS CALLED - DEMAND IS PROCESSED");
	}
	
	@Override
	public void finishProcess() {
		LOGGER.info("Finish PROCESS CALLED - DEMAND IS PROCESSED");
	}

}
