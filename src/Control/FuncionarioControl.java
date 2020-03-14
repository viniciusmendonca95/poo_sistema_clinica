package Control;

import Model.FuncionarioModel;
import Util.BancoDeDados;
import com.google.gson.Gson;

public class FuncionarioControl {
    private FuncionarioModel funcionario;
    
    public void salvarFuncionario() {
        Gson gson = new Gson();
        String json = gson.toJson(funcionario);
        BancoDeDados.escreverArquivo(json, "funcionario.txt");

    }
}