/**
 */
package org.palladiosimulator.analyzer.quality.parameters;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Component Instance</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.ComponentInstance#getComponentReference
 * <em>Component Reference</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.ComponentInstance#getParameterInstances
 * <em>Parameter Instances</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends Identifier {

    /**
     * Returns the value of the '<em><b>Component Reference</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ComponentReference#getComponentInstance
     * <em>Component Instance</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component Reference</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Component Reference</em>' containment reference.
     * @see #setComponentReference(ComponentReference)
     * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getComponentInstance_ComponentReference()
     * @see org.palladiosimulator.analyzer.quality.parameters.ComponentReference#getComponentInstance
     * @model opposite="componentInstance" containment="true" required="true" ordered="false"
     * @generated
     */
    ComponentReference getComponentReference();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ComponentInstance#getComponentReference
     * <em>Component Reference</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Component Reference</em>' containment reference.
     * @see #getComponentReference()
     * @generated
     */
    void setComponentReference(ComponentReference value);

    /**
     * Returns the value of the '<em><b>Parameter Instances</b></em>' containment reference list.
     * The list contents are of type
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterInstance}. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.parameters.ParameterInstance#getComponentInstance
     * <em>Component Instance</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Instances</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Parameter Instances</em>' containment reference list.
     * @see org.palladiosimulator.analyzer.quality.parameters.ParametersPackage#getComponentInstance_ParameterInstances()
     * @see org.palladiosimulator.analyzer.quality.parameters.ParameterInstance#getComponentInstance
     * @model opposite="componentInstance" containment="true" ordered="false"
     * @generated
     */
    EList<ParameterInstance> getParameterInstances();

} // ComponentInstance
