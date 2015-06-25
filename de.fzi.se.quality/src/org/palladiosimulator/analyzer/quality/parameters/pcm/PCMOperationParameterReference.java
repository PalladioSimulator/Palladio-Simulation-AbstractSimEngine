/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Operation Parameter Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMOperationParameterReference#getParameter
 * <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMOperationParameterReference()
 * @model
 * @generated
 */
public interface PCMOperationParameterReference extends PCMParameterReference {

    /**
     * Returns the value of the '<em><b>Parameter</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter</em>' reference.
     * @see #setParameter(Parameter)
     * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMOperationParameterReference_Parameter()
     * @model required="true" ordered="false"
     * @generated
     */
    Parameter getParameter();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMOperationParameterReference#getParameter
     * <em>Parameter</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Parameter</em>' reference.
     * @see #getParameter()
     * @generated
     */
    void setParameter(Parameter value);

} // PCMOperationParameterReference
