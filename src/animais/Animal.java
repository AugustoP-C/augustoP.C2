package animais;

public abstract class Animal {
    // atributos
    protected String especie;
    protected float peso;
    protected int idade;
    protected int membros;
    // metodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    // seterr geters
    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
