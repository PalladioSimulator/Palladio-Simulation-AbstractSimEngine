package de.uka.ipd.sdq.reliability.solver.runconfig;

import org.eclipse.debug.core.ILaunch;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.analyzer.workflow.jobs.PCMWorkflowJobBuilder;

import de.uka.ipd.sdq.pcmsolver.runconfig.PCMSolverWorkflowRunConfiguration;
import de.uka.ipd.sdq.workflow.jobs.IJob;

/**
 * This class creates a workflow for a PCM reliability analysis.
 * 
 * The top-level job of this workflow is the PCMSolverReliabilityJob.
 * 
 * @author brosch
 * 
 */
public class ReliabilityWorkflowJobBuilder extends PCMWorkflowJobBuilder {

    /**
     * Eclipse launch object which is passed to the top-level job.
     */
    private ILaunch launch;

    /**
     * The constructor.
     * 
     * @param launch
     *            the launch object
     */
    public ReliabilityWorkflowJobBuilder(ILaunch launch) {
        this.launch = launch;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.analyzer.workflow.jobs.PCMWorkflowJobBuilder#buildJob(de.uka
     * .ipd.sdq.workflow.pcm.configurations.AbstractPCMWorkflowRunConfiguration)
     */
    public IJob buildJob(AbstractPCMWorkflowRunConfiguration config) {
        return new PCMSolverReliabilityJob((PCMSolverWorkflowRunConfiguration) config, launch);
    }

}
