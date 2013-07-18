/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.operators;

import wontonst.tankfactory.generic.TankFactory;
import wontonst.tankfactory.tankparts.generic.Chassis;
import wontonst.tankfactory.tankparts.generic.Tank;
import wontonst.tankfactory.tankparts.turret.Turret;

/**
 *
 * @author rzheng
 */
public class TankBuilder {
    
    public static Tank buildTank(TankFactory f){
        Turret turret = f.buildTurret();
        Chassis chassis  =f.buildChassis();
        return f.buildTank(turret, chassis);
    }
}
