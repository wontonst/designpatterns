/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.t72factory.generic;

import wontonst.tankfactory.generic.TankFactory;
import wontonst.tankfactory.t72factory.chassis.T72Chassis;
import wontonst.tankfactory.t72factory.tank.T72Tank;
import wontonst.tankfactory.t72factory.turret.T72Turret;
import wontonst.tankfactory.tankparts.generic.Chassis;
import wontonst.tankfactory.tankparts.generic.Tank;
import wontonst.tankfactory.tankparts.generic.Turret;

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
