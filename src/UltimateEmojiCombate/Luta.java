package UltimateEmojiCombate;

public class Luta {
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovação;
    // metodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.setAprovação(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else {
            this.setAprovação(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar() {
        if (isAprovação()) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();

        }
        else {
            System.out.println("A luta que você solicitou não foi aprovada");
        }
    }
    // geters e seterrs
    public boolean isAprovação() {
        return aprovação;
    }

    public void setAprovação(boolean ap) {
        this.aprovação = ap;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int ro) {
        this.rounds = ro;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador de) {
        this.desafiado = de;
    }
}
