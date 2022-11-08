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

        p2.setCurso("Imformatica");
        p3.setSalario(20.000f);
        p4.setSetor("Estoque");
    }
}
