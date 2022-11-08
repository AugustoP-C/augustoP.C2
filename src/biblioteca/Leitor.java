package biblioteca;

public class Leitor {
    // atributos
    private String nome;
    private int idade;
    private String genero;
    private int nivelLeitura;
    // contrutores
    public Leitor(String no, int id, String ge, int ni) {
        this.nome = no;
        this.idade = id;
        this.genero = ge;
        this.nivelLeitura = ni;
    }

    // metodos
    public void avaliarLivro(float no,Livro le) {
        System.out.println(this.getNome() + ": livro " + le.getTitulo() + " nota: " + no);
    }
    // geter e seters
    public int getNivelLeitura() {
        return nivelLeitura;
    }

    public void setNivelLeitura(int nivelLeitura) {
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
