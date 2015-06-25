/**
 * 
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.analyzer.quality.qualityannotation.provider.QualityPalladioItemProvider;

import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMOperationParameterReference;

/** Item provider for {@link PCMOperationParameterReference}.
 * @author groenda
 *
 */
public class DetailedPCMOperationParameterReferenceItemProvider extends
		PCMOperationParameterReferenceItemProvider {

	public DetailedPCMOperationParameterReferenceItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		StringBuilder text = new StringBuilder(getString("_UI_PCMOperationParameterReference_type"));
		PCMOperationParameterReference target = (PCMOperationParameterReference) object;
		if (target.getParameter() != null) {
			text.append(" (" + new QualityPalladioItemProvider(getAdapterFactory()).getText(target.getParameter()) + ")");
		}
		return text.toString();
	}
}
