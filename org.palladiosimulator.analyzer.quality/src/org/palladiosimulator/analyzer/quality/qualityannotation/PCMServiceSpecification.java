/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PCM Service Specification</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMServiceSpecification#getResourceDemandingSEFF
 * <em>Resource Demanding SEFF</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMServiceSpecification()
 * @model
 * @generated
 */
public interface PCMServiceSpecification extends ServiceSpecification {

    /**
     * Returns the value of the '<em><b>Resource Demanding SEFF</b></em>' reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Demanding SEFF</em>' reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Resource Demanding SEFF</em>' reference.
     * @see #setResourceDemandingSEFF(ResourceDemandingSEFF)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMServiceSpecification_ResourceDemandingSEFF()
     * @model required="true" ordered="false"
     * @generated
     */
    ResourceDemandingSEFF getResourceDemandingSEFF();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMServiceSpecification#getResourceDemandingSEFF
     * <em>Resource Demanding SEFF</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Resource Demanding SEFF</em>' reference.
     * @see #getResourceDemandingSEFF()
     * @generated
     */
    void setResourceDemandingSEFF(ResourceDemandingSEFF value);

} // PCMServiceSpecification
