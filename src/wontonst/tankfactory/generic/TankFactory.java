/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.generic;

import wontonst.tankfactory.generic.assemblers.ChassisAssembler;
import wontonst.tankfactory.generic.assemblers.TurretAssembler;
import wontonst.tank.generic.generic.Chassis;
import wontonst.tank.generic.generic.Engine;
import wontonst.tank.generic.generic.Tank;
import wontonst.tank.generic.generic.Turret;

/**
 * Abstract factory for creating TankPart objects. 
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
