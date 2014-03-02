/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wontonst.tankfactory.generic.assemblers;

import java.util.ArrayList;
import java.util.List;
import wontonst.tank.generic.generic.TankPart;

/**
 *
 * @author RoyZheng
 */
public abstract class Assembler {

    private List<Assembler> subassembly = new ArrayList<Assembler>();
    
   public abstract TankPart build(int number);
   
   private void addSubassembly(Assembler a){
       this.subassembly.add(a);
   }
   private void removeSubassembly(Assembler a){
       this.subassembly.remove(a);
   }
}
