package reuso;

public class Temporario extends ServidorPublico {

    private int contrato;
    private double salario;

    public Temporario(int contrato, double salario, int matricula, String nome){
        super(matricula, nome);
        this.contrato = contrato;
        this.salario = salario;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Temporario{" +
                "contrato='" + contrato + '\'' +
                ", salario=" + salario +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
