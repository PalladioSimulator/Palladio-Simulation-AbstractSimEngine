package de.uka.ipd.sdq.simucomframework.resources;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * Listener for resource environment changes.
 * 
 * @author Sebastian Lehrig
 */
public interface IResourceEnvironmentListener {

    public void addedResourceContainer(final ResourceContainer container, long totalContainers);

    public void removedResourceContainer(final ResourceContainer container, long totalContainers);

}
