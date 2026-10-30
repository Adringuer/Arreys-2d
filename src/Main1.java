import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dimensions de la matriu
        int n = 3;
        System.out.print("Introdueix el nombre de columnes (m): ");
        int m = sc.nextInt();

        int[][] matriu = new int[n][m];
        int[] sumes = new int[m];
        int[][] resultat = new int[3][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introdueix l'element [" + i + "][" + j + "]: ");
                matriu[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            int suma = matriu[0][j];
            int maxim = matriu[0][j];
            int minim = matriu[0][j];

            for (int i = 1; i < n; i++) {
                suma += matriu[i][j];
                if (matriu[i][j] > maxim) {
                    maxim = matriu[i][j];
                }
                if (matriu[i][j] < minim) {
                    minim = matriu[i][j];
                }
            }

            resultat[0][j] = suma;
            resultat[1][j] = maxim;
            resultat[2][j] = minim;
        }

        System.out.println("Matriu:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }

        String[] noms = {"Suma", "Màxim", "Mínim"};
        System.out.println("Resultats per columna:");
        for (int i = 0; i < 3; i++) {
            System.out.print(noms[i] + ":\t");
            for (int j = 0; j < m; j++) {
                System.out.print(resultat[i][j] + "\t");
            }
        }
    }
}