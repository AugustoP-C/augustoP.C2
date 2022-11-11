package escola;

public class Funcionario extends Pessoa {
    // atributos
    private String seteor;
    private boolean trabalhando;

    // metodos
    public void mudarTrabalho() {
        this.setTrabalhando(false);
    }
    // geters seterres

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return seteor;
    }

    public void setSetor(String seteor) {
        this.seteor = seteor;
    }
}
