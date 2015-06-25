/**
 */
package org.palladiosimulator.analyzer.quality.parameters;

import org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.analyzer.quality.parameters.ParameterValue#getParameterInstance
 * <em>Parameter Instance</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterValue#getParameterValueDeviation
 * <em>Parameter Value Deviation</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getParameterValue()
 * @model abstract="true"
 * @generated
 */
public interface ParameterValue extends Identifier {

    /**
     * Returns the value of the '<em><b>Parameter Instance</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterInstance#getParameterValue
     * <em>Parameter Value</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Instance</em>' container reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Instance</em>' container reference.
     * @see #setParameterInstance(ParameterInstance)
     * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getParameterValue_ParameterInstance()
     * @see org.palladiosimulator.analyzer.quality.parameters.ParameterInstance#getParameterValue
     * @model opposite="parameterValue" transient="false" ordered="false"
     * @generated
     */
    ParameterInstance getParameterInstance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterValue#getParameterInstance
     * <em>Parameter Instance</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Parameter Instance</em>' container reference.
     * @see #getParameterInstance()
     * @generated
     */
    void setParameterInstance(ParameterInstance value);

    /**
     * Returns the value of the '<em><b>Parameter Value Deviation</b></em>' container reference. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getParameterValue
     * <em>Parameter Value</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Value Deviation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Value Deviation</em>' container reference.
     * @see #setParameterValueDeviation(ParameterValueDeviation)
     * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getParameterValue_ParameterValueDeviation()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getParameterValue
     * @model opposite="parameterValue" transient="false" ordered="false"
     * @generated
     */
    ParameterValueDeviation getParameterValueDeviation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterValue#getParameterValueDeviation
     * <em>Parameter Value Deviation</em>}' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Parameter Value Deviation</em>' container reference.
     * @see #getParameterValueDeviation()
     * @generated
     */
    void setParameterValueDeviation(ParameterValueDeviation value);

} // ParameterValue
