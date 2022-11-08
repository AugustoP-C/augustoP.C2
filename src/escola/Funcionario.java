package escola;

public class Funcionario extends Pessoa__root {
    // atributos
    private String seteor;
    private boolean trabalhando;
    // construtor
    public Funcionario(String no, int id, String ge) {
        super(no, id, ge);
    }
    // metodos
    public void mudarTrabalho() {

    }
    // geters seterres

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSeteor() {
        return seteor;
    }

    public void setSeteor(String seteor) {
        this.seteor = seteor;
    }
}
