/**
 * 
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.ui.provider.PalladioItemProvider;

import de.fzi.se.quality.qualityannotation.PCMServiceSpecification;

/**Uses Palladio-TreeViewer to display target.
 * @author groenda
 *
 */
public class DetailedPCMServiceSpecificationItemProvider extends
		PCMServiceSpecificationItemProvider {
	/** ItemProvider for TreeViewer of Palladio. */
	protected PalladioItemProvider palladioItemProvider;

	public DetailedPCMServiceSpecificationItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
		this.palladioItemProvider = new PalladioItemProvider(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		StringBuilder text = new StringBuilder(getString("_UI_PCMServiceSpecification_type"));
		PCMServiceSpecification pcmss = (PCMServiceSpecification) object;
		if (pcmss.getResourceDemandingSEFF() != null) {
			text.append(" " + palladioItemProvider.getText(pcmss.getResourceDemandingSEFF()));
		}
		return text.toString();
	}
}
