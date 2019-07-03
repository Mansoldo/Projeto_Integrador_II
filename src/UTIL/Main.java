package UTIL;

import View.ViewTelaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class Main {

    public static void main(String[] args) {
        //Try Catch para setar uma aparencia para as telas.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Inicializa a Tela Principal da LOJA ELETRONICOS
        ViewTelaPrincipal p = new ViewTelaPrincipal();
        p.setVisible(true);
    }

}
