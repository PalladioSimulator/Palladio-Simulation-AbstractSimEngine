package de.fzi.se.accuracy.jobs;

import org.eclipse.core.runtime.CoreException;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.analyzer.workflow.jobs.PCMWorkflowJobBuilder;
import org.palladiosimulator.analyzer.workflow.runconfig.AccuracyInfluenceAnalysisState;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**Job to execute accuracy influence analyses.
 *
 * @author groenda
 *
 */
public class AccuracyInfluenceAnalysisJob
extends SequentialBlackboardInteractingJob<MDSDBlackboard>
implements IBlackboardInteractingJob<MDSDBlackboard> {

	/**Creates a new accuracy influence analysis job.
	 * Such a job consists of a set of 'normal' analyses.
	 * @param config Configuration.
	 * @param jobBuilder Builder for newly created sub-jobs.
	 * @throws CoreException On error.
	 */
	public AccuracyInfluenceAnalysisJob(
			AbstractPCMWorkflowRunConfiguration config,
			PCMWorkflowJobBuilder jobBuilder) throws CoreException {
		super(true);
		if (config.isAccuracyInfluenceAnalysisEnabled()) {
			ShowAccuracyInfluenceAnalysisErrorsJob issuesJob = new ShowAccuracyInfluenceAnalysisErrorsJob(config);
			config.setAccuracyInfluenceIssueReceivingJob(issuesJob);
			AbstractPCMWorkflowRunConfiguration newConfig;
			for (AccuracyInfluenceAnalysisState state : AccuracyInfluenceAnalysisState.values()) {
				newConfig = config.getClone();
				newConfig.setAccuracyInfluenceAnalysisState(state);
				this.add(jobBuilder.buildJob(newConfig));
			}
			// display accuracy influence analysis issues
			this.add(issuesJob);
		}  else {
			this.add(jobBuilder.buildJob(config));
		}
	}
}
