package Control;

import Model.FuncionarioModel;

public class FuncionarioControl {
    public boolean cadastrarFuncionario(String matricula, String nome, String sexo, double cpf, double rg, String endereco, Integer numero, String complemento, double cep){
        if (matricula != null && matricula.length() >0 && nome != null && nome.length() >0 && sexo != null && sexo.length() >0 && cpf > 0 && rg > 0 && endereco != null && endereco.length() >0 && numero != null && complemento != null && complemento.length() >0  && cep >0) {
        
        FuncionarioModel funcionario = new FuncionarioModel(matricula, nome, sexo, cpf, rg, endereco, numero, complemento, cep);    
        
        return true;
        }
        return false;
    }
}
