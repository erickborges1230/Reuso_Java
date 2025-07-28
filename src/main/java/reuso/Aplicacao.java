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

        Comissionado leandro = new Comissionado(10000, 7000, 2, "Leandro Bastos");
        System.out.println(leandro);

        Temporario luisa = new Temporario(2, 3000, 3, "Luisa Magno");
        System.out.println(luisa);

    }
}
