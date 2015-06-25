/**
 */
package org.palladiosimulator.analyzer.quality;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Repository</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Container for quality annotations. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.analyzer.quality.QualityRepository#getQualityStatements
 * <em>Quality Statements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.QualityPackage#getQualityRepository()
 * @model
 * @generated
 */
public interface QualityRepository extends Identifier {

    /**
     * Returns the value of the '<em><b>Quality Statements</b></em>' containment reference list. The
     * list contents are of type {@link org.palladiosimulator.analyzer.quality.QualityStatement}. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.QualityStatement#getQualityRepository
     * <em>Quality Repository</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quality Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Quality Statements</em>' containment reference list.
     * @see org.palladiosimulator.analyzer.quality.QualityPackage#getQualityRepository_QualityStatements()
     * @see org.palladiosimulator.analyzer.quality.QualityStatement#getQualityRepository
     * @model opposite="qualityRepository" containment="true" ordered="false"
     * @generated
     */
    EList<QualityStatement> getQualityStatements();

} // QualityRepository
