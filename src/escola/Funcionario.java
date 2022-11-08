package escola;

public class Funcionario extends Pessoa_Progenitora {
    // atributos
    private String seteor;
    private boolean trabalhando;

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

    public String getSetor() {
        return seteor;
    }

    public void setSetor(String seteor) {
        this.seteor = seteor;
    }
}
