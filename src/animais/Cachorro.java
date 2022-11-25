package animais;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Cachorro extends Lobo {
    // metodos
    @Override
    public void emitirSom() {
        System.out.println("Au au au au");
    }
    public void reagir(String fala, boolean into) {
        if (into) {
            System.out.println("abanado e latindo");
        }
        else {
            System.out.println("Rosnado");
        }
    }
    public void reagir(int hora) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("igonarar");
        }
        else {
            System.out.println("Rosnar e latir");
        }

    }
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        }
        else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade,String tamanho) {
        if (idade < 6 && tamanho.equals("p")) {
            System.out.println("Abanar");
        }else if (idade < 6 && tamanho.equals("g")) {
            System.out.println("Latir");
        } else if (idade <= 6 && tamanho.equals("p")) {
            System.out.println("rosnar");
        } else if (idade >= 6 && tamanho.equals("g")) {
            System.out.println("iginorar");
        }
    }
}
