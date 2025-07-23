package reuso;

public class Aplicacao {
    public static void main(String[] args) {
        ServidorPublico servidor = new ServidorPublico(4, "Erick Borges", "CPF", "Fiscal", "erickborges1230@gmail.com", 5000);
        Curso curso = new Curso(2, "Curso de Java", "Online", "Udemy", 5000);
        servidor.setCursos(curso);
    }
}
