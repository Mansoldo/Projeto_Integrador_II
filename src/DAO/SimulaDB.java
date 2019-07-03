package DAO;

import MODEL.Cliente;
import MODEL.Comanda;
import MODEL.Produto;
import MODEL.itemComanda;

import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class SimulaDB {

    private static SimulaDB mockdb;

    private final ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private final ArrayList<Produto> listaProdutos;//Simulo a tabela de Produto
    private final ArrayList<Comanda> listaComanda;//Simulo a tabela de Comanda
    private final ArrayList<itemComanda> listaItens;//Simulo a tabela de Item Comanda

    private SimulaDB() {

        listaClientes = new ArrayList<Cliente>();
        listaProdutos = new ArrayList<Produto>();
        listaComanda = new ArrayList<Comanda>();
        listaItens = new ArrayList<itemComanda>();
    }

    //Simula a Sincronia com o banco de dados
    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }
        return mockdb;
    }

    //Metodo que Salva os dados do produto dentro do ArrayList
    public boolean SalvarProduto(Produto p) {

        for (Produto lista : listaProdutos) {
            //Validação para que não possa ter 2 cliente Com os mesmos dados cadastrais
            if (lista.getNomeProduto().equals(p.getNomeProduto())
                    && lista.getCategoriaProduto().equals(p.getCategoriaProduto())
                    && lista.getMarcaProduto().equals(p.getMarcaProduto())
                    && lista.getModeloProduto().equals(p.getModeloProduto())) {

                //devido ao incremento da variável que assume o ID, caso entre na condicional, é decrementado
                Produto.setQtdProdutoCriado(p.getId() - 1);
                return false;
            }
        }
        listaProdutos.add(p);
        return true;
    }

    //Metodo que Salva a Comanda
    public boolean SalvarComanda(Comanda c) {
        listaComanda.add(c);
        return true;
    }

    //Metodo que salva os Itens da Comanda
    public boolean SalvarItem(itemComanda item) {
        listaItens.add(item);
        return true;
    }

    //Metodo que Salva os Clientes
    public boolean SalvarClientes(Cliente C) {

        for (Cliente lista : listaClientes) {
            //Validação para que não possa ter 2 Produtos Com os mesmos dados cadastrais
            if (lista.getNome().equals(C.getNome())
                    && lista.getNascimento().equals(C.getNascimento())
                    && lista.getCPF().equals(C.getCPF())
                    && lista.getSexo().equals(C.getSexo())
                    && lista.getEstadoCivil().equals(C.getEstadoCivil())
                    && lista.getRua().equals(C.getRua())
                    && lista.getNumero().equals(C.getNumero())
                    && lista.getComplemento().equals(C.getComplemento())
                    && lista.getCidade().equals(C.getCidade())
                    && lista.getUf().equals(C.getUf())
                    && lista.getCep().equals(C.getCep())
                    && lista.getTelefone().equals(C.getTelefone())
                    && lista.getEmail().equals(C.getEmail())) {

                Cliente.setQtdClienteCriado(C.getId() - 1);
                return false;
            }
        }

        listaClientes.add(C);
        return true;
    }

    //Retorna o ArrayList de Clientes
    public ArrayList<Cliente> getClientes() {
        return this.listaClientes;
    }

    //Retorna o ArrayList de Produto
    public ArrayList<Produto> getProdutos() {
        return this.listaProdutos;
    }

    //Retorna o ArrayList de Comanda
    public ArrayList<Comanda> getComanda() {
        return this.listaComanda;
    }

    //Retorna o ArrayList de item Comanda
    public ArrayList<itemComanda> getItens() {
        return this.listaItens;
    }

    //Edita os dados de Um cliente Cadastrado
    public boolean EditarCliente(Cliente p) {
        for (Cliente item : listaClientes) {
            if (item.getId() == p.getId()) {//Valida se o Cliente está cadastrado
                //Atribui os novos valores para esse produto
                item.setNome(p.getNome());
                item.setNascimento(p.getNascimento());
                item.setCPF(p.getCPF());
                item.setSexo(p.getSexo());
                item.setEstadoCivil(p.getEstadoCivil());
                item.setRua(p.getRua());
                item.setNumero(p.getNumero());
                item.setComplemento(p.getComplemento());
                item.setCidade(p.getCidade());
                item.setUf(p.getUf());
                item.setCep(p.getCep());
                item.setTelefone(p.getTelefone());
                item.setEmail(p.getEmail());
            }
        }

        return true;
    }

    //Edita um produto Cadastrado
    public boolean EditarProduto(Produto p) {

        for (Produto item : listaProdutos) {

            if (item.getId() == p.getId()) {//Valida se o Produto está cadastrado
                //Atribui os novos valores para esse produto
                item.setNomeProduto(p.getNomeProduto());
                item.setCategoriaProduto(p.getCategoriaProduto());
                item.setMarcaProduto(p.getMarcaProduto());
                item.setModeloProduto(p.getModeloProduto());
                item.setDescricaoProduto(p.getDescricaoProduto());
                item.setQuantidadeProduto(p.getQuantidadeProduto());
                item.setValorProduto(p.getValorProduto());

            }
        }
        return true;
    }

    //Remove Clientes da lista
    public boolean ExcluirCliente(int cliente) {
        Cliente clienteExcluir = new Cliente();
        boolean existeNaLista = false;
        for (Cliente c : listaClientes) {

            if (c.getId() == cliente) {//Verifica se o Cliente Esta na lista
                clienteExcluir = c;
                existeNaLista = true;
            }
        }

        if (existeNaLista) {//Caso for verdadeiro ele remove esse elemento
            listaClientes.remove(clienteExcluir);
        }

        return true;
    }

    //Exclui produtos da lista
    public boolean ExcluirProduto(int produto) {

        Produto produtoExcluir = new Produto();
        boolean existeNaLista = false;

        for (Produto item : listaProdutos) {

            if (item.getId() == produto) {//Verifica se o produto esta na lista
                produtoExcluir = item;
                existeNaLista = true;
            }

        }
        if (existeNaLista) {//Caso verdadeiro ele remove esse elemento
            listaProdutos.remove(produtoExcluir);
        }
        return true;
    }

    //Exclui todos os items da Lista itemComanda
    public boolean ExcluirItem() {

        listaItens.clear();

        return true;
    }

    //Metodo que Atualiza o Estoque do Produto que foi comprado, decrementando da sua quantidade total.
    public boolean atualizarEstoque(Produto p, int ID, int qtd) {

        for (Produto elementos : listaProdutos) {
            if (elementos.getId() == ID) {
                elementos.setNomeProduto(p.getNomeProduto());
                elementos.setCategoriaProduto(p.getCategoriaProduto());
                elementos.setMarcaProduto(p.getMarcaProduto());
                elementos.setModeloProduto(p.getModeloProduto());
                elementos.setDescricaoProduto(p.getDescricaoProduto());
                elementos.atualizarEstoque(qtd);
                elementos.setValorProduto(p.getValorProduto());
            }
        }
        return true;
    }

}
