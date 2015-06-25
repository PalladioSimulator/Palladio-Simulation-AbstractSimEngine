/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import org.palladiosimulator.pcm.parameter.VariableCharacterisationType;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Characterised PCM Parameter Partition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition#getForCharacterisation
 * <em>For Characterisation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition#getPcmParameterPartition
 * <em>Pcm Parameter Partition</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition#getQualifiedElementName
 * <em>Qualified Element Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getCharacterisedPCMParameterPartition()
 * @model abstract="true"
 * @generated
 */
public interface CharacterisedPCMParameterPartition extends Identifier {

    /**
     * Returns the value of the '<em><b>For Characterisation</b></em>' attribute. The literals are
     * from the enumeration {@link org.palladiosimulator.pcm.parameter.VariableCharacterisationType}
     * . <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>For Characterisation</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>For Characterisation</em>' attribute.
     * @see org.palladiosimulator.pcm.parameter.VariableCharacterisationType
     * @see #setForCharacterisation(VariableCharacterisationType)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getCharacterisedPCMParameterPartition_ForCharacterisation()
     * @model required="true" ordered="false"
     * @generated
     */
    VariableCharacterisationType getForCharacterisation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition#getForCharacterisation
     * <em>For Characterisation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>For Characterisation</em>' attribute.
     * @see org.palladiosimulator.pcm.parameter.VariableCharacterisationType
     * @see #getForCharacterisation()
     * @generated
     */
    void setForCharacterisation(VariableCharacterisationType value);

    /**
     * Returns the value of the '<em><b>Pcm Parameter Partition</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMParameterPartition#getCharacerisedParameterPartitions
     * <em>Characerised Parameter Partitions</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pcm Parameter Partition</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Pcm Parameter Partition</em>' container reference.
     * @see #setPcmParameterPartition(PCMParameterPartition)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getCharacterisedPCMParameterPartition_PcmParameterPartition()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.PCMParameterPartition#getCharacerisedParameterPartitions
     * @model opposite="characerisedParameterPartitions" required="true" transient="false"
     *        ordered="false"
     * @generated
     */
    PCMParameterPartition getPcmParameterPartition();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition#getPcmParameterPartition
     * <em>Pcm Parameter Partition</em>}' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Pcm Parameter Partition</em>' container reference.
     * @see #getPcmParameterPartition()
     * @generated
     */
    void setPcmParameterPartition(PCMParameterPartition value);

    /**
     * Returns the value of the '<em><b>Qualified Element Name</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qualified Element Name</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Qualified Element Name</em>' attribute.
     * @see #setQualifiedElementName(String)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getCharacterisedPCMParameterPartition_QualifiedElementName()
     * @model required="true" ordered="false"
     * @generated
     */
    String getQualifiedElementName();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartition#getQualifiedElementName
     * <em>Qualified Element Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Qualified Element Name</em>' attribute.
     * @see #getQualifiedElementName()
     * @generated
     */
    void setQualifiedElementName(String value);

} // CharacterisedPCMParameterPartition
