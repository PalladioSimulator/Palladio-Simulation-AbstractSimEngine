/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartitionInterval;
import org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartitionRange;
import org.palladiosimulator.analyzer.quality.qualityannotation.ExactlyAsSpecifiedPrecision;
import org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation;
import org.palladiosimulator.analyzer.quality.qualityannotation.LimitedDeviationPrecision;
import org.palladiosimulator.analyzer.quality.qualityannotation.NoPrecision;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMPEAllDecisions;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMPEDecision;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMParameterPartition;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMRECIBehavior;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMRECategory;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREInfrastructureInterface;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREInfrastructureRole;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREInfrastructureSignature;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREInterface;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMRERequestCategory;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREResource;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREResourceInterface;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREResourceRole;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMREResourceSignature;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMRERole;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMRESignature;
import org.palladiosimulator.analyzer.quality.qualityannotation.PCMServiceSpecification;
import org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotation;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationFactory;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;
import org.palladiosimulator.analyzer.quality.qualityannotation.REPrecision;
import org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class QualityAnnotationFactoryImpl extends EFactoryImpl implements QualityAnnotationFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static QualityAnnotationFactory init() {
        try {
            final QualityAnnotationFactory theQualityAnnotationFactory = (QualityAnnotationFactory) EPackage.Registry.INSTANCE
                    .getEFactory(QualityAnnotationPackage.eNS_URI);
            if (theQualityAnnotationFactory != null) {
                return theQualityAnnotationFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new QualityAnnotationFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public QualityAnnotationFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case QualityAnnotationPackage.PARAMETER_VALUE_DEVIATION:
            return this.createParameterValueDeviation();
        case QualityAnnotationPackage.QUALITY_ANNOTATION:
            return this.createQualityAnnotation();
        case QualityAnnotationPackage.REQUIRED_ELEMENT_DEVIATION:
            return this.createRequiredElementDeviation();
        case QualityAnnotationPackage.INTERNAL_STATE_INFLUENCE_ANALYSIS_AGGREGATION:
            return this.createInternalStateInfluenceAnalysisAggregation();
        case QualityAnnotationPackage.RE_PRECISION:
            return this.createREPrecision();
        case QualityAnnotationPackage.PCM_PARAMETER_PARTITION:
            return this.createPCMParameterPartition();
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_INTERVAL:
            return this.createCharacterisedPCMParameterPartitionInterval();
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE:
            return this.createCharacterisedPCMParameterPartitionRange();
        case QualityAnnotationPackage.EXACTLY_AS_SPECIFIED_PRECISION:
            return this.createExactlyAsSpecifiedPrecision();
        case QualityAnnotationPackage.LIMITED_DEVIATION_PRECISION:
            return this.createLimitedDeviationPrecision();
        case QualityAnnotationPackage.NO_PRECISION:
            return this.createNoPrecision();
        case QualityAnnotationPackage.PCMRE_CATEGORY:
            return this.createPCMRECategory();
        case QualityAnnotationPackage.PCMRE_INTERFACE:
            return this.createPCMREInterface();
        case QualityAnnotationPackage.PCMRE_ROLE:
            return this.createPCMRERole();
        case QualityAnnotationPackage.PCMRE_SIGNATURE:
            return this.createPCMRESignature();
        case QualityAnnotationPackage.PCM_SERVICE_SPECIFICATION:
            return this.createPCMServiceSpecification();
        case QualityAnnotationPackage.PCMRE_RESOURCE_INTERFACE:
            return this.createPCMREResourceInterface();
        case QualityAnnotationPackage.PCMRE_RESOURCE_SIGNATURE:
            return this.createPCMREResourceSignature();
        case QualityAnnotationPackage.PCMRE_RESOURCE:
            return this.createPCMREResource();
        case QualityAnnotationPackage.PCMRE_RESOURCE_ROLE:
            return this.createPCMREResourceRole();
        case QualityAnnotationPackage.PCMRECI_BEHAVIOR:
            return this.createPCMRECIBehavior();
        case QualityAnnotationPackage.PCMRE_INFRASTRUCTURE_INTERFACE:
            return this.createPCMREInfrastructureInterface();
        case QualityAnnotationPackage.PCMRE_INFRASTRUCTURE_ROLE:
            return this.createPCMREInfrastructureRole();
        case QualityAnnotationPackage.PCMRE_INFRASTRUCTURE_SIGNATURE:
            return this.createPCMREInfrastructureSignature();
        case QualityAnnotationPackage.PCMPE_ALL_DECISIONS:
            return this.createPCMPEAllDecisions();
        case QualityAnnotationPackage.PCMPE_DECISION:
            return this.createPCMPEDecision();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case QualityAnnotationPackage.PCMRE_REQUEST_CATEGORY:
            return this.createPCMRERequestCategoryFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case QualityAnnotationPackage.PCMRE_REQUEST_CATEGORY:
            return this.convertPCMRERequestCategoryToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ParameterValueDeviation createParameterValueDeviation() {
        final ParameterValueDeviationImpl parameterValueDeviation = new ParameterValueDeviationImpl();
        return parameterValueDeviation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public QualityAnnotation createQualityAnnotation() {
        final QualityAnnotationImpl qualityAnnotation = new QualityAnnotationImpl();
        return qualityAnnotation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public RequiredElementDeviation createRequiredElementDeviation() {
        final RequiredElementDeviationImpl requiredElementDeviation = new RequiredElementDeviationImpl();
        return requiredElementDeviation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public InternalStateInfluenceAnalysisAggregation createInternalStateInfluenceAnalysisAggregation() {
        final InternalStateInfluenceAnalysisAggregationImpl internalStateInfluenceAnalysisAggregation = new InternalStateInfluenceAnalysisAggregationImpl();
        return internalStateInfluenceAnalysisAggregation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public REPrecision createREPrecision() {
        final REPrecisionImpl rePrecision = new REPrecisionImpl();
        return rePrecision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMParameterPartition createPCMParameterPartition() {
        final PCMParameterPartitionImpl pcmParameterPartition = new PCMParameterPartitionImpl();
        return pcmParameterPartition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CharacterisedPCMParameterPartitionInterval createCharacterisedPCMParameterPartitionInterval() {
        final CharacterisedPCMParameterPartitionIntervalImpl characterisedPCMParameterPartitionInterval = new CharacterisedPCMParameterPartitionIntervalImpl();
        return characterisedPCMParameterPartitionInterval;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CharacterisedPCMParameterPartitionRange createCharacterisedPCMParameterPartitionRange() {
        final CharacterisedPCMParameterPartitionRangeImpl characterisedPCMParameterPartitionRange = new CharacterisedPCMParameterPartitionRangeImpl();
        return characterisedPCMParameterPartitionRange;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExactlyAsSpecifiedPrecision createExactlyAsSpecifiedPrecision() {
        final ExactlyAsSpecifiedPrecisionImpl exactlyAsSpecifiedPrecision = new ExactlyAsSpecifiedPrecisionImpl();
        return exactlyAsSpecifiedPrecision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public LimitedDeviationPrecision createLimitedDeviationPrecision() {
        final LimitedDeviationPrecisionImpl limitedDeviationPrecision = new LimitedDeviationPrecisionImpl();
        return limitedDeviationPrecision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NoPrecision createNoPrecision() {
        final NoPrecisionImpl noPrecision = new NoPrecisionImpl();
        return noPrecision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMRECategory createPCMRECategory() {
        final PCMRECategoryImpl pcmreCategory = new PCMRECategoryImpl();
        return pcmreCategory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREInterface createPCMREInterface() {
        final PCMREInterfaceImpl pcmreInterface = new PCMREInterfaceImpl();
        return pcmreInterface;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMRERole createPCMRERole() {
        final PCMRERoleImpl pcmreRole = new PCMRERoleImpl();
        return pcmreRole;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMRESignature createPCMRESignature() {
        final PCMRESignatureImpl pcmreSignature = new PCMRESignatureImpl();
        return pcmreSignature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMServiceSpecification createPCMServiceSpecification() {
        final PCMServiceSpecificationImpl pcmServiceSpecification = new PCMServiceSpecificationImpl();
        return pcmServiceSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREResourceInterface createPCMREResourceInterface() {
        final PCMREResourceInterfaceImpl pcmreResourceInterface = new PCMREResourceInterfaceImpl();
        return pcmreResourceInterface;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREResourceSignature createPCMREResourceSignature() {
        final PCMREResourceSignatureImpl pcmreResourceSignature = new PCMREResourceSignatureImpl();
        return pcmreResourceSignature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREResource createPCMREResource() {
        final PCMREResourceImpl pcmreResource = new PCMREResourceImpl();
        return pcmreResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREResourceRole createPCMREResourceRole() {
        final PCMREResourceRoleImpl pcmreResourceRole = new PCMREResourceRoleImpl();
        return pcmreResourceRole;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMRECIBehavior createPCMRECIBehavior() {
        final PCMRECIBehaviorImpl pcmreciBehavior = new PCMRECIBehaviorImpl();
        return pcmreciBehavior;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREInfrastructureInterface createPCMREInfrastructureInterface() {
        final PCMREInfrastructureInterfaceImpl pcmreInfrastructureInterface = new PCMREInfrastructureInterfaceImpl();
        return pcmreInfrastructureInterface;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREInfrastructureRole createPCMREInfrastructureRole() {
        final PCMREInfrastructureRoleImpl pcmreInfrastructureRole = new PCMREInfrastructureRoleImpl();
        return pcmreInfrastructureRole;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMREInfrastructureSignature createPCMREInfrastructureSignature() {
        final PCMREInfrastructureSignatureImpl pcmreInfrastructureSignature = new PCMREInfrastructureSignatureImpl();
        return pcmreInfrastructureSignature;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMPEAllDecisions createPCMPEAllDecisions() {
        final PCMPEAllDecisionsImpl pcmpeAllDecisions = new PCMPEAllDecisionsImpl();
        return pcmpeAllDecisions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PCMPEDecision createPCMPEDecision() {
        final PCMPEDecisionImpl pcmpeDecision = new PCMPEDecisionImpl();
        return pcmpeDecision;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public PCMRERequestCategory createPCMRERequestCategoryFromString(final EDataType eDataType,
            final String initialValue) {
        final PCMRERequestCategory result = PCMRERequestCategory.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertPCMRERequestCategoryToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public QualityAnnotationPackage getQualityAnnotationPackage() {
        return (QualityAnnotationPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static QualityAnnotationPackage getPackage() {
        return QualityAnnotationPackage.eINSTANCE;
    }

} // QualityAnnotationFactoryImpl
