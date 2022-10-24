package UltimateEmojiCombate;

import java.util.Random;

public class Luta implements Luta__I {
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovação;
    // metodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
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
        if (this.isAprovação()) {
            System.out.println("#####DESAFIADO#####");
            this.getDesafiado().apresentar();
            System.out.println("#####DESAFIANTE#####");
            this.getDesafiante().apresentar();
            System.out.println("#####CONCLUSÃO#####");
            Random le = new Random();
            int a = le.nextInt(3);
            switch (a) {
                case 0 : //empate
                System.out.println("Empatou");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

                case 1 : // desafiado vence
                System.out.println(this.desafiado.getNome() + " ganhou");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();

                case 2 : // desafiante vence
                System.out.println(this.desafiante.getNome() + " ganhou");
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
            }
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
