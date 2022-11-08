package biblioteca;

import java.util.Random;

public class Livro implements Publicacao {
    // atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Leitor leitor;

    // construtor
    public Livro(String tit, String aut, int totpa,Leitor le) {
        this.setAberto(false);
        this.setTitulo(tit);
        this.setAutor(aut);
        this.setTotPaginas(totpa);
        this.setLeitor(le);
    }

    // metodos
    public void abrir() {
        if (this.isAberto()) {
            System.out.println("Não da pra abrir um livro ja aberto");
        } else {
            this.setAberto(true);
            System.out.println("Livro foi aberto");
        }
    }

    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println("Livro foi fechado");
        }
        else {
            System.out.println("Não da pra fechar um livro ja fechado");
        }
    }

    public void folhear() {
        if (this.isAberto()) {
            Random le = new Random();
            int a = le.nextInt(0,2);
            switch (a) {
                case 0: // gostou do livro
                    System.out.println(this.leitor.getNome() + " folheou " + this.titulo + " e parece que gostou");
                    break;

                case 1: // não gostou do livro
                    System.out.println( this.leitor.getNome() + " folheou " + this.titulo + " e parece que não gostou");
                    break;
            }
        }
        else {
            System.out.println("O livro esta fechado");
        }
    }

    public void avancasrPagina() {
        if (isAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Você esta na pagina " + this.getPagAtual());
        }
    }

    public void voltarPagina() {
        if (isAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Você esta na pagina " + this.getPagAtual());
        }
    }

    public String detalhes() {
        return "Livro{" +
                "titulo ='" + titulo + '\'' +
                "\n, autor ='" + autor + '\'' +
                "\n, totPaginas =" + totPaginas + " pagAtual=" + pagAtual +
                "\n, aberto =" + aberto + "\n, leitor="
                + this.leitor.getNome() + '}';
    }
// geters seters

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totpa) {
        this.totPaginas = totpa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String aut) {
        this.autor = aut;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tit) {
        this.titulo = tit;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
