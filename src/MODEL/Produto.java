package MODEL;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class Produto {

    private static int qtdProdutoCriado;
    private int id;
    private String nomeProduto;
    private String categoriaProduto;
    private String marcaProduto;
    private String modeloProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double valorProduto;
    private static int editarID;

    public Produto() {
        /*
        qtdProdutoCriado++;
        this.id = qtdProdutoCriado;
         */
    }

    //Construtor de um novo Produto
    public Produto(String nomeProduto, String categoriaProduto, String marcaProduto, String modeloProduto, String descricaoProduto, int quantidadeProduto, double valorProduto) {
        //qtdProdutoCriado++;
        //this.id = qtdProdutoCriado;
        this.nomeProduto = nomeProduto;
        this.categoriaProduto = categoriaProduto;
        this.marcaProduto = marcaProduto;
        this.modeloProduto = modeloProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }

    //Construtor para atualizar um produto
    public Produto(int id, String nomeProduto, String categoriaProduto, String marcaProduto, String modeloProduto, String descricaoProduto, int quantidadeProduto, double valorProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.categoriaProduto = categoriaProduto;
        this.marcaProduto = marcaProduto;
        this.modeloProduto = modeloProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }

    //Retorno da Quantidade de produtos Criados
    public static int getQtdProdutoCriado() {
        return qtdProdutoCriado;
    }

    //Atribui a Quantidade de produtos criados
    public static void setQtdProdutoCriado(int qtdProdutoCriado) {
        Produto.qtdProdutoCriado = qtdProdutoCriado;
    }

    //Retorno do IDProduto
    public int getId() {
        return id;
    }

    //Atribui idProduto
    public void setId(int id) {
        this.id = id;
    }

    //Retorno do nomeProduto
    public String getNomeProduto() {
        return nomeProduto;
    }

    //Atribui o nomeProduto
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //Retorno da categoria do produto
    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    //Atribui a categoria do produto
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    //Retorno da Marca do produto
    public String getMarcaProduto() {
        return marcaProduto;
    }

    //Atribui a Marca do produto 
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    //Retorno do Modelo do Produto
    public String getModeloProduto() {
        return modeloProduto;
    }

    //Atribui o Modelo do Produto
    public void setModeloProduto(String modeloProduto) {
        this.modeloProduto = modeloProduto;
    }

    //Retorno da Descrição do Produto
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    //Atribui a Descrição do Produto
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    //Retorno da Quantidade de produtos em estoque
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    //Atribui a Quantidade de produtos em estoque
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    //Retorno do Valor do Produto
    public double getValorProduto() {
        return valorProduto;
    }

    //Atribui a Quantidade de produtos criados
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    //Atribui o Valor do Produto
    public void inserirIDEditar(int ID) {
        this.editarID = ID;
    }

    //Retorno do ID para Edição do Produto
    public static int receberIDEditar() {
        return editarID;
    }

    //Atribui o ID para Edição do Produto
    public void atualizarEstoque(int item) {
        this.quantidadeProduto -= item;
    }
}
