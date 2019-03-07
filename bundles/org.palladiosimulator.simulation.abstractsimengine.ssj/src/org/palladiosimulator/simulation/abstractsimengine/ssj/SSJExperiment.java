package org.palladiosimulator.simulation.abstractsimengine.ssj;

import de.uka.ipd.sdq.simulation.abstractsimengine.AbstractExperiment;
import umontreal.ssj.simevents.Simulator;
import umontreal.ssj.simevents.eventlist.SplayTree;

/**
 * @author Steffen Becker
 * @author Philipp Merkle
 */
public class SSJExperiment extends AbstractExperiment {

    private final Simulator simulator;

    public SSJExperiment(final SSJModel model) {
        super(model);

        this.simulator = new Simulator();
        this.simulator.init(new SplayTree());

//        this.scheduleEvent(this.CHECK_EVENT, 1);
    }

    public double getCurrentSimulationTime() {
        return this.simulator.time();
    }

    public Simulator getSimulator() {
        return this.simulator;
    }

//    @Override
//    public void scheduleEvent(final IEvent event, final double delay) {
//        new Event(this.simulator) {
//            @Override
//            public void actions() {
//                event.run();
//            }
//        }.schedule(delay);
//    }

    @Override
    public void startSimulator() {
        this.simulator.start();
    }

    @Override
    public void stopSimulator() {
        this.simulator.stop();
    }

}
