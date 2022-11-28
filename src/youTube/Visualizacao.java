package youTube;

public class Visualizacao {
    // atributos
    private Gafanhoto espectador;
    private Video filme;
    // contrutor

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssitidos(this.espectador.getTotAssitidos() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // metodods
    public void avaliar(){
        this.filme.setAvalia(5);
    }
    public void avaliar(int nota) {
        this.filme.setAvalia(nota);
    }
    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        }else {
            tot = 10;
        }
    }
    // geters seters
    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
