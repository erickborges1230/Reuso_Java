package reuso;

public class Estatutario extends ServidorPublico {

    private int tempoServico;
    private double salarioBase;
    public Estatutario(int tempoServico, double salarioBase){
        super();
        this.tempoServico = tempoServico;
        this.salarioBase = salarioBase;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
