package controleRemoto;

public interface Carcassa {
    public abstract void ligar();
    public abstract void desLigar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume(int click);
    public abstract void menosVolume(int click);
    public abstract void ligarMudo();
    public abstract void desLigarMudo();
    public abstract void play();
    public abstract void pause();

}
