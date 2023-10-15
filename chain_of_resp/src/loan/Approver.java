/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loan;

/**
 *
 * @author skytech laptop store
 */
public interface Approver {
    void setNext(Approver next);
    void process(Loan loan);
}
