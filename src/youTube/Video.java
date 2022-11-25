package youTube;

public class Video implements AcoesVideo {
    // atributos
    private String titulo;
    private boolean avalia;
    private int views;
    private int curtidas;
    private boolean reprod;
    // metodos
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

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

    public boolean isAvalia() {
        return avalia;
    }

    public void setAvalia(boolean avalia) {
        this.avalia = avalia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
