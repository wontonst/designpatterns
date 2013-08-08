/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.generic;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rzheng
 */
public abstract class Part {

    protected List<Part> subassembly = new LinkedList<>();///<list of sub-components
    protected String description;///< custom description of part

    public String getConfiguration() {
        String treturn = this.toString();

        for (Part t : this.subassembly) {
            treturn += "\n\t" + t.getConfiguration();
        }
        return treturn;
    }

    public String toString() {
        return this.description;
    }

    protected void addPart(Part p) {
        this.subassembly.add(p);
    }
}
