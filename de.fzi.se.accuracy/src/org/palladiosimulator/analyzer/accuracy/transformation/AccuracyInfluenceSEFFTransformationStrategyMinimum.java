/**
 *
 */
package org.palladiosimulator.analyzer.accuracy.transformation;

import org.apache.log4j.Logger;

import de.fzi.se.quality.qualityannotation.NoPrecision;
import de.fzi.se.quality.qualityannotation.REPrecision;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.runconfig.AccuracyInfluenceAnalysisState;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.seff.CallAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.InternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall;
import org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand;
import org.palladiosimulator.pcm.seff.seff_performance.ResourceCall;

/**
 * Implementing the transformation of given SEFFs for the state
 * {@link AccuracyInfluenceAnalysisState#MINIMUM}. Start the transformation by
 * invoking {@link #doSwitch(org.eclipse.emf.ecore.EObject)} with a parameter of
 * type {@link ServiceEffectSpecification}.
 *
 * @author groenda
 *
 */
public class AccuracyInfluenceSEFFTransformationStrategyMinimum extends
		AbstractAccuracyInfluenceSEFFTransformationStrategy {
	/** Logger for this class. */
	private static final Logger LOGGER = Logger.getLogger(AccuracyInfluenceSEFFTransformationStrategyMinimum.class);

	/** Transformation of the specification of {@link PCMRandomVariable} for the minimum of a precision. */
	private final PCMRandomVariableSpecificationAccuracyMinimumTrafo randomVariableMinimumTrafo = new PCMRandomVariableSpecificationAccuracyMinimumTrafo();
	/** Returns the minimum value for a validation precision and provided absolute value. */
	private final ValidationPrecisionToMinimumLongValue precisionMinimalValue = new ValidationPrecisionToMinimumLongValue();

	/**Create a new instance using the given quality annotations.
	 * @param pcmPartition Partition containing the quality annotations.
	 */
	public AccuracyInfluenceSEFFTransformationStrategyMinimum(final PCMResourceSetPartition pcmPartition) {
		super(pcmPartition);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyComponentExternalCall(org.palladiosimulator.pcm.seff.ExternalCallAction, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyComponentExternalCall(ExternalCallAction call,
			REPrecision precision) {
		// Call Parameters for an CallAction
		handleInputParametersOfCallAction(call, precision);
		// Number of Calls for an AbstractAction
		precisionMinimalValue.setAbsoluteValue(1l);
		long min = precisionMinimalValue.doSwitch(precision.getDefaultPrecisionNumberOfCalls());
		if (min < 1) {
			//remove action from control flow
			call.getPredecessor_AbstractAction().setSuccessor_AbstractAction(call.getSuccessor_AbstractAction());
		}
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyComponentInternalCall(org.palladiosimulator.pcm.seff.InternalCallAction, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyComponentInternalCall(InternalCallAction call,
			REPrecision precision) {
		// Call Parameters for an CallAction
		handleInputParametersOfCallAction(call, precision);
		// Number of Calls for an AbstractAction
		precisionMinimalValue.setAbsoluteValue(1l);
		long min = precisionMinimalValue.doSwitch(precision.getDefaultPrecisionNumberOfCalls());
		if (min < 1) {
			//remove action from control flow
			call.getPredecessor_AbstractAction().setSuccessor_AbstractAction(call.getSuccessor_AbstractAction());
		}
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyInfrastructureCall(org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyInfrastructureCall(InfrastructureCall call,
			REPrecision precision) {
		// Number of Calls
		randomVariableMinimumTrafo.setModifiedVariable(call.getNumberOfCalls__InfrastructureCall());
		randomVariableMinimumTrafo.setLowerLimit("0");
		randomVariableMinimumTrafo.doSwitch(precision.getDefaultPrecisionNumberOfCalls());
		// Call Parameters
		handleInputParametersOfCallAction(call, precision);
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyResourceCall(org.palladiosimulator.pcm.seff.seff_performance.ResourceCall, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyResourceCall(ResourceCall call, REPrecision precision) {
		// Number of Calls
		randomVariableMinimumTrafo.setModifiedVariable(call.getNumberOfCalls__ResourceCall());
		randomVariableMinimumTrafo.setLowerLimit("0");
		randomVariableMinimumTrafo.doSwitch(precision.getDefaultPrecisionNumberOfCalls());
		// Call Parameters
		for (VariableUsage variableUsage : call.getInputVariableUsages__CallAction()) {
			for (VariableCharacterisation varChar : variableUsage.getVariableCharacterisation_VariableUsage()) {
				randomVariableMinimumTrafo.setModifiedVariable(varChar.getSpecification_VariableCharacterisation());
				randomVariableMinimumTrafo.doSwitch(precision.getDefaultPrecisionCallParameter());
			}
		}
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractAccuracyInfluenceSEFFTransformationStrategy#modifyResourceDemand(org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand, de.fzi.se.quality.qualityannotation.REPrecision)
	 */
	@Override
	protected void modifyResourceDemand(ParametricResourceDemand demand,
			REPrecision precision) {
		// Number of Calls
		randomVariableMinimumTrafo.setModifiedVariable(demand.getSpecification_ParametericResourceDemand());
		randomVariableMinimumTrafo.setLowerLimit("0");
		randomVariableMinimumTrafo.doSwitch(precision.getDefaultPrecisionNumberOfCalls());
		// Call Parameters
		if (!(precision.getDefaultPrecisionCallParameter() instanceof NoPrecision)) {
			String msg = "A ResourceDemand has no parameters. The default precision for call parameters must be set to NoPrecision.";
			LOGGER.error(msg);
			throw new IllegalArgumentException(msg);
		}
	}

	/**Handles the transformation for input parameters of call actions.
	 * @param call Call action to transform.
	 * @param precision Precision.
	 */
	private void handleInputParametersOfCallAction(CallAction call,
			REPrecision precision) {
		for (VariableUsage variableUsage : call.getInputVariableUsages__CallAction()) {
			for (VariableCharacterisation varChar : variableUsage.getVariableCharacterisation_VariableUsage()) {
				randomVariableMinimumTrafo.setModifiedVariable(varChar.getSpecification_VariableCharacterisation());
				randomVariableMinimumTrafo.doSwitch(precision.getDefaultPrecisionCallParameter());
			}
		}
	}

}
