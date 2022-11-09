package escola;

import java.sql.SQLOutput;

public class Aluno extends Pessoa_Progenitora {
    // atributos
    private int matr;
    private String curso;

    // metodos
    public void cancelMatr() {
        System.out.println("Matricula cancelada");
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
