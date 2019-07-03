package MODEL;

import DAO.ProdutoDAO;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class itemComanda {

    private int IdItemComanda;
    private int IdComanda;
    private int IdProduto;
    private double valorUnitario;
    private int quantidade;    
    private double valorTotalProduto;

    public itemComanda() {
        /*Construtor da Comanda pegando os valores de idProduto, NomeProduto, Quantidade e Valor unitário,
        E fazendo o calculo do valor total do produto relacionado ao valor unitario e a quantidade*/
    }

    public itemComanda(int idProduto, int quantidade, double valorUnitario) {
        this.IdProduto = idProduto;        
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotalProduto = valorUnitario * quantidade;        
    }

    //Metodo responsavel por decrementar os itens do estoque ao efetuar a compra.
    public void DecrementarEstoque(Produto produto, int ID, int quantidade) {

        ProdutoDAO.atualizarEstoque(produto, ID, quantidade);//Atualiza na base de dados a quantidade do produto em estoque
    }

    //Retorna o idItemComanda
    public int getIdItemComanda() {
        return IdItemComanda;
    }

    //Atribui o idItemComanda
    public void setIdItemComanda() {
        this.IdItemComanda++;
    }

    //Retorno o idComdanda
    public int getIdComanda() {
        return IdComanda;
    }

    //Atribui o idComanda
    public void setIdComanda(int IdComanda) {
        this.IdComanda = IdComanda;
    }

    //Retorno o idProduto
    public int getIdProduto() {
        return IdProduto;
    }

    //Atribui o idProduto
    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    //Retorno o ValorUnitario
    public double getValorUnitario() {
        return valorUnitario;
    }

    //Atribui o ValorUnitario
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    //Retorno o Quantidade
    public int getQuantidade() {
        return quantidade;
    }

    //Atribui o Quantidade
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Retorno o nomeDoProduto
    public String getNomeProduto() {
        return nomeProduto;
    }

    //Atribui o nomeDoProduto
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //Retorno o ValorTotal
    public double getValorTotalProduto() {
        return valorTotalProduto;
    }

    //Atribui o ValorTotal
    public void setValorTotalProduto() {
        this.valorTotalProduto = valorUnitario * quantidade;
    }
}
