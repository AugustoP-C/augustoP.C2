package biblioteca;

import java.util.Random;

public class Livro implements Publicacao {
    // atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean aberto;

    // construtor
    public Livro(String tit, String aut, int totpa) {
        this.setAberto(false);
        this.setTitulo(tit);
        this.setAutor(aut);
        this.setTotPaginas(totpa);
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
            int a = le.nextInt(3);
            switch (a) {
                case 0: // gostou do livro
                    System.out.println("Você folheou o livro e parece que gostou");
                    break;

                case 1: // não gostou do livro
                    System.out.println("Você folheou o livro e parece que não gostou");
            }
        }
        else {
            System.out.println("O livro esta fechado");
        }
    }

    public void avancasrPagina() {
        if (isAberto()) {
            System.out.println("Você esta na pagina " + this.getTotPaginas() + "°");
        }
    }

    public void voltarPagina() {

    }
    // geters seters


    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totpa) {
        int[] page = new int[totpa];
        for (int c = 1; c >= totpa; c++) {
            page[c] = c;
        }
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
