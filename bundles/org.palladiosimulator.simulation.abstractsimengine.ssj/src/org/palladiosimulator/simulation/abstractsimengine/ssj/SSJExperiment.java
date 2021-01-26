package org.palladiosimulator.simulation.abstractsimengine.ssj;

import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractExperiment;
import umontreal.ssj.simevents.Event;
import umontreal.ssj.simevents.Simulator;
import umontreal.ssj.simevents.eventlist.SplayTree;

/**
 * @author Steffen Becker
 * @author Philipp Merkle
 */
public class SSJExperiment extends AbstractExperiment {

    private final Simulator simulator;
    private Event maxSimTimeTrigger;

    public SSJExperiment(final SSJModel model) {
        super(model);

        this.simulator = new Simulator();
        this.simulator.init(new SplayTree());
    }

    public double getCurrentSimulationTime() {
        return this.simulator.time();
    }

    public Simulator getSimulator() {
        return this.simulator;
    }

    @Override
    public void startSimulator() {
        this.simulator.start();
    }

    @Override
    public void stopSimulator() {
        this.simulator.stop();
    }
    
    @Override
    public void setMaxSimTime(long simTime) {
        if (maxSimTimeTrigger != null) {
            maxSimTimeTrigger.cancel();
        }
        maxSimTimeTrigger = new Event(simulator) {
            @Override
            public void actions() {
                simulator.stop();
            }
        };
        maxSimTimeTrigger.schedule(simTime - (simulator.isSimulating() ? simulator.time() : 0.0));
    }

}
