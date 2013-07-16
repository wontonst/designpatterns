/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.interfaces;

import wontonst.tankfactory.tankparts.generic.Chassis;
import wontonst.tankfactory.tankparts.generic.Engine;
import wontonst.tankfactory.tankparts.generic.Tank;
import wontonst.tankfactory.tankparts.turret.Turret;

/**
 * Abstract factory for creating TankPart objects.
 * Design goals:
 * - top-level tank factory system is independent of specialized tank manufacturing techniques
 * - unified top-level system for configuration of tanks
 * - future repair system should be able to manipulate any tank through single interface
 * - a tank is a tank is a tank. internal tank construction details should remain secret
 * @author wontonst
 */
public interface TankFactory {
    public Turret buildTurret();
    public Chassis buildChassis(Engine e);
    public Tank buildTank(Turret t, Chassis c);
}
