package banco;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.setDono("jubileu");
        c1.abrirConta("cp");
        c1.depositar(300f);
        c1.pagarMensal();

        c2.setDono("Creusa");
        c2.abrirConta("cc");
        c2.depositar(500f);
        c2.sacar(100f);
        c2.fecharConta();

        System.out.println("-----------------------");
        c1.statosDaConta();
        System.out.println("-----------------------");
        c2.statosDaConta();
    }
}
