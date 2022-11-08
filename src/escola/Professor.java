package escola;

public class Professor extends Pessoa__root {
    // atributos
    private String materia;
    private float salario;
    // contrutor
    public Professor(String no, int id, String ge) {
        super(no, id, ge);
    }
    // metodos
    public void receberAumento() {

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
