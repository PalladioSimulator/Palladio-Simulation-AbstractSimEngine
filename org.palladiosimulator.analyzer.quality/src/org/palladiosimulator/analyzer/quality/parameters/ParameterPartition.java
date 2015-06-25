/**
 */
package org.palladiosimulator.analyzer.quality.parameters;

import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotation;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Partition</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterPartition#getQualityAnnotation
 * <em>Quality Annotation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterPartition#getParameterReference
 * <em>Parameter Reference</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getParameterPartition()
 * @model abstract="true"
 * @generated
 */
public interface ParameterPartition extends Identifier {

    /**
     * Returns the value of the '<em><b>Quality Annotation</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotation#getValidForParameterPartitions
     * <em>Valid For Parameter Partitions</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quality Annotation</em>' container reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Quality Annotation</em>' container reference.
     * @see #setQualityAnnotation(QualityAnnotation)
     * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getParameterPartition_QualityAnnotation()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotation#getValidForParameterPartitions
     * @model opposite="validForParameterPartitions" required="true" transient="false"
     *        ordered="false"
     * @generated
     */
    QualityAnnotation getQualityAnnotation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterPartition#getQualityAnnotation
     * <em>Quality Annotation</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Quality Annotation</em>' container reference.
     * @see #getQualityAnnotation()
     * @generated
     */
    void setQualityAnnotation(QualityAnnotation value);

    /**
     * Returns the value of the '<em><b>Parameter Reference</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterReference#getParameterPartition
     * <em>Parameter Partition</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Reference</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Reference</em>' containment reference.
     * @see #setParameterReference(ParameterReference)
     * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getParameterPartition_ParameterReference()
     * @see org.palladiosimulator.analyzer.quality.parameters.ParameterReference#getParameterPartition
     * @model opposite="parameterPartition" containment="true" required="true" ordered="false"
     * @generated
     */
    ParameterReference getParameterReference();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterPartition#getParameterReference
     * <em>Parameter Reference</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Parameter Reference</em>' containment reference.
     * @see #getParameterReference()
     * @generated
     */
    void setParameterReference(ParameterReference value);

} // ParameterPartition
