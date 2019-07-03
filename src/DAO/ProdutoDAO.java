package DAO;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
import MODEL.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";    //Driver do MySQL 8.0 em diante - Se mudar o SGBD mude o Driver
    private static final String LOGIN = "root";                         //nome de um usuário do banco de dados
    private static final String SENHA = "adminadmin";                             //sua senha de acesso
    private static final String URL = "jdbc:mysql://localhost:3306/PI?useTimezone=true&serverTimezone=UTC";  //URL do banco de dados
    private static Connection conexao;

    //Passa o Paramentro para Salvar o Produto   
    public static int daoUltimoID() {

        int retorno = 0;

        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT MAX(ID_PRODUTO) AS ID_PRODUTO FROM PRODUTO");

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    retorno = rs.getInt("ID_PRODUTO");
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            retorno = 0;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = 0;
            }
        }
        return retorno;
    }

    public static boolean daoChecarDados(Produto p) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT NOME_PRODUTO,CATEGORIA,MARCA,"
                    + "MODELO FROM PRODUTO WHERE "
                    + "NOME_PRODUTO = ? AND "
                    + "CATEGORIA = ? AND "
                    + "MARCA = ? AND "
                    + "MODELO = ?"
            );

            comandoSQL.setString(1, p.getNomeProduto());
            comandoSQL.setString(2, p.getCategoriaProduto());
            comandoSQL.setString(3, p.getMarcaProduto());
            comandoSQL.setString(4, p.getModeloProduto());

            ResultSet rs = comandoSQL.executeQuery();

            while (rs.next()) {
                if (p.getNomeProduto().equals(rs.getString("NOME_PRODUTO"))
                        && p.getCategoriaProduto().equals(rs.getString("CATEGORIA"))
                        && p.getMarcaProduto().equals(rs.getString("MARCA"))
                        && p.getModeloProduto().equals(rs.getString("MODELO")
                        )) {
                    retorno = true;
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
        }
        return retorno;
    }

    //Passa o parâmetro para salvar o Produto   
    public static boolean daoSalvarProduto(Produto p) {

        boolean validacao = daoChecarDados(p);

        boolean retorno = false;

        if (validacao == false) {

            try {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
                PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO PRODUTO(NOME_PRODUTO,CATEGORIA,MARCA,"
                        + "MODELO,DESCRICAO,QUANTIDADE,VALOR) VALUES (?,?,?,?,?,?,?)");

                comandoSQL.setString(1, p.getNomeProduto());
                comandoSQL.setString(2, p.getCategoriaProduto());
                comandoSQL.setString(3, p.getMarcaProduto());
                comandoSQL.setString(4, p.getModeloProduto());
                comandoSQL.setString(5, p.getDescricaoProduto());
                comandoSQL.setInt(6, p.getQuantidadeProduto());
                comandoSQL.setDouble(7, p.getQuantidadeProduto());

                int linhaAfetada = comandoSQL.executeUpdate();

                retorno = linhaAfetada > 0; //sendo maior do que 1, retorna true

            } catch (ClassNotFoundException | SQLException ex) {
                retorno = false;
            } finally {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    retorno = false;
                }
            }
        } else {
            return retorno;
        }
        return retorno;
        //return SimulaDB.getInstance().SalvarProduto(p);
    }

    public static boolean daoEditarProduto(Produto p) {

        boolean retorno = false;

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE PRODUTO\n"
                    + "SET NOME_PRODUTO = ?, CATEGORIA = ?, MARCA = ?, MODELO = ?, DESCRICAO = ?, QUANTIDADE = ?, VALOR = ?\n"
                    + "WHERE ID_PRODUTO = ?");

            comandoSQL.setString(1, p.getNomeProduto());
            comandoSQL.setString(2, p.getCategoriaProduto());
            comandoSQL.setString(3, p.getMarcaProduto());
            comandoSQL.setString(4, p.getModeloProduto());
            comandoSQL.setString(5, p.getDescricaoProduto());
            comandoSQL.setInt(6, p.getQuantidadeProduto());
            comandoSQL.setDouble(7, p.getValorProduto());
            comandoSQL.setInt(8, p.getId());

            int linhaAfetada = comandoSQL.executeUpdate();

            retorno = linhaAfetada > 0;

        } catch (ClassNotFoundException | SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                return false;
            }
        }

        return retorno;
        //return SimulaDB.getInstance().EditarProduto(p);
    }

    public static boolean daoExcluirProduto(int ID) {

        boolean retorno = false;

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);

            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM PRODUTO WHERE ID_PRODUTO = ?");

            comandoSQL.setInt(1, ID);

            int linhaAfetada = comandoSQL.executeUpdate();

            retorno = linhaAfetada > 0;

        } catch (ClassNotFoundException | SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
        }
        return retorno;
        //return SimulaDB.getInstance().ExcluirProduto(ID);
    }

    //Recebe a lista Com os Produtos Cadastrados
    public static ArrayList<Produto> getProdutos() {

        ArrayList<Produto> listaProduto = new ArrayList<>();

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT ID_PRODUTO, NOME_PRODUTO, CATEGORIA, MARCA, MODELO, "
                    + "DESCRICAO, QUANTIDADE, VALOR FROM PRODUTO");

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    Produto p = new Produto();
                    p.setId(rs.getInt("ID_PRODUTO"));
                    p.setNomeProduto(rs.getString("NOME_PRODUTO"));
                    p.setCategoriaProduto(rs.getString("CATEGORIA"));
                    p.setMarcaProduto(rs.getString("MARCA"));
                    p.setModeloProduto(rs.getString("MODELO"));
                    p.setDescricaoProduto(rs.getString("DESCRICAO"));
                    p.setQuantidadeProduto(rs.getInt("QUANTIDADE"));
                    p.setValorProduto(rs.getDouble("VALOR"));     
                    listaProduto.add(p);                    
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            listaProduto = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaProduto = null;
            }
        }
        return listaProduto;
        //return SimulaDB.getInstance().getClientes();\
    }


//return SimulaDB.getInstance().getProdutos();
//Passa os paramentros para atualizar o Estoque
public static boolean atualizarEstoque(Produto produto, int ID, int qtd) {
        return SimulaDB.getInstance().atualizarEstoque(produto, ID, qtd);
    }
}
