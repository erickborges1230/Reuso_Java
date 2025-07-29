package reuso;

public class Aplicacao {
    public static void main(String[] args) {
        ServidorPublico servidor = new ServidorPublico(4, "Erick Borges", "CPF", "Fiscal", "erickborges1230@gmail.com", 5000);
        Curso curso = new Curso(2, "Curso de Java", "Online", "Udemy", 5000);
        servidor.setCursos(curso);
        servidor.getCursos();
        Dependente dependente = new Dependente("Geovane", "555.444", "Masculino", "14");
        servidor.setDependentes(dependente);
        servidor.getDependentes();

        Telefone telCasa = new Telefone("telcasa", "5591993121921");
        Telefone telComercial  = new Telefone("Comercial", "5540095591");
        servidor.setTelefones(telCasa);
        servidor.setTelefones(telComercial);
        servidor.getTelefones();

        Estatutario Camila = new Estatutario(20, 1000, 2000, "isabela");
        System.out.println(Camila);
        System.out.println(Camila.matricula);
        System.out.println(Camila.getMatricula());

        Comissionado leandro = new Comissionado(10000, 7000, 2, "Leandro Bastos");
        System.out.println(leandro);
        System.out.println(leandro.salario);
        System.out.println(leandro.getSalario());

        Temporario luisa = new Temporario(2, 3000, 3, "Luisa Magno");
        System.out.println(luisa);
        System.out.println(luisa.matricula);
        System.out.println(luisa.getMatricula());
        System.out.println(luisa.calcularSalarioHorasExtras(20)); //Sobrecarga
        System.out.println(luisa.calcularSalarioHorasExtras(30,40)); //Herança

        ServidorPublico pedro = new Temporario(2, 4000, 5, "Pedro Gomes");
        System.out.println(pedro.calcularSalarioHorasExtras(40));
        System.out.println(pedro);


    }
}
