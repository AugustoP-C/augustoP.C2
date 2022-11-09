package escola;

public class Escola {
    public static void main(String[] args) {
        Pessoa_Progenitora p1 = new Pessoa_Progenitora();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setGenero("M");
        p2.setGenero("F");
        p3.setGenero("M");
        p4.setGenero("F");

        p1.setIdade(11);
        p2.setIdade(20);
        p3.setIdade(37);
        p4.setIdade(25);

        p2.setCurso("Imformatica");
        p3.setSalario(2.500f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
