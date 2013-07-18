/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.generic;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rzheng
 */
public class TankPart {

    protected List<TankPart> subassembly = new LinkedList<>();///<list of sub-components
    protected String description;///< custom description of part
    protected String model_name;///< manufacturer or tank model name associated with this part
    protected TankPartType type;

    protected TankPart(String n, TankPartType t) {
        this.model_name = n;
        this.type = t;
    }

    public String getConfiguration() {
        String treturn = this.model_name + " " + this.type.toString();

        for (TankPart t : this.subassembly) {
            treturn += "\n\t" + t.getModelName()+ " " + t.type.toString();
        }
        return treturn;
    }

    public String getModelName() {
        return this.model_name;
    }
    public TankPartType getType(){
        return this.type;
    }
    protected void addPart(TankPart p){
        this.subassembly.add(p);
    }
}
