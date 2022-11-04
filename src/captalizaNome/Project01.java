package captalizaNome;

import java.util.Arrays;
import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|-----Nome-a-ser-Padronisado-----|");
        String nome = sc.nextLine();
        nome = nome.toLowerCase();
        String[] conectivos = {"de", "da", "do", "dos", "das", "e", "di", "des"};
        String[] nomeP = nome.split(" ");
        int n = nomeP.length;
        String nomeCaptalizado = "";
        for (int c = 0; c < n; c++) {
            if (Arrays.asList(conectivos).contains(nomeP[c])) {
                nomeCaptalizado += " " + nomeP[c].toLowerCase();
            } else {
                nomeCaptalizado += " " + String.valueOf(nomeP[c].charAt(0)).toUpperCase() + nomeP[c].substring(1).toLowerCase();
            }
        }
        nomeCaptalizado = nomeCaptalizado.replaceAll("\\d+", "");
        System.out.println("|-----Nome-Padronisado-----|");
        System.out.println(nomeCaptalizado);
    }

}

