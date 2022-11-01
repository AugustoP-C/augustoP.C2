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
            String[] numeros = {"1","2","3","4","5","6","7","8","9","0"};
            String[] nomeP = nome.split(" ");
            String[] nomeL = nome.split("");
            int n = nomeP.length;
            int n2 = nomeL.length;
            String nomeCaptalizado = "";
                for (int c = 0; c < n; c++) {
                    for (int c2 = 0; c2 < n2; c2++) {
                        if (Arrays.asList(numeros).contains(nomeL[c2])) {
                            nomeCaptalizado = nomeCaptalizado.replaceAll("\\d+.*", "");
                        }
                        if (Arrays.asList(conectivos).contains(nomeP[c])) {
                            nomeCaptalizado += " " + nomeP[c].toLowerCase();
                        } else {
                            nomeCaptalizado += " " + String.valueOf(nomeP[c].charAt(0)).toUpperCase() + nomeP[c].substring(1).toLowerCase();
                        }
                    }
                }
        System.out.println("|-----Nome-Padronisado-----|");
        System.out.println(nomeCaptalizado);
        }
    }

