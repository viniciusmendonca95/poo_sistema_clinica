package Model;

public class FuncionarioModel {
    private String nome;
    private String endereco;
    private Integer numero;
    private String complemento;
    private String cep; 
    private String sexo;
    private String rg;
    private String cpf;
    private String matricula;
   
    public FuncionarioModel() {
    }

    public FuncionarioModel(String nome, String endereco, Integer numero, String complemento, String cep,  String sexo, String rg, String cpf, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void cadastrarFuncionario(FuncionarioModel funcionario) {
    }
}
