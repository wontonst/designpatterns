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

    List<TankPart> subassembly = new LinkedList<TankPart>();
    String model_name;
    TankPartType type;

    protected TankPart(String n, TankPartType t) {
        this.model_name = n;
        this.type = t;
    }

    public String getConfiguration() {
        String treturn = this.model_name + "\n";

        for (TankPart t : this.subassembly) {
            treturn += "\n\t" + t.getName();
        }
        return treturn;
    }

    public String getName() {
        return this.model_name;
    }
}
