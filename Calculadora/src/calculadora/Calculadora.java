package calculadora;

import javax.swing.UIManager;

/**
 *
 * @author asael
 */
public class Calculadora {

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

        }catch(Exception ex){
            System.out.println("error");
        }
        CalcUI ui = new CalcUI();
        ui.setSize(455,370);
        ui.setVisible(true);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
    }
}
