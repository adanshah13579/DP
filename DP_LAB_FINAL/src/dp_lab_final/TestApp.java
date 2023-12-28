/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_lab_final;

/**
 *
 * @author skytech laptop store
 */
public class TestApp {
    public static void main(String[] args) {
        // Test the application
        AdmissionsManager admissionsManager = AdmissionsManager.getInstance();

        ApplicationFactory undergradFactory = new UndergraduateApplicationFactory();
        Application undergradApp = undergradFactory.createApplication();

        ApplicationFactory gradFactory = new GraduateApplicationFactory();
        Application gradApp = gradFactory.createApplication();

        AdmissionStrategy meritBased = new MeritBasedAdmission();

        gradApp = new AdditionalFeatureDecorator(gradApp);

        gradApp.submit();
        gradApp.getDescription();

        admissionsManager.processApplication(gradApp);

        gradApp.setAdmissionStrategy(meritBased);
        gradApp.evaluateAdmission();

        undergradApp.addObserver((ApplicationStatusObserver) undergradApp);
        undergradApp.setStatus("Undergraduate application submitted");
    }
}
