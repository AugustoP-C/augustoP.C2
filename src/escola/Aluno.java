package escola;

public class Aluno extends Pessoa__root {
    // atributos
    private int matr;
    private String curso;
    // contrutor
    public Aluno(String no, int id, String ge) {
        super(no, id, ge);
    }

    // metodos
    public void cancelMatr() {

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
