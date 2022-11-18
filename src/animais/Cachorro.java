package animais;

public class Cachorro extends Mamifero {
    // metodos
    public void enterrarOsso() {
        System.out.println("Enterrar osso");
    }
    public void abanarRabo() {
        System.out.println("Abanado o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au au");
    }
}
