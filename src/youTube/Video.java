package youTube;

public class Video implements AcoesVideo {
    // atributos
    private String titulo;
    private int avalia;
    private int views;
    private int curtidas;
    private boolean reprod;
    // contrutor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avalia = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reprod = false;
    }

    // metodos
    @Override
    public void play() {
        this.reprod = true;
    }

    @Override
    public void pause() {
        this.reprod = false;
    }

    @Override
    public void like() {
        this.curtidas ++ ;
    }
    // geters seters

    public boolean isReprod() {
        return reprod;
    }

    public void setReprod(boolean reprod) {
        this.reprod = reprod;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getAvalia() {
        return avalia;
    }

    public void setAvalia(int avalia) {
        int nova =  0;
        nova = (int) ((this.avalia + avalia) / this.views);
        this.avalia = nova;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avalia=" + avalia +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reprod=" + reprod +
                '}';
    }
}
