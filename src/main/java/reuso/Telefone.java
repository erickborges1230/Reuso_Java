package reuso;

public class Telefone {
    String tipoTelefone;
    String numero;

    //Construtor
    public Telefone(String tipoTelefone, String numero) {
        this.tipoTelefone = tipoTelefone;
        this.numero = numero;
    }
    //Getters e Setters


    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
