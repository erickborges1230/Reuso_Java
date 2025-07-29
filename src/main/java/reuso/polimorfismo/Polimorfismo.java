package reuso.polimorfismo;

import reuso.*;

public class Polimorfismo {

    //Operador instanceof
    //Este operador é utilizado para identificar se um determinado objeto pertence a uma hierarquia de classes
    public static void verificarTipoServidorPublico(ServidorPublico servidor){ //Passando o objeto da super classe
        if (servidor instanceof Estatutario )
            System.out.println("Estatutário");
        else if(servidor instanceof Comissionado)
            System.out.println("Comissionado");
        else if (servidor instanceof Temporario)
            System.out.println("Temporário");
        else
            System.out.println("Não foi especializado. Permanecce Servidor Público");
    }
    public static void main(String[] args) {
        //Código principal
        ServidorPublico isabela = new Comissionado(4000, 2000, 3, "Isabela Monte");
        verificarTipoServidorPublico(isabela);
        //Recebendo atributos da classe Estatutario
        isabela = new Estatutario(3, 5000, 4, "Isabela Monte");

        verificarTipoServidorPublico(isabela);

        System.out.println(isabela);
        //Os atributos e os métados específicos da classe Estatutário será obrigatório o uso de Casting de objetos.
        //O Casting de Objetos ocorre quando se desja associar um objeto da classe filho a uma declaração da classe Pai
        //exemplo= Pai objeto = new Filho();
        System.out.println(((Estatutario)isabela).getTempoServico());
        System.out.println(((Estatutario)isabela).getSalarioBase());
    }
}
