/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abttract_factoryy;

/**
 *
 * @author fa20-bse-036
 */
public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      }else if(shapeType.equalsIgnoreCase("traingle")){
         return new Traingle();
      }		 
      return null;
   }

    private static class Traingle implements Shape {

        public Traingle() {
        }

        @Override
        public void draw() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
