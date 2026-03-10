package org.polimorfismo;

/**
 * Robotic ships support maneuvering and exploration behaviors
 * via the ISpacecraft, IManeuverable and IExplorer contracts.
 */
public abstract class RoboticShip implements ISpacecraft, IManeuverable, IExplorer {
    
	abstract void getDestination();

    public abstract void explore();
}
