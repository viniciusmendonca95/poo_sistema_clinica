package Control;

import Model.FolhaPagamentoModel;
import Util.BancoDeDados;
import Model.FolhaPagamentoDB;

public class FolhaPagamentoControl {
    private FolhaPagamentoModel fpm;
    private double salarioBruto;
    private String nome;

    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public FolhaPagamentoModel calcularSalario(){
            fpm = new FolhaPagamentoModel(salarioBruto);
            return fpm;
    }
    public void salvarFolhaPagamento(){
        FolhaPagamentoDB fpdb = new FolhaPagamentoDB();
        fpdb.cadastrarFolha(fpm);
        
     
    }
    
}
