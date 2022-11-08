package escola;

public class Pessoa__root {
    // atributos
    private String nome;
    private int idade;
    private String genero;
    // construtor

    public Pessoa__root(String no, int id, String ge) {
        this.nome = no;
        this.idade = id;
        this.genero = ge;
    }

    // metodos
    public void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }
    // getere seterres

    public String getGenero() {

        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
