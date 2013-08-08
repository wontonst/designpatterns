/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.shells.armorpiercing;

import wontonst.shells.generic.Shell;

/**
 *
 * @author rzheng
 */
public class ArmorPiercingShell extends Shell{
    
    public ArmorPiercingShell(double calibre){
        super(calibre);
    }

    @Override
    public String getType() {
       return "Armor-Piercing";
    }
    
}
