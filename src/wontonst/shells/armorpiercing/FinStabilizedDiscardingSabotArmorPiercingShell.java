/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.shells.armorpiercing;

import wontonst.shells.fin.Fin;
import wontonst.shells.sabot.Sabot;

/**
 *
 * @author rzheng
 */
public class FinStabilizedDiscardingSabotArmorPiercingShell extends DiscardingSabotArmorPiercingShell {

    Fin fin;

    public FinStabilizedDiscardingSabotArmorPiercingShell(double c, Sabot s, Fin f) {
        super(c, s);
        this.fin = f;
        this.subassembly.add(this.fin);
    }

    @Override
    public String getType() {
        return "Fin-stabilized Discarding-sabot Armor-piercing";
    }
}
