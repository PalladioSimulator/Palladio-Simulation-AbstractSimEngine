package de.uka.ipd.sdq.simulation.abstractsimengine.processes;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.strands.SuspendableRunnable;

public class ProcessRunnable implements SuspendableRunnable {

    private static final long serialVersionUID = -430931043865278203L;

    /**
     * 
     */
    private final SimulatedProcess simulatedProcess;

    /**
     * @param simulatedProcess
     */
    ProcessRunnable(SimulatedProcess simulatedProcess) {
        this.simulatedProcess = simulatedProcess;
    }


    @Override
    public void run() throws SuspendExecution {
        if (SimulatedProcess.LOGGER.isDebugEnabled()) {
            SimulatedProcess.LOGGER.debug("Starting sim process [ID: " + this.simulatedProcess.getAbstractProcess().getId() + "]");
        }
        this.simulatedProcess.actions();
        // SSJSimProcess.this.processStrategy = null;
        if (SimulatedProcess.LOGGER.isDebugEnabled()) {
            SimulatedProcess.LOGGER.debug("Sim process ended [ID: " + this.simulatedProcess.getAbstractProcess().getId() + "]");
        }
    }
}