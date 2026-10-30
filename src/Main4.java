import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[20][6];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Alumno " + (i + 1) + " - nota " + (j + 1) + ": ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 20; i++) {
            double suma = 0;
            double maxima = matriz[i][0];
            double minima = matriz[i][0];

            for (int j = 0; j < 3; j++) {
                suma = suma + matriz[i][j];
                if (matriz[i][j] > maxima) {
                    maxima = matriz[i][j];
                }
                if (matriz[i][j] < minima) {
                    minima = matriz[i][j];
                }
            }

            matriz[i][3] = suma / 3;
            matriz[i][4] = maxima;
            matriz[i][5] = minima;
        }

        System.out.println("Nota1\tNota2\tNota3\tProm.\tAlta\tBaja");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        double mejor = matriz[0][4];
        double peor = matriz[0][5];
        for (int i = 1; i < 20; i++) {
            if (matriz[i][4] > mejor) {
                mejor = matriz[i][4];
            }
            if (matriz[i][5] < peor) {
                peor = matriz[i][5];
            }
        }

        System.out.println("Mejor nota del curso: " + mejor);
        System.out.println("Peor nota del curso: " + peor);

    }
}
