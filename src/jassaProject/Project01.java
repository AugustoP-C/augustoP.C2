package jassaProject;

import java.util.Arrays;
import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|-----Qual-seu-nome-?----|");
        String nome = sc.nextLine();
        String nomeCapitalizado = capitaliza(nome);
        System.out.println(nomeCapitalizado);
    }

    private static String capitaliza(String nome) {
        nome = nome.toLowerCase();
        String[] conectivos = {"de","da","do","dos","das","e","di","des"};
        String[] nomes = nome.split(" ");
        int n = nomes.length;
        String nomeret = "";
        for (int c = 0; c < n; c++) {
                if (Arrays.asList(conectivos).contains(nomes[c])) {
                    nomeret += " " + nomes[c].toLowerCase();
                } else {
                    nomeret += " " + String.valueOf(nomes[c].charAt(0)).toUpperCase() + nomes[c].substring(1).toLowerCase();
                }

        }
        return nomeret;
    }
}
