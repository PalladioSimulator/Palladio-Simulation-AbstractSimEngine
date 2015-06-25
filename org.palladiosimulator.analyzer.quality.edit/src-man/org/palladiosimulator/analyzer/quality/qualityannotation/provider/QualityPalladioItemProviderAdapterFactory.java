/**
 * 
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;
import org.palladiosimulator.pcm.ui.provider.PalladioItemProvider;
import org.palladiosimulator.pcm.ui.provider.PalladioItemProviderAdapterFactory;

/**Decorator for viewing Palladio items in the Quality model.
 * @author groenda
 *
 */
public class QualityPalladioItemProviderAdapterFactory extends
PalladioItemProviderAdapterFactory {

    public QualityPalladioItemProviderAdapterFactory(
            final AdapterFactory decoratedAdapterFactory) {
        super(decoratedAdapterFactory);
    }

    @Override
    protected IItemProviderDecorator createItemProviderDecorator(final Object target,
            final Object Type) {
        final PalladioItemProvider result = new QualityPalladioItemProvider(this);
        if (((Class<?>)Type).isInstance(result)) {
            result.addListener(this);
            return result;
        }
        return null;
    }
}
