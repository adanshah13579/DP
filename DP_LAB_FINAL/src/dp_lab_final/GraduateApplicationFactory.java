/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_lab_final;

/**
 *
 * @author skytech laptop store
 */
public class GraduateApplicationFactory implements ApplicationFactory {
    @Override
    public Application createApplication() {
        return new GraduateApplication();
    }
}