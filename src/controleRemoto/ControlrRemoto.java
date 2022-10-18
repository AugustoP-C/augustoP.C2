package controleRemoto;

public class ControlrRemoto {
    public static void main(String[] args) {
        Circuito c1 = new Circuito();
        c1.ligar();
        c1.menosVolume(2);
        c1.abrirMenu();
    }
}
