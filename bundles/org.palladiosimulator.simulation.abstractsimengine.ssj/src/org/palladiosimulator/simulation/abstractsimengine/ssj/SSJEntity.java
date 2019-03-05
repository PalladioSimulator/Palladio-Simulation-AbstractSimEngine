/**
 * 
 */
package org.palladiosimulator.simulation.abstractsimengine.ssj;

import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractSimEntityDelegator;
import de.uka.ipd.sdq.simulation.abstractsimengine.IEntity;
import umontreal.ssj.simevents.Event;

/**
 * @author Steffen Becker
 * @author Philipp Merkle
 */
public class SSJEntity implements IEntity {

    private AbstractSimEntityDelegator entity;

    protected boolean isScheduled = false;
    protected Event nextEventForThisEntity = null;

    public SSJEntity(AbstractSimEntityDelegator entity, String name) {
        this.entity = entity;
    }

    public IEntity getEncapsulatedEntity() {
        return entity;
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void reschedule(double d) {
        nextEventForThisEntity.reschedule(d);
    }

}
