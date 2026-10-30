public class Main3 {
    public static void main(String[] args) {
        int n = 5;
        char[][] matriu = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    matriu[i][j] = 'X';
                } else {
                    matriu[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriu[i][j] + "]");
            }
            System.out.println();
        }
    }
}