package Control;

import Model.FuncionarioModel;
import Util.BancoDeDados;
import com.google.gson.Gson;

public class FuncionarioControl {
    private FuncionarioModel funcionario;
    
    public boolean cadastrarFuncionario(String matricula, String nome, String sexo, double cpf, double rg, String endereco, Integer numero, String complemento, double cep) {
        if (matricula != null && matricula.length() > 0 && nome != null && nome.length() > 0 && sexo != null && sexo.length() > 0 && cpf > 0 && rg > 0 && endereco != null && endereco.length() > 0 && numero != null && complemento != null && complemento.length() > 0 && cep > 0) {

            funcionario = new FuncionarioModel(matricula, nome, sexo, cpf, rg, endereco, numero, complemento, cep);

            return true;
        }
        return false;
    }

    public void salvarFuncionario() {
        Gson gson = new Gson();
        String json = gson.toJson(funcionario);
        BancoDeDados.escreverArquivo(json, "funcionario.txt");

    }
}