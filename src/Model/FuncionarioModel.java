/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vinicius
 */
public class FuncionarioModel {
    private String matricula;
    private String nome;
    private String sexo;
    private double cpf;
    private double rg;
    private String endereco;
    private Integer numero;
    private String complemento;
    private double cep;    

    public FuncionarioModel() {
    }

    
    public FuncionarioModel(String matricula, String nome, String sexo, double cpf, double rg, String endereco, Integer numero, String complemento, double cep) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
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

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
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

    public double getCep() {
        return cep;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }
    
    public void cadastrarFuncionario(FuncionarioModel funcionario) {}
}
