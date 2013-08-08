/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.shells.generic;

import wontonst.generic.Part;

/**
 *
 * @author rzheng
 */
public abstract class Shell extends Part implements ShellInterface{

    double calibre;

    public Shell(double cb) {
        this.calibre = cb;
    }

}
