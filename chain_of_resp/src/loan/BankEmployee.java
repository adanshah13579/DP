/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loan;

/**
 *
 * @author skytech laptop store
 */
public class BankEmployee extends BaseApprover {
    private final String title;
    private final int approvalLimit;

    public BankEmployee(String title, int approvalLimit) {
        this.title = title;
        this.approvalLimit = approvalLimit;
    }

    public void process(Loan loan) {
        int modifiedApprovalLimit = (int) (approvalLimit * (1 + loan.getInterestRate()));
        if (loan.getAmount() <= modifiedApprovalLimit) {
            System.out.println(loan + " is approved by " + title);
        } else if (next != null) {
            System.out.println(title + " forwards the loan " + loan.getSerialNumber() + " for processing");
            next.process(loan);
        } else {
            System.out.println(loan + " cannot be processed");
        }

    }

}