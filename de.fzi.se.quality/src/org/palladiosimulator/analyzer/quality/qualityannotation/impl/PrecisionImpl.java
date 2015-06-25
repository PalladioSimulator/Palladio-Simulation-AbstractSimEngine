/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.analyzer.quality.qualityannotation.Precision;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Precision</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public abstract class PrecisionImpl extends IdentifierImpl implements Precision {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PrecisionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QualityAnnotationPackage.Literals.PRECISION;
    }

} // PrecisionImpl
