/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.shells.fin;

import wontonst.generic.Part;

/**
 *
 * @author rzheng
 */
public class Fin extends Part implements FinInterface {

    public Fin() {
    }

    @Override
    public String getType() {
        return "Fin";
    }
}
