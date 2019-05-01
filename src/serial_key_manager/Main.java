/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serial_key_manager;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author stark
 */
public class Main {
    public static void main(String[] args) {
        try {
            LookAndFeel dl = new WindowsLookAndFeel();
            UIManager.setLookAndFeel(dl);
        } catch (Exception e) {
        }
        new skm().setVisible(true);
    }
}
