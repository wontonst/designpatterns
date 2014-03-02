/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.generic.operators;

import wontonst.tankfactory.generic.assemblers.TankAssembler;
import wontonst.tank.generic.generic.Chassis;
import wontonst.tank.generic.generic.Tank;
import wontonst.tank.generic.generic.Turret;

/**
 * Builder for creating a tank. Design goals:
 * <ul><li>tanks creation is independent of the creation of the parts that make
 * the tank</li>
 * <li>construction process allows for using different parts on same tank</li>
 *
 * @author rzheng
 */
public class TankBuilder {

    public static Tank buildTank(TankAssembler f) {
        Turret turret = f.buildTurret();
        Chassis chassis = f.buildChassis();
        return f.buildTank(turret, chassis);
    }
}
