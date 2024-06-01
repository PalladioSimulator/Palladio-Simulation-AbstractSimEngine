# Palladio-Simulation-AbstractSimEngine
This repository contains the discrete event simulator abstraction layer used by the SimuComFramework. 
Currently we provide two concrete realizations: using the DesmoJ library and SSJ. 

## About
The Abstract Simulation Engine is an abstraction layer (in the form of an Eclipse plug-in) for discrete-event simulation libraries, such as [Desmo-J](http://www.desmoj.de/) or [SSJ](http://www.iro.umontreal.ca/~simardr/ssj/indexe.html). It is employed by SimuCom and EventSim to attain independence of simulation libraries. But its use is not limited to simulators in the area of Palladio.

## Overview of Functioning
The Abstract Simulation Engine is mainly targeted to decouple a discrete-event simulator from its simulation engine. For this purpose, the Abstract Simulation Engine defines a number of concepts common to simulation modelling. These concepts include, for example, an implementation for simulated processes and for events as well as an event scheduler along with a simulation clock.

In simulator development, these abstract concepts are used in place of explicit references to a specific simulation engine like SSJ or Desmo-J. At simulation runtime, the simulator (or more precisely, the Abstract Simulation Engine) has to be bound to a concrete simulation library implementing the abstract concepts. Therefore, at runtime a mapping has to be available between the abstract concepts on the one hand, and at least one concrete simulation engine on the other hand. As this binding is deferred to simulation runtime, the choice of the simulation engine to be used is left to the person that actually conducts a simulation run.

## Available Simulation Libraries
Currently, the Abstract Simulation Engine can be used in conjunction with Desmo-J and SSJ.

### Desmo-J Simulation Engine
For simulation users: TBD, there is no feature yet
For developers: Check out the following plug-in into your workspace: https://svnserver.informatik.kit.edu/i43/svn/code/Palladio/Core/trunk/SimuCom/de.uka.ipd.sdq.simulation.abstractsimengine.desmoj

### SSJ Simulation Engine
For simulation users: In Eclipse, install the "SSJ Simulation Engine Feature" from a recent Palladio update site.
For developers: Check out the following plug-in into your workspace: https://svnserver.informatik.kit.edu/i43/svn/code/Palladio/Core/trunk/SimuCom/de.uka.ipd.sdq.simulation.abstractsimengine.ssj

## Usage in the Palladio Toolchain
Both, SimuCom and EventSim rely on the the Abstract Simulation Engine. The selection of the concrete simulation engine to be used for simulation runs is described below.

### Selecting the Preferred Simulation Engine
If there is more than one simulation engine installed, the preferred simulation engine can be selected using the "Palladio" preference page. In the Palladio Workbench (or Eclipse, respectively) select "Window" -> "Preferences" -> "Simulation" and make your choice.

> [!NOTE]
> For more information on SSJ, please visit their [homepage](http://www.iro.umontreal.ca/~simardr/ssj/indexe.html).

## Support
For support
* visit our [issue tracking system](https://palladio-simulator.com/jira)
* contact us via our [mailing list](https://lists.ira.uni-karlsruhe.de/mailman/listinfo/palladio-dev)

For professional support, please fill in our [contact form](http://www.palladio-simulator.com/about_palladio/support/).
