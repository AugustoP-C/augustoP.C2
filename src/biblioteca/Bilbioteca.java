package biblioteca;

public class Bilbioteca {
    public static void main(String[] args) {
        Livro[] l = new Livro[5];
        Leitor[] le = new Leitor[2];

        le[0] = new Leitor("Augusto", 20,"M",6);
        le[1] = new Leitor("Maria", 25,"M",7);

        l[0] = new Livro("Aprendendo JAVA","Thomas siova Turbo",400,le[0]);
        l[1] = new Livro("Object Oriented Programming","Marcos Ferrari Relampago",600,le[0]);
        l[2] = new Livro("Algotimo","Jacaranda de Sousa",200,le[1]);
        l[3] = new Livro("Comandos do GTA Sanandreas","seu Zé da esquina",100,le[1]);
        l[4] = new Livro("A Revolução dos Bichos","George Orwell",152,le[0]);

        System.out.println(l[0].detalhes());
        System.out.println("---");
        System.out.println(l[1].detalhes());
        System.out.println("---");
        System.out.println(l[2].detalhes());
        System.out.println("---");
        System.out.println(l[3].detalhes());
        System.out.println("---");
        System.out.println(l[4].detalhes());
        System.out.println("---");
        l[4].abrir();
        System.out.println("---");
        l[3].abrir();
        System.out.println("---");
        l[4].folhear();
        System.out.println("---");
        l[3].folhear();
        System.out.println("---");
        le[0].avaliarLivro(10f,l[4]);
        le[0].avaliarLivro(6.5f,l[0]);
        le[0].avaliarLivro(8.2f,l[1]);
        le[1].avaliarLivro(9.5f,l[2]);
        le[1].avaliarLivro(10,l[3]);
    }
}
