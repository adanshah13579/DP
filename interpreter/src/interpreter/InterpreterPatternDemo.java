/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreter;

/**
 *
 * @author skytech laptop store
 */
public class InterpreterPatternDemo {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
     
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
   
    public static Expression getdaughterExpression(){
      Expression staurt = new TerminalExpression("samanta");
      Expression robert = new TerminalExpression("julie");
      return new AndExpression(staurt, robert);		
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isdaughter = getdaughterExpression();
      System.out.println("Stuart is the the son of Robert " + isMale.interpret("John"));
      System.out.println("staurt is a married men? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("samanta is daughter of julie? " + isdaughter.interpret("julie"));
   }
}