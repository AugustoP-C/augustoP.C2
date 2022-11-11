package escola;

public class Tecnico extends Aluno{
    // atributos
    String registroPro;
    // metodos
    public void praticar() {
        System.out.println(this.getNome() + " esta praticando");
    }
}
