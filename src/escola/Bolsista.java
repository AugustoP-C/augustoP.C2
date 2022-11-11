package escola;

public class Bolsista extends Aluno {
    // atributos
    private float bolsa;
    // metodo
    public void renovarBolsa() {

    }
    // metoddo sobreposto
    @Override
    public void pagarMensal() {
        System.out.println(this.getNome() + " e um Bousista! Mensalidade paga mas facilmente");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
