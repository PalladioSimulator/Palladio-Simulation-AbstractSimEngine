/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm;

import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Required Business Operation Return Parameter Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMRequiredBusinessOperationReturnParameterReference#getRequiredRole
 * <em>Required Role</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMRequiredBusinessOperationReturnParameterReference#getSignature
 * <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMRequiredBusinessOperationReturnParameterReference()
 * @model
 * @generated
 */
public interface PCMRequiredBusinessOperationReturnParameterReference extends PCMParameterReference {

    /**
     * Returns the value of the '<em><b>Required Role</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required Role</em>' reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Required Role</em>' reference.
     * @see #setRequiredRole(OperationRequiredRole)
     * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMRequiredBusinessOperationReturnParameterReference_RequiredRole()
     * @model required="true" ordered="false"
     * @generated
     */
    OperationRequiredRole getRequiredRole();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMRequiredBusinessOperationReturnParameterReference#getRequiredRole
     * <em>Required Role</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Required Role</em>' reference.
     * @see #getRequiredRole()
     * @generated
     */
    void setRequiredRole(OperationRequiredRole value);

    /**
     * Returns the value of the '<em><b>Signature</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signature</em>' reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Signature</em>' reference.
     * @see #setSignature(OperationSignature)
     * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMRequiredBusinessOperationReturnParameterReference_Signature()
     * @model required="true" ordered="false"
     * @generated
     */
    OperationSignature getSignature();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMRequiredBusinessOperationReturnParameterReference#getSignature
     * <em>Signature</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Signature</em>' reference.
     * @see #getSignature()
     * @generated
     */
    void setSignature(OperationSignature value);

} // PCMRequiredBusinessOperationReturnParameterReference
