/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.generic;

import wontonst.generic.Part;

/**
 *
 * @author rzheng
 */
public class TankPart extends Part {

    protected String model_name;///< manufacturer or tank model name associated with this part
    protected TankPartType type;

    protected TankPart(String n, TankPartType t) {
        this.model_name = n;
        this.type = t;
    }

    public String getModelName() {
        return this.model_name;
    }
    public TankPartType getType(){
        return this.type;
    }
    public String toString(){
        return this.model_name + " " + this.type.toString();
    }
}
