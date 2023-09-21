/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_lab_3.pkg2;

/**
 *
 * @author fa20-bse-036
 */
import dp_lab_3.pkg2.Editor;
import dp_lab_3.pkg2.EmailNotificationListener;
import dp_lab_3.pkg2.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("adanshah13579@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}