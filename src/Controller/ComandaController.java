package Controller;

import DAO.ComandaDAO;
import DAO.itemComandaDAO;
import MODEL.Comanda;
import MODEL.itemComanda;
import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ComandaController {

    
    public static boolean salvarComandaEItens(int idCliente, float vlrTotal, ArrayList<itemComanda> listaItens){
    
        //Passo 1 - Salvar a comanda para gerar o ID da venda
        Comanda meuObjeto = new Comanda();
        meuObjeto.setIdCliente(idCliente);
        
        //Neste ponto se for sucesso, já tenho o ID
        ComandaDAO.daoSalvarComanda(meuObjeto);
        
        //Passo 2 - Salvar os Itens da comanda
        
        for(itemComanda item: listaItens){
        
            item.setIdComanda(meuObjeto.getIdComanda());
            itemComandaDAO.SalvarItemLista(item);
        }
        
        return false;
    }
    
    //Recebe os paramentros cria um Objeto de Comanda e emcaminha para ComandaDAO
    public static boolean controllerSalvarComanda(int idClient) {

        Comanda c = new Comanda(idClient);

        return ComandaDAO.daoSalvarComanda(c);
    }

    //Retorna todos as Comandas
    public static ArrayList<Comanda> getComandaList() {
        ArrayList<Comanda> comanda = ComandaDAO.getComanda();
        return comanda;
    }

    //Transforma a lista de Comanda em uma lista de String para ser usada na Tela de Venda
    public static ArrayList<String[]> getComandaLista(ArrayList<itemComanda> listaComanda, ArrayList<String[]> listaVazia) {
        for (itemComanda item : listaComanda) {
            listaVazia.add(new String[]{
                String.valueOf(item.getNomeProduto()),
                String.valueOf(item.getQuantidade()),
                String.valueOf(item.getValorUnitario()),
                String.valueOf(item.getValorTotalProduto())});
        }
        return listaVazia;
    }

    //Transforma a lista de Comanda em uma lista de String para ser usada na Tela de Relatório Analitico
    public static ArrayList<String[]> getListaComanda(ArrayList<itemComanda> listaComanda, ArrayList<String[]> listaVazia) {

        for (itemComanda itens : listaComanda) {
            listaVazia.add(new String[]{
                String.valueOf(itens.getNomeProduto()),
                String.valueOf(itens.getQuantidade()),
                String.valueOf(itens.getValorTotalProduto())});
        }

        return listaVazia;
    }

    //Transforma a lista de Comanda em uma lista de String para ser usada na Tela de Relatório Sintetico
    public static ArrayList<String[]> getListaRelatorioSintetico(ArrayList<Comanda> listaComanda,
            ArrayList<String[]> listaVazia, int i) {

        listaVazia.add(new String[]{
            String.valueOf(listaComanda.get(i).getIdComanda()),
            String.valueOf(listaComanda.get(i).getNomeCliente()),
            String.valueOf(listaComanda.get(i).getValorTotal()),
            String.valueOf(listaComanda.get(i).getData())
        });

        return listaVazia;
    }
}
