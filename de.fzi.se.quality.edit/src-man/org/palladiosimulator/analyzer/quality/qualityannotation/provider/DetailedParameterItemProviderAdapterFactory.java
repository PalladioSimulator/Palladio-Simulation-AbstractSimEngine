/**
 * 
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import org.eclipse.emf.common.notify.Adapter;

import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.parameter.provider.ParameterItemProviderAdapterFactory;

/**ItemProviderAdapterFactory used to display human readable names for {@link VariableUsage}.
 * @author groenda
 *
 */
public class DetailedParameterItemProviderAdapterFactory extends
		ParameterItemProviderAdapterFactory {

	@Override
	public Adapter createVariableUsageAdapter() {
		if (variableUsageItemProvider == null) {
			variableUsageItemProvider = new DetailedVariableUsageItemProvider(this);
		}

		return variableUsageItemProvider;
	}
	
}
