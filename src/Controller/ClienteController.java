package Controller;

import DAO.ClienteDAO;
import MODEL.Cliente;
import java.util.ArrayList;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ClienteController {

    //Recebe os dados de Cliente de parametro e Cria um Objeto que encaminha esse Objeto para o ClienteDAO
    public static boolean controllerSalvarCliente(String nome, String nascimento, String cpf, String sexo, String estadoCivil, String rua, String numero, String complemento, String cidade,
            String uf, String cep, String telefone, String email) {
        Cliente p = new Cliente(nome, nascimento, cpf, sexo, estadoCivil, rua, numero, complemento, cidade,
                uf, cep, telefone, email);
        return ClienteDAO.daoSalvarCliente(p);
    }

    //Passa o ID do Cliente que deverá ser excluido
    public static boolean controllerExcluirCliente(int ID) {
        return ClienteDAO.daoExcluirCliente(ID);
    }

    //Recebe os dados de Cliente de parametro Atualizados e Cria um Objeto que encaminha esse Objeto para o ClienteDAO
    public static boolean controllerEditarCliente(int pId, String nome, String nascimento, String cpf, String sexo, String estadoCivil, String rua, String numero, String complemento, String cidade,
            String uf, String cep, String telefone, String email) {
        Cliente c = new Cliente(pId, nome, nascimento, cpf, sexo, estadoCivil, rua, numero, complemento, cidade, uf, cep, telefone, email);
        return ClienteDAO.daoEditarCliente(c);

    }

    public static int controllerUltimoID() {

        return ClienteDAO.daoUltimoID();
    }

    //Retorna a lista de Clientes Cadastratados
    public static ArrayList<Cliente> getClientesList() {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        return clientes;
    }

    //Transfoama a lista de Cliente em String para ser utilizado na tela de Pesquisa
    public static ArrayList<String[]> getClienteNome(ArrayList<String[]> listaVazia, String nome) {

        ArrayList<Cliente> cliente = ClienteDAO.getClientes();
        //ArrayList<String[]> listaVazia = new ArrayList<>();

        for (int i = 0; i < cliente.size(); i++) {

            if (cliente.get(i).getNome().equals(nome)) {
                listaVazia.add(new String[]{
                    String.valueOf(cliente.get(i).getId()),
                    String.valueOf(cliente.get(i).getNome()),
                    String.valueOf(cliente.get(i).getCPF()),
                    String.valueOf(cliente.get(i).getSexo())
                });
            }
        }
        return listaVazia;
    }

    public static ArrayList<String[]> getClienteCPF(ArrayList<String[]> listaVazia, String cpf) {

        ArrayList<Cliente> cliente = ClienteDAO.getClientes();
        //ArrayList<String[]> listaVazia = new ArrayList<>();

        for (int i = 0; i < cliente.size(); i++) {

            if (cliente.get(i).getCPF().equals(cpf)) {
                listaVazia.add(new String[]{
                    String.valueOf(cliente.get(i).getId()),
                    String.valueOf(cliente.get(i).getNome()),
                    String.valueOf(cliente.get(i).getCPF()),
                    String.valueOf(cliente.get(i).getSexo())
                });
            }
        }
        return listaVazia;
    }

    public static ArrayList<String[]> getClienteSexo(ArrayList<String[]> listaVazia, String sexo) {

        ArrayList<Cliente> cliente = ClienteDAO.getClientes();
        //ArrayList<String[]> listaVazia = new ArrayList<>();

        for (int i = 0; i < cliente.size(); i++) {

            if (cliente.get(i).getSexo().equals(sexo)) {
                listaVazia.add(new String[]{
                    String.valueOf(cliente.get(i).getId()),
                    String.valueOf(cliente.get(i).getNome()),
                    String.valueOf(cliente.get(i).getCPF()),
                    String.valueOf(cliente.get(i).getSexo())
                });
            }
        }
        return listaVazia;
    }

}
