package biblioteca;

public class Leitor {
    // atributos
    private String nome;
    private int idade;
    private String genero;
    private String nivelLeitura;
    // metodos
    public void lerLivro() {

    }
    public void avaliarLivro() {

    }
    // geter e seters
    public String getNivelLeitura() {
        return nivelLeitura;
    }

    public void setNivelLeitura(String nivelLeitura) {
        this.nivelLeitura = nivelLeitura;
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
}
