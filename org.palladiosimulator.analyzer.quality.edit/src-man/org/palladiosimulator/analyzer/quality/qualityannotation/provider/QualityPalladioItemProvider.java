/**
 * 
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.identifier.Identifier;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.EventType;
import org.palladiosimulator.pcm.repository.InfrastructureSignature;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.resourcetype.ResourceSignature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall;
import org.palladiosimulator.pcm.ui.provider.PalladioItemProvider;
import org.palladiosimulator.pcm.ui.provider.SignaturePrinter;

/**
 * @author groenda
 * 
 */
public class QualityPalladioItemProvider extends PalladioItemProvider {

	public QualityPalladioItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		if (object == null) {
			return "";
		}
		String result = "";
		if (object instanceof Parameter) {
			Parameter p = (Parameter) object;
			if (p.getEventType__Parameter() != null) {
				result = p.getEventType__Parameter().getEventGroup__EventType()
						.getEntityName()
						+ "::" + p.getEventType__Parameter().getEntityName();
			}
			if (p.getResourceSignature__Parameter() != null) {
				result = p.getResourceSignature__Parameter()
						.getResourceInterface__ResourceSignature()
						.getEntityName()
						+ "::"
						+ p.getResourceSignature__Parameter().getEntityName();
			}
			if (p.getOperationSignature__Parameter() != null) {
				result = p.getOperationSignature__Parameter()
						.getInterface__OperationSignature().getEntityName()
						+ "::"
						+ p.getOperationSignature__Parameter().getEntityName();
			}
			if (p.getInfrastructureSignature__Parameter() != null) {
				result = p.getInfrastructureSignature__Parameter()
						.getInfrastructureInterface__InfrastructureSignature()
						.getEntityName()
						+ "::"
						+ p.getInfrastructureSignature__Parameter()
								.getEntityName();
			}
			if (p.getDataType__Parameter()!= null) {
				result = result + ":" + super.getText(p.getDataType__Parameter())
						+ " " + p.getParameterName();
			}
	} else if (object instanceof Entity) {
			result = ((Entity) object).getEntityName();
		} else if (object instanceof ResourceDemandingSEFF) {
			ResourceDemandingSEFF seff = (ResourceDemandingSEFF) object;
			result = seff.getBasicComponent_ServiceEffectSpecification()
					.getEntityName() + "::";
			if (seff.getDescribedService__SEFF() != null) {
				if (seff.getDescribedService__SEFF() instanceof InfrastructureSignature) {
					InfrastructureSignature sig = (InfrastructureSignature) seff
							.getDescribedService__SEFF();
					result += sig.getEntityName() + "(";
					result += parametersToSignature(sig
							.getParameters__InfrastructureSignature());
					result += ")";
				} else if (seff.getDescribedService__SEFF() instanceof OperationSignature) {
					OperationSignature sig = (OperationSignature) seff
							.getDescribedService__SEFF();
					if (sig.getReturnType__OperationSignature() != null) {
						result += dataTypeToSignature(sig
								.getReturnType__OperationSignature()) + " ";
					} else {
						result += "void ";
					}
					result += sig.getEntityName() + "(";
					result += parametersToSignature(sig
							.getParameters__OperationSignature());
					result += ")";
				} else if (seff.getDescribedService__SEFF() instanceof EventType) {
					EventType sig = (EventType) seff
							.getDescribedService__SEFF();
					result += sig.getEntityName() + "(";
					Parameter[] params = { sig.getParameter__EventType() };
					result += parametersToSignature(Arrays.asList(params));
					result += ")";
				} else if (seff.getDescribedService__SEFF() instanceof ResourceSignature) {
					ResourceSignature sig = (ResourceSignature) seff
							.getDescribedService__SEFF();
					result += sig.getEntityName() + "(";
					result += parametersToSignature(sig
							.getParameter__ResourceSignature());
					result += ")";
				} else {
					result += seff.getDescribedService__SEFF().getEntityName()
							+ "(...)";
				}
			}
			result = "SEFF " + result;
		} else if (object instanceof ExternalCallAction) {
			ExternalCallAction eca = (ExternalCallAction) object;
			if (eca.getRole_ExternalService() != null
					&& eca.getCalledService_ExternalService() != null) {
				result += " with target "
						+ eca.getRole_ExternalService().getEntityName()
						+ "::"
						+ new SignaturePrinter().doSwitch(eca
								.getCalledService_ExternalService());
			}
		} else if (object instanceof InfrastructureCall) {
			InfrastructureCall ic = (InfrastructureCall) object;
			if (ic.getNumberOfCalls__InfrastructureCall() != null) {
				result += ic.getNumberOfCalls__InfrastructureCall()
						.getSpecification() + "x ";
			}
			if (ic.getRequiredRole__InfrastructureCall() != null
					&& ic.getSignature__InfrastructureCall() != null) {
				result += " with target "
						+ ic.getRequiredRole__InfrastructureCall()
								.getEntityName()
						+ "::"
						+ new SignaturePrinter().doSwitch(ic
								.getSignature__InfrastructureCall());
			}
		} else {
			result = super.getText(object);
		}
		if (object instanceof EObject) {
			result += " <" + ((EObject) object).eClass().getName() + ">";
		}
		if (object instanceof Identifier) {
			result += " [ID: " + ((Identifier) object).getId() + "]";
		}
		return result;
	}
	
	/**Converts a list of parameters to a comma-separated signature string.
	 * @param list List of parameters.
	 * @return Signature string.
	 */
	protected String parametersToSignature(List<Parameter> list) {
		String result = "";
		Parameter p2;
		for (int i = 0; i < list.size(); i++) {
			p2 = list.get(i);
			result += dataTypeToSignature(p2.getDataType__Parameter()) + " " + p2.getParameterName();
			if (i < list.size() - 1) {
				result += ", ";
			}
		}
		return result;
	}
	
	/**Converts a data type to a signature string.
	 * @param dataType Data type.
	 * @return Signature string.
	 */
	protected String dataTypeToSignature(DataType dataType) {
		if (dataType instanceof CompositeDataType) {
			return ((CompositeDataType)dataType).getEntityName();
		}
		if (dataType instanceof PrimitiveDataType) {
			return ((PrimitiveDataType)dataType).getType().getLiteral();
		}
		if (dataType instanceof CollectionDataType) {
			return dataTypeToSignature(((CollectionDataType)dataType).getInnerType_CollectionDataType()) + "[]";
		}
		return "unknown";
	}

}
