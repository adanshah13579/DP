/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author fa20-bse-036
 */
public abstract class Tea implements Item {

   @Override
   public Packing packing() {
      return new cup();
   }

   @Override
   public abstract float price();
}

