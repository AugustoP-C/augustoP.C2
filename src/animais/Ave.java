package animais;

public abstract class Ave extends Animal {
    // atributos
    protected String corPena;
    // metodos
    public void fazerninho() {
        System.out.println("Contruindo um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }

    @Override
    public int getMembros() {
        return 0;
    }

    @Override
    public void setMembros(int membros) {

    }

    @Override
    public int getIdade() {
        return 0;
    }

    @Override
    public void setIdade(int idade) {

    }

    @Override
    public float getPeso() {
        return 0;
    }

    @Override
    public void setPeso(float peso) {

    }
}
