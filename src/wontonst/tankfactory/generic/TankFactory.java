/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.generic;

import wontonst.tankfactory.assemblers.ChassisAssembler;
import wontonst.tankfactory.assemblers.TurretAssembler;
import wontonst.tankfactory.tankparts.generic.Chassis;
import wontonst.tankfactory.tankparts.generic.Engine;
import wontonst.tankfactory.tankparts.generic.Tank;
import wontonst.tankfactory.tankparts.generic.Turret;

/**
 * Abstract factory for creating TankPart objects. Design goals:
 * <ul><li>top-level tank factory system is independent of specialized tank
 * manufacturing techniques</li>
 * <li>unified top-level system for configuration of tanks</li>
 * <li>future repair system should be able to manipulate any tank through single
 * interface</li>
 * <li>a tank is a tank is a tank. internal tank construction details
 * should remain hidden</li>
 *
 * @author wontonst
 */
public abstract class TankFactory {

    protected TurretAssembler turret_assembler;
    protected ChassisAssembler chassis_assembler;

    protected TankFactory(TurretAssembler ta, ChassisAssembler ca) {
        this.chassis_assembler = ca;
        this.turret_assembler = ta;
    }

    public abstract Turret buildTurret();

    public abstract Chassis buildChassis();

    public abstract Tank buildTank(Turret t, Chassis c);
}
