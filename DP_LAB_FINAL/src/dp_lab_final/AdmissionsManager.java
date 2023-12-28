/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dp_lab_final;

/**
 *
 * @author skytech laptop store
 */
public class AdmissionsManager {
    private static AdmissionsManager instance;

    private AdmissionsManager() {
        // private constructor to enforce singleton
    }

    public static AdmissionsManager getInstance() {
        if (instance == null) {
            instance = new AdmissionsManager();
        }
        return instance;
    }

    public void processApplication(Application application) {
        // Application processing logic
    }
}

