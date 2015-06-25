/**
 * 
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.analyzer.quality.edit.util.Helper;

import de.fzi.se.quality.qualityannotation.PCMRECategory;

/**
 * @author groenda
 *
 */
public class DetailedPCMRECategory extends PCMRECategoryItemProvider {

	public DetailedPCMRECategory(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		StringBuilder text = new StringBuilder(getString("_UI_PCMRECategory_type"));
		PCMRECategory target = (PCMRECategory) object;
		if (target.getCategory() != null) {
			text.append(" " + target.getCategory().getLiteral());
		}
		if (target.getPrecision() != null) {
			text.append(" " + Helper.getText(adapterFactory, target.getPrecision())+ "");
		}
		return text.toString();
	}
}
