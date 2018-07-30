package calculadora;

import javax.swing.UIManager;

/**
 *
 * @author asael
 */
public class Calculadora {

    public static void main(String[] args) {
        
        //Prueba a setear una interfaz diferente
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

        }catch(Exception ex){
            System.out.println("error");
        }
        
        //Crea el frame y lo hace visible
        CalcUI ui = new CalcUI();
        ui.setSize(455,370);
        ui.setVisible(true);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
    }
}
