package org.palladiosimulator.simulation.abstractsimengine.ssj;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractSimEntityDelegator;
import de.uka.ipd.sdq.simulation.abstractsimengine.IEntity;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimEvent;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimRunnable;
import umontreal.ssj.simevents.Event;

/**
 * @author Steffen Becker
 * @author Philipp Merkle
 * 
 * @param <E>
 *            the type of the entity which is modified by this event
 */
public class SSJSimEvent<E extends IEntity> extends Event implements ISimEvent<E> {

    private final static Logger logger = Logger.getLogger(SSJSimEvent.class);
    
    private final ISimRunnable<E> myAbstractEvent;
    private final SSJExperiment simulationControl;
    private E who;

    public SSJSimEvent(ISimRunnable<E> myEvent, SSJExperiment simControl, String name) {
        super(simControl.getSimulator());
        this.simulationControl = simControl;
        this.myAbstractEvent = myEvent;
    }

    /**
     * The event handler, which is called by SSJ when an event occurred.
     * <p>
     * {@inheritDoc}
     * 
     * @see Event#actions()
     */
    @SuppressWarnings("unchecked")
    @Override
    public void actions() {
        // SSJ does not provide support for dedicated stop conditions
        // Therefore, we check at the beginning of each event, if any of the stop conditions
        // evaluate to true.       
        if (simulationControl.checkStopConditions()) {
			if (simulationControl.isRunning()) {
				if (logger.isDebugEnabled()) {
					logger.debug("Executing Stop Event");
				}
				simulationControl.stop();
			}
        } else {
	        // TODO try to get rid of manual casts
	        AbstractSimEntityDelegator abstractEntity = (AbstractSimEntityDelegator) who;
	        SSJEntity ssjEntity = (SSJEntity) abstractEntity.getEncapsulatedEntity();
	        ssjEntity.isScheduled = false;
	        ssjEntity.nextEventForThisEntity = null;
	        myAbstractEvent.eventRoutine((E) ssjEntity.getEncapsulatedEntity());
        }
    }

    @Override
    public void schedule(E resource, double delay) {
        who = resource;

        // TODO try to get rid of manual casts
        AbstractSimEntityDelegator abstractEntity = (AbstractSimEntityDelegator) who;
        SSJEntity ssjEntity = (SSJEntity) abstractEntity.getEncapsulatedEntity();
        ssjEntity.isScheduled = true;
        ssjEntity.nextEventForThisEntity = this;
        this.schedule(delay);
    }

    @Override
    public void removeEvent() {
        this.cancel();
    }
    
    @Override
    public double scheduledAtTime() {
        // TODO assure this.eventTime == this.time()!
        return this.time();
    }

}