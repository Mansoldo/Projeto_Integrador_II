package DAO;

import MODEL.Comanda;
import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ComandaDAO {

    //Passa a Comanda por parametro para ser Salva
    public static boolean daoSalvarComanda(Comanda c) {
        //Mando gravar no banco 
        //c.setIdComanda(5); // Retorno o Id da comanda gerada pelo banco
        
        return SimulaDB.getInstance().SalvarComanda(c);
    }

    //Retorna as Comandas Salvas
    public static ArrayList<Comanda> getComanda() {
        return SimulaDB.getInstance().getComanda();
    }

}
