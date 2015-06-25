package org.palladiosimulator.analyzer.accuracy.util;

import org.palladiosimulator.pcm.core.entity.ResourceInterfaceRequiringEntity;
import org.palladiosimulator.pcm.repository.InfrastructureRequiredRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.util.RepositorySwitch;

public class RoleCategoryCheck extends RepositorySwitch<Boolean> {
	Boolean infrastructureRECategory = false;
	Boolean operationRECategory = false;
	Boolean resourceRECategory = false;
	Boolean resourceDemandRECategory = true;
	Boolean internalRECategory = false;

	@Override
	public Boolean caseInfrastructureRequiredRole(
			InfrastructureRequiredRole object) {
		infrastructureRECategory = true;
		return true;
	}

	@Override
	public Boolean caseOperationRequiredRole(
			OperationRequiredRole object) {
		operationRECategory = true;
		return true;
	}
	
	@Override
	public Boolean caseResourceInterfaceRequiringEntity(
			ResourceInterfaceRequiringEntity object) {
		resourceRECategory = true;
		return true;
	}
	
}
