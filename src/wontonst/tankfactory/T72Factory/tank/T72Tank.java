/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.t72factory.tank;

import wontonst.tankfactory.operators.TankBuilder;
import wontonst.tankfactory.t72factory.generic.T72TankFactory;
import wontonst.tankfactory.t72factory.global.Constants;
import wontonst.tankfactory.tankparts.generic.Chassis;
import wontonst.tankfactory.tankparts.generic.Tank;
import wontonst.tankfactory.tankparts.generic.Turret;

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
