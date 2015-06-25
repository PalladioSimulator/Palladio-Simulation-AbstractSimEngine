/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Required Element Deviation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getInternalStateInfluenceAnalysisAggregation
 * <em>Internal State Influence Analysis Aggregation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getMaximumDeviationNumberOfCalls
 * <em>Maximum Deviation Number Of Calls</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getMaximumDeviationCallParameterValues
 * <em>Maximum Deviation Call Parameter Values</em>}</li>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getRequiredElement
 * <em>Required Element</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getRequiredElementDeviation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface RequiredElementDeviation extends CDOObject {

    /**
     * Returns the value of the '<em><b>Internal State Influence Analysis Aggregation</b></em>'
     * container reference. It is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getRequiredElementDeviations
     * <em>Required Element Deviations</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Internal State Influence Analysis Aggregation</em>' container
     * reference isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Internal State Influence Analysis Aggregation</em>' container
     *         reference.
     * @see #setInternalStateInfluenceAnalysisAggregation(InternalStateInfluenceAnalysisAggregation)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getRequiredElementDeviation_InternalStateInfluenceAnalysisAggregation()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.InternalStateInfluenceAnalysisAggregation#getRequiredElementDeviations
     * @model opposite="requiredElementDeviations" required="true" transient="false" ordered="false"
     * @generated
     */
    InternalStateInfluenceAnalysisAggregation getInternalStateInfluenceAnalysisAggregation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getInternalStateInfluenceAnalysisAggregation
     * <em>Internal State Influence Analysis Aggregation</em>}' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Internal State Influence Analysis Aggregation</em>'
     *            container reference.
     * @see #getInternalStateInfluenceAnalysisAggregation()
     * @generated
     */
    void setInternalStateInfluenceAnalysisAggregation(InternalStateInfluenceAnalysisAggregation value);

    /**
     * Returns the value of the '<em><b>Maximum Deviation Number Of Calls</b></em>' reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Deviation Number Of Calls</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Maximum Deviation Number Of Calls</em>' reference.
     * @see #setMaximumDeviationNumberOfCalls(Precision)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getRequiredElementDeviation_MaximumDeviationNumberOfCalls()
     * @model required="true" ordered="false"
     * @generated
     */
    Precision getMaximumDeviationNumberOfCalls();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getMaximumDeviationNumberOfCalls
     * <em>Maximum Deviation Number Of Calls</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Maximum Deviation Number Of Calls</em>' reference.
     * @see #getMaximumDeviationNumberOfCalls()
     * @generated
     */
    void setMaximumDeviationNumberOfCalls(Precision value);

    /**
     * Returns the value of the '<em><b>Maximum Deviation Call Parameter Values</b></em>'
     * containment reference list. The list contents are of type
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation}. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getRequiredElementDeviation
     * <em>Required Element Deviation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Deviation Call Parameter Values</em>' containment
     * reference list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Maximum Deviation Call Parameter Values</em>' containment
     *         reference list.
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getRequiredElementDeviation_MaximumDeviationCallParameterValues()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.ParameterValueDeviation#getRequiredElementDeviation
     * @model opposite="requiredElementDeviation" containment="true" ordered="false"
     * @generated
     */
    EList<ParameterValueDeviation> getMaximumDeviationCallParameterValues();

    /**
     * Returns the value of the '<em><b>Required Element</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElement#getRequiredElementDeviation
     * <em>Required Element Deviation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required Element</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Required Element</em>' containment reference.
     * @see #setRequiredElement(RequiredElement)
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage#getRequiredElementDeviation_RequiredElement()
     * @see org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElement#getRequiredElementDeviation
     * @model opposite="requiredElementDeviation" containment="true" required="true" ordered="false"
     * @generated
     */
    RequiredElement getRequiredElement();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.analyzer.quality.qualityannotation.RequiredElementDeviation#getRequiredElement
     * <em>Required Element</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Required Element</em>' containment reference.
     * @see #getRequiredElement()
     * @generated
     */
    void setRequiredElement(RequiredElement value);

} // RequiredElementDeviation
