package youTube;

public abstract class PessoaYouTube {
    // atributos
    protected String nome;
    protected int idade;
    protected String genero;
    protected float exp;
    // contrutor

    public PessoaYouTube(String no, int id, String ge) {
        this.nome = no;
        this.idade = id;
        this.genero = ge;
        this.exp = 0;
    }
    // metodos
    public void ganharExp() {

    }
    // getere seterres

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

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

    @Override
    public String toString() {
        return "PessoaYouTube{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", exp=" + exp +
                '}';
    }
}
