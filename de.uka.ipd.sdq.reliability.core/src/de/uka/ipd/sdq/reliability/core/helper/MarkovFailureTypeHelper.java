package de.uka.ipd.sdq.reliability.core.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.qosannotations.QoSAnnotations;
import org.palladiosimulator.pcm.qosannotations.SpecifiedQoSAnnotation;
import org.palladiosimulator.pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation;
import org.palladiosimulator.pcm.reliability.ExternalFailureOccurrenceDescription;
import org.palladiosimulator.pcm.reliability.FailureType;
import org.palladiosimulator.pcm.reliability.HardwareInducedFailureType;
import org.palladiosimulator.pcm.reliability.InternalFailureOccurrenceDescription;
import org.palladiosimulator.pcm.reliability.NetworkInducedFailureType;
import org.palladiosimulator.pcm.reliability.SoftwareInducedFailureType;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.resourcetype.CommunicationLinkResourceType;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.system.System;
import de.uka.ipd.sdq.reliability.core.MarkovEvaluationType;
import de.uka.ipd.sdq.reliability.core.MarkovFailureType;
import de.uka.ipd.sdq.reliability.core.MarkovHardwareInducedFailureType;
import de.uka.ipd.sdq.reliability.core.MarkovNetworkInducedFailureType;
import de.uka.ipd.sdq.reliability.core.MarkovResourceTimeoutFailureType;
import de.uka.ipd.sdq.reliability.core.MarkovSoftwareInducedFailureType;

/**
 * This class provides auxiliary functionality for managing MarkovFailureTypes.
 * 
 * @author brosch
 * 
 */
public class MarkovFailureTypeHelper {

    /**
     * Provides EMF utility functions.
     */
    private EMFHelper helper = new EMFHelper();

    /**
     * Retrieves a list of potential failure types from a given PCM model instance.
     * 
     * @param evaluationType
     *            the degree of differentiation between failure types
     * @param repositories
     *            the list of PCm Repository models
     * @param environment
     *            the PCM ResourceEnvironment model
     * @param system
     *            the PCM System model
     * @return the list of potential failure types
     */
    public List<MarkovFailureType> getFailureTypes(final MarkovEvaluationType evaluationType,
            final List<Repository> repositories, final ResourceEnvironment environment, final System system) {
        List<MarkovFailureType> failureTypes = getNetworkFailureTypes(evaluationType, environment, system);
        failureTypes.addAll(getHardwareFailureTypes(evaluationType, environment, system));
        failureTypes.addAll(getResourceTimeoutFailureTypes(evaluationType, system));
        failureTypes.addAll(getSoftwareFailureTypes(evaluationType, repositories, system));
        return removeDoubleFailureTypes(failureTypes);

    }

    /**
     * Retrieves the list of processing resource failure types from the given PCM model.
     * 
     * @param evaluationType
     *            the degree of differentiation between failure types
     * @param environment
     *            the PCM Resource Environment model
     * @param system
     *            the PCM System model
     * @return the list of processing resource failure types
     */
    private List<MarkovFailureType> getHardwareFailureTypes(final MarkovEvaluationType evaluationType,
            final ResourceEnvironment environment, final System system) {

        // Initialize the list of results:
        ArrayList<MarkovFailureType> resultList = new ArrayList<MarkovFailureType>();

        // Handle the PCM resource environment model:
        for (ResourceContainer container : environment.getResourceContainer_ResourceEnvironment()) {
            for (ProcessingResourceSpecification specification : container
                    .getActiveResourceSpecifications_ResourceContainer()) {
                ProcessingResourceType resourceType = specification.getActiveResourceType_ActiveResourceSpecification();
                resultList.add(MarkovHardwareInducedFailureType.createInternalFailureType(evaluationType, container,
                        resourceType));
            }
        }

        // Handle the PCM system model:
        for (QoSAnnotations qos : system.getQosAnnotations_System()) {
            for (SpecifiedQoSAnnotation annotation : qos.getSpecifiedQoSAnnotations_QoSAnnotations()) {
                if (annotation instanceof SpecifiedReliabilityAnnotation) {
                    SpecifiedReliabilityAnnotation relAnnotation = ((SpecifiedReliabilityAnnotation) annotation);
                    for (ExternalFailureOccurrenceDescription description : relAnnotation
                            .getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()) {
                        FailureType failureType = description.getFailureType__ExternalFailureOccurrenceDescription();
                        if (failureType instanceof HardwareInducedFailureType) {
                            HardwareInducedFailureType hardwareFailureType = ((HardwareInducedFailureType) failureType);
                            resultList.add(MarkovHardwareInducedFailureType.createExternalFailureType(evaluationType,
                                    hardwareFailureType.getProcessingResourceType__HardwareInducedFailureType(),
                                    annotation.getSignature_SpecifiedQoSAnnation(), annotation
                                            .getRole_SpecifiedQoSAnnotation(), ((OperationRequiredRole) annotation
                                            .getRole_SpecifiedQoSAnnotation())
                                            .getRequiredInterface__OperationRequiredRole()));
                        }
                    }
                }
            }
        }

        // Return the result:
        return resultList;
    }

    /**
     * Retrieves the list of communication failure types from the given PCM model.
     * 
     * @param evaluationType
     *            the degree of differentiation between failure types
     * @param environment
     *            the PCM Resource Environment model
     * @param system
     *            the PCM System model
     * @return the list of communication resource failure types
     */
    private List<MarkovFailureType> getNetworkFailureTypes(final MarkovEvaluationType evaluationType,
            final ResourceEnvironment environment, final System system) {

        // Initialize the list of results:
        ArrayList<MarkovFailureType> resultList = new ArrayList<MarkovFailureType>();

        // Handle the PCM resource environment model:
        for (LinkingResource commLink : environment.getLinkingResources__ResourceEnvironment()) {
            CommunicationLinkResourceSpecification specification = commLink
                    .getCommunicationLinkResourceSpecifications_LinkingResource();
            CommunicationLinkResourceType resourceType = specification
                    .getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
            resultList.add(MarkovNetworkInducedFailureType.createInternalFailureType(evaluationType, commLink,
                    resourceType));
        }

        // Handle the PCM system model:
        for (QoSAnnotations qos : system.getQosAnnotations_System()) {
            for (SpecifiedQoSAnnotation annotation : qos.getSpecifiedQoSAnnotations_QoSAnnotations()) {
                if (annotation instanceof SpecifiedReliabilityAnnotation) {
                    SpecifiedReliabilityAnnotation relAnnotation = ((SpecifiedReliabilityAnnotation) annotation);
                    for (ExternalFailureOccurrenceDescription description : relAnnotation
                            .getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()) {
                        FailureType failureType = description.getFailureType__ExternalFailureOccurrenceDescription();
                        if (failureType instanceof NetworkInducedFailureType) {
                            CommunicationLinkResourceType resourceType = ((NetworkInducedFailureType) failureType)
                                    .getCommunicationLinkResourceType__NetworkInducedFailureType();
                            resultList.add(MarkovNetworkInducedFailureType.createExternalFailureType(evaluationType,
                                    resourceType, annotation.getSignature_SpecifiedQoSAnnation(), annotation
                                            .getRole_SpecifiedQoSAnnotation(), ((OperationRequiredRole) annotation
                                            .getRole_SpecifiedQoSAnnotation())
                                            .getRequiredInterface__OperationRequiredRole()));
                        }
                    }
                }
            }
        }

        // Return the result:
        return resultList;
    }

    /**
     * Retrieves the list of resource timeout failure types from the given PCM model.
     * 
     * @param evaluationType
     *            the degree of differentiation between failure types
     * @param system
     *            the PCM System model
     * @return the list of resource timeout failure types
     */
    private List<MarkovFailureType> getResourceTimeoutFailureTypes(final MarkovEvaluationType evaluationType,
            final System system) {

        // Initialize the list of results:
        ArrayList<MarkovFailureType> resultList = new ArrayList<MarkovFailureType>();

        // Handle the PCM system model:
        for (AssemblyContext context : system.getAssemblyContexts__ComposedStructure()) {
            RepositoryComponent component = context.getEncapsulatedComponent__AssemblyContext();
            if (!(component instanceof BasicComponent)) {
                continue;
            }
            for (PassiveResource resource : ((BasicComponent) component).getPassiveResource_BasicComponent()) {
                resultList.add(MarkovResourceTimeoutFailureType.createResourceTimeoutFailureType(evaluationType,
                        context, ((BasicComponent) component), resource));
            }
        }

        // Return the result:
        return resultList;
    }

    /**
     * Retrieves the list of software failure types from the given PCM model.
     * 
     * @param evaluationType
     *            the degree of differentiation between failure types
     * @param repositories
     *            the PCM Repository models
     * @param system
     *            the PCM System model
     * @return the list of software failure types
     */
    private List<MarkovFailureType> getSoftwareFailureTypes(final MarkovEvaluationType evaluationType,
            final List<Repository> repositories, final System system) {

        // Initialize the list of results:
        ArrayList<MarkovFailureType> resultList = new ArrayList<MarkovFailureType>();

        // Handle the PCM repository models:
        for (Repository repository : repositories) {
            EList<EObject> components = helper.getElements(repository, RepositoryFactory.eINSTANCE
                    .createBasicComponent().eClass());
            for (Object c_object : components) {
                BasicComponent component = (BasicComponent) c_object;
                for (ProvidedRole role : component.getProvidedRoles_InterfaceProvidingEntity()) {
                    if (role instanceof OperationProvidedRole) {
                        OperationProvidedRole opRole = (OperationProvidedRole) role;
                        OperationInterface iface = opRole.getProvidedInterface__OperationProvidedRole();
                        for (OperationSignature signature : iface.getSignatures__OperationInterface()) {
                            ServiceEffectSpecification rdseff = getRDSEFF(component, signature);
                            EList<EObject> internalActions = helper.getElements(rdseff, SeffFactory.eINSTANCE
                                    .createInternalAction().eClass());
                            for (Object a_object : internalActions) {
                                InternalAction internalAction = (InternalAction) a_object;
                                for (InternalFailureOccurrenceDescription description : internalAction
                                        .getInternalFailureOccurrenceDescriptions__InternalAction()) {
                                    resultList
                                            .add(MarkovSoftwareInducedFailureType.createInternalFailureType(
                                                    evaluationType,
                                                    description
                                                            .getSoftwareInducedFailureType__InternalFailureOccurrenceDescription(),
                                                    internalAction, signature, opRole, iface, component));
                                }
                            }
                        }
                    }
                }
            }
        }

        // Handle the PCM system model:
        for (QoSAnnotations qos : system.getQosAnnotations_System()) {
            for (SpecifiedQoSAnnotation annotation : qos.getSpecifiedQoSAnnotations_QoSAnnotations()) {
                if (annotation instanceof SpecifiedReliabilityAnnotation) {
                    SpecifiedReliabilityAnnotation relAnnotation = ((SpecifiedReliabilityAnnotation) annotation);
                    for (ExternalFailureOccurrenceDescription description : relAnnotation
                            .getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()) {
                        FailureType failureType = description.getFailureType__ExternalFailureOccurrenceDescription();
                        if (failureType instanceof SoftwareInducedFailureType) {
                            SoftwareInducedFailureType softwareFailureType = ((SoftwareInducedFailureType) failureType);
                            resultList.add(MarkovSoftwareInducedFailureType.createExternalFailureType(evaluationType,
                                    softwareFailureType, annotation.getSignature_SpecifiedQoSAnnation(), annotation
                                            .getRole_SpecifiedQoSAnnotation(), ((OperationRequiredRole) annotation
                                            .getRole_SpecifiedQoSAnnotation())
                                            .getRequiredInterface__OperationRequiredRole()));
                        }
                    }
                }
            }
        }

        // Return the result:
        return resultList;
    }

    /**
     * Retrieves an RDSEFF for a given component and signature.
     * 
     * @param component
     *            the component
     * @param signature
     *            the signature
     * @return the RDSEFF
     */
    private ServiceEffectSpecification getRDSEFF(final BasicComponent component, final OperationSignature signature) {
        for (ServiceEffectSpecification rdseff : component.getServiceEffectSpecifications__BasicComponent()) {
            if (rdseff.getDescribedService__SEFF().getId().equals(signature.getId())) {
                return rdseff;
            }
        }
        return null;
    }

    /**
     * Removes doubles from the list of failure types.
     * 
     * Double failure types can occur if the distinction of failure types is not at the most
     * fine-granular level.
     * 
     * @param failureTypes
     *            the list of failure types
     * @return the result list
     */
    private List<MarkovFailureType> removeDoubleFailureTypes(final List<MarkovFailureType> failureTypes) {
        ArrayList<MarkovFailureType> resultList = new ArrayList<MarkovFailureType>();
        Iterator<MarkovFailureType> iterator = failureTypes.iterator();
        while (iterator.hasNext()) {
            MarkovFailureType failureType = iterator.next();
            if (!resultList.contains(failureType)) {
                resultList.add(failureType);
            }
        }
        return resultList;
    }
}
