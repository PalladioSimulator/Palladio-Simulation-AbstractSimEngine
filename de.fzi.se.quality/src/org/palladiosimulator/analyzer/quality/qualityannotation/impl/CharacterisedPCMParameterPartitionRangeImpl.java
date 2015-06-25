/**
 */
package org.palladiosimulator.analyzer.quality.qualityannotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.analyzer.quality.qualityannotation.CharacterisedPCMParameterPartitionRange;
import org.palladiosimulator.analyzer.quality.qualityannotation.QualityAnnotationPackage;
import org.palladiosimulator.pcm.core.PCMRandomVariable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Characterised PCM Parameter Partition Range</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.qualityannotation.impl.CharacterisedPCMParameterPartitionRangeImpl#getValues
 * <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterisedPCMParameterPartitionRangeImpl extends CharacterisedPCMParameterPartitionImpl
        implements CharacterisedPCMParameterPartitionRange {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CharacterisedPCMParameterPartitionRangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QualityAnnotationPackage.Literals.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public EList<PCMRandomVariable> getValues() {
        return (EList<PCMRandomVariable>) this.eDynamicGet(
                QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES,
                QualityAnnotationPackage.Literals.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES:
            return ((InternalEList<?>) this.getValues()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES:
            return this.getValues();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES:
            this.getValues().clear();
            this.getValues().addAll((Collection<? extends PCMRandomVariable>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES:
            this.getValues().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case QualityAnnotationPackage.CHARACTERISED_PCM_PARAMETER_PARTITION_RANGE__VALUES:
            return !this.getValues().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // CharacterisedPCMParameterPartitionRangeImpl
