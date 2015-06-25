/**
 * 
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import org.palladiosimulator.analyzer.quality.qualityannotation.LimitedDeviationPrecision;

/**Text(LimitedDeviationPrecision): Limited: abs=x rel=y
 * @author groenda
 *
 */
public class DetailedLimitedDeviationPrecisionItemProvider extends
		LimitedDeviationPrecisionItemProvider {

	public DetailedLimitedDeviationPrecisionItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		LimitedDeviationPrecision target = (LimitedDeviationPrecision) object;
		return "Limited: abs = " + target.getAbsolute() + " , rel = " + target.getRelative();
	}
}
