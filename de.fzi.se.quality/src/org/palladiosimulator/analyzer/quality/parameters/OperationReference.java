/**
 */
package org.palladiosimulator.analyzer.quality.parameters;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Operation Reference</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.analyzer.quality.parameters.OperationReference#getCallInstance
 * <em>Call Instance</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getOperationReference()
 * @model abstract="true"
 * @generated
 */
public interface OperationReference extends Identifier {

    /**
     * Returns the value of the '<em><b>Call Instance</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.parameters.CallInstance#getOperationReference
     * <em>Operation Reference</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call Instance</em>' container reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Call Instance</em>' container reference.
     * @see #setCallInstance(CallInstance)
     * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getOperationReference_CallInstance()
     * @see org.palladiosimulator.analyzer.quality.parameters.CallInstance#getOperationReference
     * @model opposite="operationReference" transient="false" ordered="false"
     * @generated
     */
    CallInstance getCallInstance();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.OperationReference#getCallInstance
     * <em>Call Instance</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Call Instance</em>' container reference.
     * @see #getCallInstance()
     * @generated
     */
    void setCallInstance(CallInstance value);

} // OperationReference
