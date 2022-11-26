package escola;

public abstract class PessoaEscola {
    // atributos
    protected String nome;
    protected int idade;
    protected String genero;
    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                '}';
    }
    // metodos final
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
