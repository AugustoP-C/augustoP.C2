package youTube;

public class Gafanhoto extends PessoaYouTube {
    // atriutos
    private String login;
    private int totAssitidos;
    // construtor
    public Gafanhoto(String no, int id, String ge, String login) {
        super(no, id, ge);
        this.login = login;
        this.totAssitidos = 0;
    }

    // metodos
    public void verMasiUm() {

    }
    // geters seters

    public int getTotAssitidos() {
        return totAssitidos;
    }

    public void setTotAssitidos(int totAssitidos) {
        this.totAssitidos = totAssitidos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssitidos=" + totAssitidos +
                '}';
    }
}
