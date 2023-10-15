/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loan;

/**
 *
 * @author skytech laptop store
 */
public class Demo {

    public static void main(String[] args) {
        BankEmployee clerk = new BankEmployee("Clerk", 10000);
        BankEmployee assistantManager = new BankEmployee("Assistant Manager", 25000);
        BankEmployee manager = new BankEmployee("Manager", 300000);

        clerk.setNext(assistantManager);
        assistantManager.setNext(manager);

        Loan loan = new Loan("5", 10100, "House Repair",0.05);
        clerk.process(loan);

        loan = new Loan("9", 300000, "car damage",0.1);
        clerk.process(loan);
    }
}
