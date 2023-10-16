/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitorr;

/**
 *
 * @author skytech laptop store
 */
public class Visitorr {

    /**
     */
   public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
}
