/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tank.t72.generic;

import wontonst.tankfactory.generic.TankFactory;
import wontonst.tank.t72.chassis.T72Chassis;
import wontonst.tank.t72.tank.T72Tank;
import wontonst.tank.t72.turret.T72Turret;
import wontonst.tank.generic.generic.Chassis;
import wontonst.tank.generic.generic.Tank;
import wontonst.tank.generic.generic.Turret;

/**
 *
 * @author rzheng
 */
public class T72TankFactory extends TankFactory {

    public T72TankFactory() {
        super(null, null);
    }

    @Override
    public Turret buildTurret() {
        return new T72Turret();
    }

    @Override
    public Chassis buildChassis() {
        return new T72Chassis();
    }

    @Override
    public Tank buildTank(Turret t, Chassis c) {
        return new T72Tank(c, t);
    }
}
