package MODEL;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class Cliente {

    private static int qtdClientesCriados;

    private int id;
    private String nome;
    private String cpf;
    private String nascimento;
    private String sexo;
    private String estadoCivil;
    private String rua;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String telefone;
    private String email;

    private static int editarID;

    public Cliente() {

    }

    //Construtor da Classe Cliente
    public Cliente(String nome, String nascimento, String cpf, String sexo, String estadoCivil, String rua, String numero, String complemento, String cidade,
            String uf, String cep, String telefone, String email) {
       // qtdClientesCriados++;
        //this.id = qtdClientesCriados;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
        this.email = email;
    }

    //Construtor para a Edição dos dados de algum cliente 
    public Cliente(int id, String nome, String nascimento, String cpf, String sexo, String estadoCivil, String rua, String numero, String complemento, String cidade,
            String uf, String cep, String telefone, String email) {
        this.id = id;        
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
        this.email = email;
    }

    //Retorna a quantidade de Clientes criados
    public static int getQtdClienteCriado() {
        return qtdClientesCriados;
    }

    //Atribui a quantidade de Clientes criados
    public static void setQtdClienteCriado(int qtdClienteCriado) {
        Cliente.qtdClientesCriados = qtdClienteCriado;
    }

    //Retorna o CPF
    public String getCPF() {
        return getCpf();
    }

    //Atribui o CPF
    public void setCPF(String pCPF) {
        this.setCpf(pCPF);
    }

    //Retorna o ID do Cliente
    public int getId() {
        return id;
    }

    //Atribui o ID do Cliente
    public void setId(int id) {
        this.id = id;
    }

    //Retorna o nome do Cliente
    public String getNome() {
        return nome;
    }

    //Atribui o nome do Cliente
    public void setNome(String pNome) {
        this.nome = pNome;
    }

    //Retorna o CPF 
    public String getCpf() {
        return cpf;
    }

    //Atriibui o CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Retorna o Nascimento
    public String getNascimento() {
        return nascimento;
    }

    //Atribui o Nascimento
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    //Retorna o Sexo
    public String getSexo() {
        return sexo;
    }

    //Atribui o Sexo
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Retorna o Estado Civil
    public String getEstadoCivil() {
        return estadoCivil;
    }

    //Atribui o Estado Civil
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    //Retorna a Rua
    public String getRua() {
        return rua;
    }

    //Atribui a Rua
    public void setRua(String rua) {
        this.rua = rua;
    }

    //Retorna o CEP
    public String getCep() {
        return cep;
    }

    //Atribui o CEP
    public void setCep(String cep) {
        this.cep = cep;
    }

    //Retorna o Numero da Casa
    public String getNumero() {
        return numero;
    }

    //Atribui o Numero da casa
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Retorna o Complemento
    public String getComplemento() {
        return complemento;
    }

    //Atribui o Complemento
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //Retorna a Cidade
    public String getCidade() {
        return cidade;
    }

    //Atribui a Cidade
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //Retorna o UF
    public String getUf() {
        return uf;
    }

    //Atribui o UF
    public void setUf(String uf) {
        this.uf = uf;
    }

    //Retorna o Telefone
    public String getTelefone() {
        return telefone;
    }

    //Atribui o Telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Retorna o Email
    public String getEmail() {
        return email;
    }

    //Atribui o Email
    public void setEmail(String email) {
        this.email = email;
    }

    //Atribui o ID a Ser Editado
    public void inserirIDEditar(int ID) {
        this.editarID = ID;
    }

    //Retorna o ID a ser Editado
    public static int receberIDEditar() {
        return editarID;
    }

}
