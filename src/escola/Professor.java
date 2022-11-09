package escola;

public class Professor extends Pessoa_Progenitora {
    // atributos
    private String materia;
    private float salario;

    // metodos
    public void receberAumento(float aum) {
        this.setSalario(this.getSalario() + aum);
    }
    // geters  seterrrs

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
