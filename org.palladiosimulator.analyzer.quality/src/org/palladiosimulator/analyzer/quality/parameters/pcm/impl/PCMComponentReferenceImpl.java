/**
 */
package org.palladiosimulator.analyzer.quality.parameters.pcm.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.analyzer.quality.parameters.impl.ComponentReferenceImpl;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMComponentReference;
import org.palladiosimulator.analyzer.quality.parameters.pcm.PCMPackage;
import org.palladiosimulator.pcm.repository.BasicComponent;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Component Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.analyzer.quality.parameters.pcm.impl.PCMComponentReferenceImpl#getBasicComponent
 * <em>Basic Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMComponentReferenceImpl extends ComponentReferenceImpl implements PCMComponentReference {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PCMComponentReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PCMPackage.Literals.PCM_COMPONENT_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BasicComponent getBasicComponent() {
        return (BasicComponent) this.eDynamicGet(PCMPackage.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT,
                PCMPackage.Literals.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public BasicComponent basicGetBasicComponent() {
        return (BasicComponent) this.eDynamicGet(PCMPackage.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT,
                PCMPackage.Literals.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBasicComponent(final BasicComponent newBasicComponent) {
        this.eDynamicSet(PCMPackage.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT,
                PCMPackage.Literals.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT, newBasicComponent);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case PCMPackage.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT:
            if (resolve) {
                return this.getBasicComponent();
            }
            return this.basicGetBasicComponent();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case PCMPackage.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT:
            this.setBasicComponent((BasicComponent) newValue);
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
        case PCMPackage.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT:
            this.setBasicComponent((BasicComponent) null);
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
        case PCMPackage.PCM_COMPONENT_REFERENCE__BASIC_COMPONENT:
            return this.basicGetBasicComponent() != null;
        }
        return super.eIsSet(featureID);
    }

} // PCMComponentReferenceImpl
