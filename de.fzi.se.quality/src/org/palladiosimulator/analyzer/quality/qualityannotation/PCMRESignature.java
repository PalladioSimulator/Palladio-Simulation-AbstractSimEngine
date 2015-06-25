/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PCMRE Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMRESignature#getSignature
 * <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMRESignature()
 * @model
 * @generated
 */
public interface PCMRESignature extends PCMRE {

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
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getPCMRESignature_Signature()
     * @model required="true" ordered="false"
     * @generated
     */
    OperationSignature getSignature();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.PCMRESignature#getSignature
     * <em>Signature</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Signature</em>' reference.
     * @see #getSignature()
     * @generated
     */
    void setSignature(OperationSignature value);

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
    boolean ThisIsTheLowestComponentHierarchyLevel(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parentRE.childREs->select(pcmre | pcmre.oclAsType(PCMRESignature).signature = self.signature)->size() = 1'"
     * @generated
     */
    boolean EachRETargetMustBeReferencedOnlyFromOneRE(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PCMRESignature
