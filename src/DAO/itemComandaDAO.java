package DAO;

import MODEL.itemComanda;
import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class itemComandaDAO {

    private final static ArrayList<itemComanda> listaItem = new ArrayList<>();

    //Metodo para Salvar Itens 
    public static boolean SalvarItemLista(itemComanda item) {
        listaItem.add(item);
        return true;
    }

    public static ArrayList<itemComanda> getItens() {
        return itemComandaDAO.listaItem;
    }

    public static boolean daoSalvarItem(itemComanda item) {
        return SimulaDB.getInstance().SalvarItem(item);
    }

    //Metodo para retornar os Itens cadastrados
    /*
    public static ArrayList<itemComanda> getItens() {
        return SimulaDB.getInstance().getItens();
    }
     */
    //Metodo para Excluir Itens cadastrados
    public static boolean daoExcluiritem() {

        listaItem.clear();
        return true;
    }

}
