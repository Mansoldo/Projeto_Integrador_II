package MODEL;

import Controller.itemComandaController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public final class Comanda {

    private static int qtdComandasCriadas;
    private int IdComanda;
    private String nomeCliente;    
    private double valorTotal;
    private int IdCliente;
    private String data;
    private int posicao = -1;

    public Comanda() {

    }

    //Construtos da Classe Comanda, na qual recebe todos os valores de ID do Cliente Nome do Cliente o ArrayList com os Itens da Compra e o valor total da compra.
    public Comanda(int idClient) {
        //qtdComandasCriadas++;        
        Date hoje = new Date();
        SimpleDateFormat formatadorDatas = new SimpleDateFormat("dd/MM/yyyy");
        data = formatadorDatas.format(hoje);
        this.IdCliente = idClient;       
        
    }

    //Retorna o ID da Comanda
    public int getIdComanda() {
        return IdComanda;
    }

    //Atribui o Id da Comanda
    public void setIdComanda(int IdComanda) {
        this.IdComanda = IdComanda;
    }

    //Retorna o nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }

    //Atribui o Nome do Cliente
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }



    //Retorna o Valor total da compra
    public double getValorTotal() {
        return valorTotal;
    }



    //Retorna o id do Cliente
    public int getIdCliente() {
        return IdCliente;
    }

    //Atribui o id do Cliente
    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    //Retorna o ID da Comanda
    public String getData() {
        return data;
    }

    //Atribui a Data da Venda
    public void setData(String data) {
        this.data = data;
    }

    //Retorna a quantidad de comandas criadas
    public static int getQtdComandasCriadas() {
        return qtdComandasCriadas;
    }

    //Atribui a quantidade de comandas criadas
    public static void setQtdComandasCriadas(int aQtdComandasCriadas) {
        qtdComandasCriadas = aQtdComandasCriadas;
    }


}
