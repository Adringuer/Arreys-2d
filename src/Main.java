import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dimensions de la matriu
        System.out.print("Introdueix el nombre de files (n): ");
        int n = sc.nextInt();
        System.out.print("Introdueix el nombre de columnes (m): ");
        int m = sc.nextInt();

        int[][] matriu = new int[n][m];
        int[] sumes = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Introdueix l'element [" + i + "][" + j + "]: ");
                matriu[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            sumes[j] = 0;
            for (int i = 0; i < n; i++) {
                sumes[j] += matriu[i][j];
            }
        }

        System.out.println("Matriu:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Suma de cada columna:");
        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + j + ": " + sumes[j]);
        }
    }
}