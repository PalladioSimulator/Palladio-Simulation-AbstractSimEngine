/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PCMRE Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMREResource#getProcessingResourceType
 * <em>Processing Resource Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMREResource()
 * @model
 * @generated
 */
public interface PCMREResource extends PCMRE {

    /**
     * Returns the value of the '<em><b>Processing Resource Type</b></em>' reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Processing Resource Type</em>' reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Processing Resource Type</em>' reference.
     * @see #setProcessingResourceType(ProcessingResourceType)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMREResource_ProcessingResourceType()
     * @model required="true" ordered="false"
     * @generated
     */
    ProcessingResourceType getProcessingResourceType();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMREResource#getProcessingResourceType
     * <em>Processing Resource Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Processing Resource Type</em>' reference.
     * @see #getProcessingResourceType()
     * @generated
     */
    void setProcessingResourceType(ProcessingResourceType value);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.childREs->isEmpty()'"
     * @generated
     */
    boolean ThisIsTheLowestResourceDemandHierarchyLevel(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parentRE.childREs->select(pcmre | pcmre.oclAsType(PCMREResource).processingResourceType = self.processingResourceType)->size() = 1'"
     * @generated
     */
    boolean EachRETargetMustBeReferencedOnlyFromOneRE(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PCMREResource
