package reuso.Record;

import reuso.Curso;

public class App {
    public static void main(String[] args) {
        //Usando o métado Record para criar um objeto curso de maneira bem mais simples e fácil
        reuso.Curso curso = new Curso(2, "Curso de Java", "Online", "Udemy", 5000);
        //O uso de RECORD é mais usando quando é para buscar dados no banco, pois ai não precisa criar uma classe.
        System.out.println(curso);
        System.out.println(curso.getNome()); //No record não tem SETTE, só gette, porque o record não permite alterar.
        System.out.println(curso.getValor());
    }
}
