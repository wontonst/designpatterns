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
public class ArmorPiercingDiscardingSabotShell extends Shell {

    Sabot sabot;

    public ArmorPiercingDiscardingSabotShell(double c, Sabot s) {
        super(c);
        this.sabot = s;
        this.subassembly.add(s);
    }

    @Override
    public String getType() {
        return "Discarding-sabot Armor-Piercing";
    }
}
