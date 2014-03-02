/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tank.t72.tank;

import wontonst.tankfactory.generic.operators.TankBuilder;
import wontonst.tank.t72.generic.T72TankFactory;
import wontonst.tankfactory.t72factory.global.Constants;
import wontonst.tank.generic.generic.Chassis;
import wontonst.tank.generic.generic.Tank;
import wontonst.tank.generic.generic.Turret;

/**
 *
 * @author rzheng
 */
public class T72Tank extends Tank{
    Chassis chassis;
    Turret turret;
    public T72Tank(Chassis c, Turret t){
        super(Constants.TANK_NAME);
        this.chassis = c;
        this.addPart(c);
        this.turret = t;
        this.addPart(t);
    }
    
    public static void main(String[] args){
        Tank t = TankBuilder.buildTank(new T72TankFactory());
        System.out.println(t.getConfiguration());
    }
}
