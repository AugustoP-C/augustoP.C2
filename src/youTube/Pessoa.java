package youTube;

public abstract class Pessoa {
    // atributos
    protected String nome;
    protected int idade;
    protected String genero;
    protected int exp;
    // metodos
    public void ganharExp() {

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
