package escola;

public class Escola {
    public static void main(String[] args) {
        // visitante
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setGenero("M");
        System.out.println(v1.toString());

        // aluno
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatr(4378);
        a1.setCurso("Imformatica");
        a1.setIdade(16);
        a1.setGenero("M");
        a1.pagarMensal();

        // bolsista
        Bolsista b1 = new Bolsista();
        b1.setMatr(6732);
        b1.setNome("Jubileu");
        b1.setBolsa(250.50f);
        b1.setGenero("M");
        b1.pagarMensal();

        // tecnico
        Tecnico t1 = new Tecnico();
        t1.setGenero("F");
        t1.setIdade(20);
        t1.setNome("Marina");
        t1.setMatr(2135);
        t1.setCurso("T.I");
        t1.praticar();
    }
}
