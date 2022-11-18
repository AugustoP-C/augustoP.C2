package animais;

public abstract class Peixe extends Animal {
    // atributos
    protected String corEscama;
    // metodos
    public void soltarBolhas() {
        System.out.println("Soutou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
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
