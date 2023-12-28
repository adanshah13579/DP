/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_lab_final;

/**
 *
 * @author skytech laptop store
 */







public class Application {
    private AdmissionStrategy admissionStrategy;

    public void setAdmissionStrategy(AdmissionStrategy admissionStrategy) {
        this.admissionStrategy = admissionStrategy;
    }

    public boolean evaluateAdmission() {
        return admissionStrategy.evaluate(this);
    }

    // Other application methods and properties

    void submit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    void addObserver(ApplicationStatusObserver applicationStatusObserver) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setStatus(String undergraduate_application_submitted) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
