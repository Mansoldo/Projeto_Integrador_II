package Controller;

import DAO.itemComandaDAO;
import MODEL.itemComanda;
import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class itemComandaController {

    //Recebe os dados para Criar um item Comanda e Encaminhar esse Objeto para a DAO itemComandaDAO
    public static boolean controllerSalvarItem(int idProduto, int Quantidade, double valorProduto) {

        itemComanda item = new itemComanda(idProduto, Quantidade, valorProduto);

        return itemComandaDAO.SalvarItemLista(item);
    }

    //Recebe os Itens cadastrados em itemComanda
    public static ArrayList<itemComanda> getItensList() {
        ArrayList<itemComanda> item = itemComandaDAO.getItens();
        return item;
    }

    //Exclui todos os itemComanda que existe dentro da lista para que seja efetuada uma nova Venda
    public static void limparlista() {
        itemComandaDAO.daoExcluiritem();
    }

    public static ArrayList<String[]> getItemLista(ArrayList<itemComanda> listaItem, ArrayList<String[]> listaVazia, String nomeProduto) {
        
        for (itemComanda item : listaItem) {
            listaVazia.add(new String[]{
                String.valueOf(nomeProduto),
                String.valueOf(item.getQuantidade()),
                String.valueOf(item.getValorUnitario()),
                String.valueOf(item.getValorTotalProduto())});
        }
        return listaVazia;
    }

}
