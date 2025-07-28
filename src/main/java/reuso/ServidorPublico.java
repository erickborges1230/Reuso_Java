/**************************************/
package reuso;
/**************************************/

/*
 * Versão: 1.0
 * Descrição: Classe que representa o Servidor Público.
 */

import java.util.*;

/***************************/
public class ServidorPublico 
/***************************/
{
    //Atributos
	protected int matricula;
    protected String nome;
    protected String orgao;
    protected String cargo;
    protected String lotacao;
    protected String email;
    protected double salario;

    //REUSO - Associação
    private List<Curso> cursos = new LinkedList<Curso>();

    //REUSO - Agregação
    private List<Dependente> dependentes = new LinkedList<Dependente>();

    //REUSO - Composição
    private List<Telefone> telefones = new LinkedList<Telefone>();

    // Construtor
    public ServidorPublico(int i, String erickBorges, String cpf, String fiscal, String mail, int i1)
    {
    	
    }
    
    public ServidorPublico(int matricula, String nome, String orgao, String cargo, String lotacao, String email, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.orgao = orgao;
        this.cargo = cargo;
        this.lotacao = lotacao;
        this.email = email;
        this.salario = salario;
    }

    public ServidorPublico(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void getCursos() {
        for (Curso curso: cursos)
            System.out.println("Curso");
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
    }

    public void getDependentes() {
        for (Dependente dependente: dependentes)
            System.out.println(dependente);
    }

    public void setDependentes(Dependente dependente) {
        this.dependentes.add(dependente);
    }

    public void getTelefones() {
        for (Telefone telefone: telefones)
            System.out.println(telefone);
    }

    public void setTelefones(Telefone telefone) {
        this.telefones.add(telefone);
    }

    @Override
	public String toString() {
		return "ServidorPublico [matricula=" + matricula + ", nome=" + nome + ", orgao=" + orgao + ", cargo=" + cargo
				+ ", lotacao=" + lotacao + ", email=" + email + ", salario=" + salario + "]";
	}
    
    
}

