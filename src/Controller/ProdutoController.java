package Controller;

import DAO.ProdutoDAO;
import MODEL.Produto;
import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ProdutoController {

    //Metodo que recebe os dados de Produto, cria um Objeto do Mesmo e manda o Objeto Criado para ProdutoDAO
    public static boolean controllerSalvarProduto(String nome,
            String categoria, String marca, String modelo,
            String descricao, int quantidade, double valor) {

        Produto p = new Produto(nome, categoria, marca, modelo, descricao, quantidade, valor);

        return ProdutoDAO.daoSalvarProduto(p);
    }

    //Metodo que recebe os dados de Produto atualizados, cria um Objeto do Mesmo e manda o Objeto Criado para ProdutoDAO
    public static boolean controllerEditarProduto(int ID, String nome,
            String categoria, String marca, String modelo,
            String descricao, int quantidade, double valor) {

        Produto p = new Produto(ID, nome, categoria, marca, modelo, descricao, quantidade, valor);

        return ProdutoDAO.daoEditarProduto(p);
    }

    //retorna a lista de produtos
    public static ArrayList<Produto> getProdutoList() {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        return produtos;
    }

    //Método que localiza o produto, e retorna os dados numa lista vazia para o preenchimento de campos na tabela
    public static int controllerUltimoID() {

        return ProdutoDAO.daoUltimoID();
    }

    //PESQUISA PELO NOME	
    public static ArrayList<String[]> getProdutoNome(ArrayList<String[]> listaVazia, String nome) {

        ArrayList<Produto> produto = ProdutoDAO.getProdutos();
        //ArrayList<String[]> listaVazia = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {

            if (produto.get(i).getNomeProduto().equals(nome)) {
                listaVazia.add(new String[]{
                    String.valueOf(produto.get(i).getId()),
                    String.valueOf(produto.get(i).getNomeProduto()),
                    String.valueOf(produto.get(i).getCategoriaProduto()),
                    String.valueOf(produto.get(i).getMarcaProduto()),
                    String.valueOf(produto.get(i).getModeloProduto()),
                    String.valueOf(produto.get(i).getDescricaoProduto()),
                    String.valueOf(produto.get(i).getQuantidadeProduto()),
                    String.valueOf(produto.get(i).getValorProduto())
                });
            }
        }
        return listaVazia;
    }

    //PESQUISA PELA CATEGORIA
    public static ArrayList<String[]> getProdutoCategoria(ArrayList<String[]> listaVazia, String nome) {

        ArrayList<Produto> produto = ProdutoDAO.getProdutos();
        //ArrayList<String[]> listaVazia = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {

            if (produto.get(i).getCategoriaProduto().equals(nome)) {
                listaVazia.add(new String[]{
                    String.valueOf(produto.get(i).getId()),
                    String.valueOf(produto.get(i).getNomeProduto()),
                    String.valueOf(produto.get(i).getCategoriaProduto()),
                    String.valueOf(produto.get(i).getMarcaProduto()),
                    String.valueOf(produto.get(i).getModeloProduto()),
                    String.valueOf(produto.get(i).getDescricaoProduto()),
                    String.valueOf(produto.get(i).getQuantidadeProduto()),
                    String.valueOf(produto.get(i).getValorProduto())
                });
            }
        }
        return listaVazia;
    }

    //PESQUISA PELA MARCA
    public static ArrayList<String[]> getProdutoMarca(ArrayList<String[]> listaVazia, String nome) {

        ArrayList<Produto> produto = ProdutoDAO.getProdutos();
        //ArrayList<String[]> listaVazia = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {

            if (produto.get(i).getMarcaProduto().equals(nome)) {
                listaVazia.add(new String[]{
                    String.valueOf(produto.get(i).getId()),
                    String.valueOf(produto.get(i).getNomeProduto()),
                    String.valueOf(produto.get(i).getCategoriaProduto()),
                    String.valueOf(produto.get(i).getMarcaProduto()),
                    String.valueOf(produto.get(i).getModeloProduto()),
                    String.valueOf(produto.get(i).getDescricaoProduto()),
                    String.valueOf(produto.get(i).getQuantidadeProduto()),
                    String.valueOf(produto.get(i).getValorProduto())
                });
            }
        }
        return listaVazia;
    }

    //PESQUISA PELO MODELO
    public static ArrayList<String[]> getProdutoModelo(ArrayList<String[]> listaVazia, String nome) {

        ArrayList<Produto> produto = ProdutoDAO.getProdutos();
        //ArrayList<String[]> listaVazia = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {

            if (produto.get(i).getModeloProduto().equals(nome)) {
                listaVazia.add(new String[]{
                    String.valueOf(produto.get(i).getId()),
                    String.valueOf(produto.get(i).getNomeProduto()),
                    String.valueOf(produto.get(i).getCategoriaProduto()),
                    String.valueOf(produto.get(i).getMarcaProduto()),
                    String.valueOf(produto.get(i).getModeloProduto()),
                    String.valueOf(produto.get(i).getDescricaoProduto()),
                    String.valueOf(produto.get(i).getQuantidadeProduto()),
                    String.valueOf(produto.get(i).getValorProduto())
                });
            }
        }
        return listaVazia;
    }

    //Metodo que passa de parametro o ID do produto que será Excluido
    public static boolean controllerExcluirProduto(int ID) {
        return ProdutoDAO.daoExcluirProduto(ID);
    }

}
