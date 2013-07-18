/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.tankparts.generic;

import wontonst.tankfactory.generic.TankPart;
import wontonst.tankfactory.generic.TankPartType;

/**
 *
 * @author rzheng
 */
public class Tank extends TankPart {

    public Tank(String model) {
        super(model, TankPartType.TANK);
    }
}
