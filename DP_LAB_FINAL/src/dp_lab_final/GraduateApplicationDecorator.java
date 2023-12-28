/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_lab_final;

/**
 *
 * @author skytech laptop store
 */
public abstract class GraduateApplicationDecorator extends Application {
    private final Application application;

    public GraduateApplicationDecorator(Application application) {
        this.application = application;
    }

    @Override
    public void submit() {
        application.submit();
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescription() {
        return application.getDescription();
    }

    public abstract void additionalBehavior();
}



    


