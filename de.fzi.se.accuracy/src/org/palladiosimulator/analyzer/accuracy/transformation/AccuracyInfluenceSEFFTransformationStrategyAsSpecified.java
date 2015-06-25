/**
 *
 */
package org.palladiosimulator.analyzer.accuracy.transformation;

import de.fzi.se.quality.qualityannotation.REPrecision;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.runconfig.AccuracyInfluenceAnalysisState;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.InternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall;
import org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand;
import org.palladiosimulator.pcm.seff.seff_performance.ResourceCall;

/**
 * Implementing the transformation of given SEFFs for the state
 * {@link AccuracyInfluenceAnalysisState#AS_SPECIFIED}. Start the transformation by
 * invoking {@link #doSwitch(org.eclipse.emf.ecore.EObject)} with a parameter of
 * type {@link ServiceEffectSpecification}.
 *
 * @author groenda
 *
 */
public class AccuracyInfluenceSEFFTransformationStrategyAsSpecified extends
		AbstractAccuracyInfluenceSEFFTransformationStrategy {

	/**Create a new instance using the given quality annotations.
	 * @param pcmPartition Partition containing the quality annotations.
	 */
	public AccuracyInfluenceSEFFTransformationStrategyAsSpecified(
			PCMResourceSetPartition pcmPartition) {
		super(pcmPartition);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyComponentExternalCall(org.palladiosimulator.pcm.seff.ExternalCallAction, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyComponentExternalCall(ExternalCallAction call,
			REPrecision precision) {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyComponentInternalCall(org.palladiosimulator.pcm.seff.InternalCallAction, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyComponentInternalCall(InternalCallAction call,
			REPrecision precision) {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyInfrastructureCall(org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyInfrastructureCall(InfrastructureCall call,
			REPrecision precision) {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyResourceCall(org.palladiosimulator.pcm.seff.seff_performance.ResourceCall, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyResourceCall(ResourceCall call, REPrecision precision) {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyResourceDemand(org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyResourceDemand(ParametricResourceDemand demand,
			REPrecision precision) {
		// nothing to do
	}
}
