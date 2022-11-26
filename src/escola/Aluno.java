package escola;

public class Aluno extends PessoaEscola {
    // atributos
    protected int matr;
    protected String curso;

    // metodos
    public void pagarMensal() {
        System.out.println("Mensalidade do aluno " + this.getNome() + " paga");
    }
    // geters seterres

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }
}
