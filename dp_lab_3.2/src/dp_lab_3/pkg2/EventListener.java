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

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}