package Control;

import Model.FolhaPagamentoModel;
import Util.BancoDeDados;
import com.google.gson.Gson;

public class FolhaPagamentoControl {
    private FolhaPagamentoModel fpm;
    private double salarioBruto;

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public FolhaPagamentoModel calcularSalario(){
            fpm = new FolhaPagamentoModel(salarioBruto);
            return fpm;
    }
     public void salvarFolhaPagamento() {
        Gson gson = new Gson();
        String json = gson.toJson(fpm);
        BancoDeDados.escreverArquivo(json, "folhaPagamento.txt");
    }
    
}
