package Model;

public class FolhaPagamentoModel {
    private double salarioBruto;
    private double inss;
    private double irrf;
    private double salarioLiquido;
    private String nome;

    public FolhaPagamentoModel(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public FolhaPagamentoModel(double salarioBruto, double inss, double irrf, double salarioLiquido, String nome) {
        this.salarioBruto = salarioBruto;
        this.inss = inss;
        this.irrf = irrf;
        this.salarioLiquido = salarioLiquido;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalarioBruto() {
        return salarioBruto;
    }
    
    public double getInss(){
        if(salarioBruto < 1751.82){
            this.inss = salarioBruto * 0.08;
        } else if(salarioBruto > 1751.81 && salarioBruto < 2919.73){
            this.inss = salarioBruto * 0.09;
        } else if(salarioBruto > 2919.72 && salarioBruto < 5839.46){
            this.inss = salarioBruto * 0.11;
        } else if (salarioBruto > 5839.45){
            this.inss = 817.66;
        }
        return this.inss;
    }

    public double getIrrf() {
        double salarioSInss = salarioBruto - this.getInss();
        if(salarioSInss < 1903.99){
            this.irrf = 0;
        } else if(salarioSInss > 1903.98 && salarioSInss < 2826.66){
            this.irrf = (salarioSInss * 0.075) - 142.80;
        } else if(salarioSInss > 2826.65 && salarioSInss < 3751.06) {
            this.irrf = (salarioSInss * 0.15) - 354.8;
        } else if(salarioSInss > 3751.05 && salarioSInss < 4664.69){
            this.irrf = (salarioSInss * 0.225) - 636.13;
        } else if(salarioSInss > 4664.68){
            this.irrf = (salarioSInss * 0.275) - 869.36;
        }
        return this.irrf;
    }

    public double getSalarioLiquido() {
        this.salarioLiquido = this.salarioBruto - (this.getIrrf() + this.getInss());
        return salarioLiquido;
    }  
}
