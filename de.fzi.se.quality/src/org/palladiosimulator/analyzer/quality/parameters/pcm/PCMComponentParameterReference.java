/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm;

import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.ImplementationComponentType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Component Parameter Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMComponentParameterReference#getImplementationComponentType
 * <em>Implementation Component Type</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMComponentParameterReference#getVariableUsage
 * <em>Variable Usage</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMComponentParameterReference()
 * @model
 * @generated
 */
public interface PCMComponentParameterReference extends PCMParameterReference {

    /**
     * Returns the value of the '<em><b>Implementation Component Type</b></em>' reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implementation Component Type</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Implementation Component Type</em>' reference.
     * @see #setImplementationComponentType(ImplementationComponentType)
     * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMComponentParameterReference_ImplementationComponentType()
     * @model required="true" ordered="false"
     * @generated
     */
    ImplementationComponentType getImplementationComponentType();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMComponentParameterReference#getImplementationComponentType
     * <em>Implementation Component Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Implementation Component Type</em>' reference.
     * @see #getImplementationComponentType()
     * @generated
     */
    void setImplementationComponentType(ImplementationComponentType value);

    /**
     * Returns the value of the '<em><b>Variable Usage</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Usage</em>' reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Variable Usage</em>' reference.
     * @see #setVariableUsage(VariableUsage)
     * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMComponentParameterReference_VariableUsage()
     * @model required="true" ordered="false"
     * @generated
     */
    VariableUsage getVariableUsage();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMComponentParameterReference#getVariableUsage
     * <em>Variable Usage</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Variable Usage</em>' reference.
     * @see #getVariableUsage()
     * @generated
     */
    void setVariableUsage(VariableUsage value);

} // PCMComponentParameterReference
