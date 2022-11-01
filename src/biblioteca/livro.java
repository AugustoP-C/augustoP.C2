package biblioteca;

public class livro implements Publicacao{
    // atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean aberto;
    // metodos
    public void abrir() {
        this.setAberto(true);
    }

    public void fechar() {

    }

    public void folhear() {

    }

    public void avancasrPagina() {

    }

    public void voltarPagina() {

    }
    // geters seters

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
