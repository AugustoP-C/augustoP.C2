package controleRemoto;

public class Circuito implements Carcassa {
    private boolean ligdeslg;
    private int volume;
    private  boolean tocando;
    // metodo contrustor
    public Circuito() {
        this.setLigdeslg(false);
        this.setTocando(false);
        this.setVolume(50);
    }
    // metodos
    public void ligar() {
        this.setLigdeslg(true);
    }
    public void desLigar() {
        this.setLigdeslg(false);
    }
    public void abrirMenu() {
        System.out.println("Esta ligado: " + this.isLigdeslg());
        System.out.println("Esta tocando: " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int c = 1; c <= this.getVolume(); c += 10) {
            System.out.print("{°}");
        }
    }
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }
    public void maisVolume(int click) {
        if (this.isLigdeslg() && this.getVolume() < 100) {
            for (int c = 0; c < click; c++)
            setVolume(getVolume() + 10);
        }
    }
    public void menosVolume(int click) {
        if (this.isLigdeslg() && this.getVolume() > 0) {
            for (int c = 0; c < click; c++) {
                setVolume(this.getVolume() - 10);
            }
        }
    }
    public void ligarMudo() {
        if (this.getVolume() != 0 && this.isLigdeslg()) {
            this.setVolume(0);
        }
    }
    public void desLigarMudo() {
        if (this.getVolume() == 0 && this.isLigdeslg()) {
            this.setVolume(50);
        }
    }
    public void play() {
        if (this.isLigdeslg() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }
    public void pause() {
        if (this.isLigdeslg() && this.isTocando()) {
            this.setTocando(false);
        }
    }
    // geter e setters
    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigdeslg() {
        return ligdeslg;
    }

    private void setLigdeslg(boolean ligdeslg) {
        this.ligdeslg = ligdeslg;
    }
}

