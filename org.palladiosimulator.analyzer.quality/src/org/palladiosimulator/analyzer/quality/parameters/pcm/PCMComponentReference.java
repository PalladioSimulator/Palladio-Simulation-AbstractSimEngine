/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm;

import org.palladiosimulator.analyzer.quality.parameters.ComponentReference;
import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Component Reference</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMComponentReference#getBasicComponent
 * <em>Basic Component</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMComponentReference()
 * @model
 * @generated
 */
public interface PCMComponentReference extends ComponentReference {

    /**
     * Returns the value of the '<em><b>Basic Component</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Component</em>' reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Basic Component</em>' reference.
     * @see #setBasicComponent(BasicComponent)
     * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMComponentReference_BasicComponent()
     * @model required="true" ordered="false"
     * @generated
     */
    BasicComponent getBasicComponent();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMComponentReference#getBasicComponent
     * <em>Basic Component</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Basic Component</em>' reference.
     * @see #getBasicComponent()
     * @generated
     */
    void setBasicComponent(BasicComponent value);

} // PCMComponentReference
