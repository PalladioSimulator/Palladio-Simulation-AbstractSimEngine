/**
 */
package org.palladiosimulator.analyzer.quality;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.analyzer.quality.QualityPackage
 * @generated
 */
public interface QualityFactory extends EFactory {

    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    QualityFactory eINSTANCE = org.palladiosimulator.analyzer.quality.impl.QualityFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Repository</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Repository</em>'.
     * @generated
     */
    QualityRepository createQualityRepository();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    QualityPackage getQualityPackage();

} // QualityFactory
