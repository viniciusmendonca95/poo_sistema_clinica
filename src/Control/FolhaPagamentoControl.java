package Control;

import Model.FolhaPagamentoModel;

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
    
}
