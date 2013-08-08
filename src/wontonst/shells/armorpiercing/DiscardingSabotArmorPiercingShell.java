/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.shells.armorpiercing;

import wontonst.shells.generic.Shell;
import wontonst.shells.sabot.Sabot;

/**
 *
 * @author rzheng
 */
public class DiscardingSabotArmorPiercingShell extends Shell{
    
    Sabot sabot;
    
    public DiscardingSabotArmorPiercingShell(double c, Sabot s){
        super(c);
        this.sabot = s;
    }

    @Override
    public String getType() {
return "Discarding-sabot Armor-Piercing";
    }
}
