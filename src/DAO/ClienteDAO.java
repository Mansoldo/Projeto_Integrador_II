package DAO;

import MODEL.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ClienteDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";    //Driver do MySQL 8.0 em diante - Se mudar o SGBD mude o Driver
    private static final String LOGIN = "root";                         //nome de um usuário do banco de dados
    private static final String SENHA = "adminadmin";                             //sua senha de acesso
    private static final String URL = "jdbc:mysql://localhost:3306/PI?useTimezone=true&serverTimezone=UTC";  //URL do banco de dados
    private static Connection conexao;

    //Passo os paramentros para Salvar o Cliente
    public static int daoUltimoID() {

        int retorno = 0;

        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT MAX(ID_CLIENTE) AS ID_CLIENTE FROM CLIENTE");

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    retorno = rs.getInt("ID_CLIENTE");
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

    public static boolean daoChecarDados(Cliente c) {

        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT NOME, CPF FROM CLIENTE\n"
                    + "WHERE NOME = ? AND CPF = ?"
            );

            comandoSQL.setString(1, c.getNome());
            comandoSQL.setString(2, c.getCPF());

            ResultSet rs = comandoSQL.executeQuery();

            while (rs.next()) {
                if (c.getNome().equals(rs.getString("NOME"))
                        && c.getCPF().equals(rs.getString("CPF"))) {
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

    //Passo os parâmetros para salvar o Cliente
    public static boolean daoSalvarCliente(Cliente c) {

        boolean validacao = daoChecarDados(c);

        boolean retorno = false;

        if (validacao == false) {

            try {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
                PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO CLIENTE(NOME,CPF,NASCIMENTO,SEXO,ESTADO_CIVIL,"
                        + "TELEFONE,EMAIL,NUMERO,CEP,CIDADE,COMPLEMENTO,UF,RUA)\n"
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");

                comandoSQL.setString(1, c.getNome());
                comandoSQL.setString(2, c.getCPF());
                comandoSQL.setString(3, c.getNascimento());
                comandoSQL.setString(4, c.getSexo());
                comandoSQL.setString(5, c.getEstadoCivil());
                comandoSQL.setString(6, c.getTelefone());
                comandoSQL.setString(7, c.getEmail());
                comandoSQL.setString(8, c.getNumero());
                comandoSQL.setString(9, c.getCep());
                comandoSQL.setString(10, c.getCidade());
                comandoSQL.setString(11, c.getComplemento());
                comandoSQL.setString(12, c.getUf());
                comandoSQL.setString(13, c.getRua());

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

        //return SimulaDB.getInstance().SalvarClientes(c);
    }

    //Passo os parâmetros para editar o Cliente
    public static boolean daoEditarCliente(Cliente c) {

        boolean retorno = false;

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE CLIENTE\n"
                    + "SET NOME = ?, CPF = ?, NASCIMENTO = ?, SEXO = ?, ESTADO_CIVIL = ?, TELEFONE = ?, "
                    + "EMAIL = ?, NUMERO = ?, CEP = ?, CIDADE = ?, COMPLEMENTO = ?, UF = ?, RUA = ?\n"
                    + "WHERE ID_CLIENTE = ?");

            comandoSQL.setString(1, c.getNome());
            comandoSQL.setString(2, c.getCPF());
            comandoSQL.setString(3, c.getNascimento());
            comandoSQL.setString(4, c.getSexo());
            comandoSQL.setString(5, c.getEstadoCivil());
            comandoSQL.setString(6, c.getTelefone());
            comandoSQL.setString(7, c.getEmail());
            comandoSQL.setString(8, c.getNumero());
            comandoSQL.setString(9, c.getCep());
            comandoSQL.setString(10, c.getCidade());
            comandoSQL.setString(11, c.getComplemento());
            comandoSQL.setString(12, c.getUf());
            comandoSQL.setString(13, c.getRua());
            comandoSQL.setInt(14, c.getId());

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
    }

    //Passo os parâmetros para excluir o Cliente
    public static boolean daoExcluirCliente(int ID) {

        boolean retorno = false;

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);

            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM CLIENTE WHERE ID_CLIENTE = ?");

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

        //return SimulaDB.getInstance().ExcluirCliente(ID);
    }

    //Recebo os Clientes cadastrados
    public static ArrayList<Cliente> getClientes() {

        ArrayList<Cliente> listaCliente = new ArrayList<>();

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT ID_CLIENTE, NOME, CPF, NASCIMENTO, SEXO, "
                    + "ESTADO_CIVIL, TELEFONE, EMAIL, NUMERO, CEP, CIDADE, COMPLEMENTO, UF, RUA FROM CLIENTE");

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    Cliente c = new Cliente();
                    c.setId(rs.getInt("ID_CLIENTE"));
                    c.setNome(rs.getString("NOME"));
                    c.setCPF(rs.getString("CPF"));
                    c.setNascimento(rs.getString("NASCIMENTO"));                    
                    c.setSexo(rs.getString("SEXO"));
                    c.setEstadoCivil(rs.getString("ESTADO_CIVIL"));
                    c.setTelefone(rs.getString("TELEFONE"));
                    c.setEmail(rs.getString("EMAIL"));
                    c.setNumero(rs.getString("NUMERO"));
                    c.setCep(rs.getString("CEP"));
                    c.setCidade(rs.getString("CIDADE"));
                    c.setComplemento(rs.getString("COMPLEMENTO"));
                    c.setUf(rs.getString("UF"));
                    c.setRua(rs.getString("RUA"));
                    listaCliente.add(c);
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            listaCliente = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaCliente = null;
            }
        }
        return listaCliente;
        //return SimulaDB.getInstance().getClientes();\
    }
}
