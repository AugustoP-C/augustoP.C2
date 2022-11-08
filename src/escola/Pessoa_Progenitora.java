package escola;

public class Pessoa_Progenitora {
    // atributos
    private String nome;
    private int idade;
    private String genero;

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
