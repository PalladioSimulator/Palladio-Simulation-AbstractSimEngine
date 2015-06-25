/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.analyzer.quality.parameters.ParameterValue;
import org.palladiosimulator.pcm.parameter.VariableUsage;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.PCMParameterValue#getVariableCharacterisations
 * <em>Variable Characterisations</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMParameterValue()
 * @model
 * @generated
 */
public interface PCMParameterValue extends ParameterValue {

    /**
     * Returns the value of the '<em><b>Variable Characterisations</b></em>' containment reference
     * list. The list contents are of type {@link org.palladiosimulator.pcm.parameter.VariableUsage}
     * . <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Characterisations</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Variable Characterisations</em>' containment reference list.
     * @see org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage#getPCMParameterValue_VariableCharacterisations()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    EList<VariableUsage> getVariableCharacterisations();

} // PCMParameterValue
