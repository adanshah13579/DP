/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loan;

/**
 *
 * @author skytech laptop store
 */
public abstract class BaseApprover implements Approver {
    protected Approver next = null;

    public void setNext(Approver next) {
        this.next = next;
    }
}
