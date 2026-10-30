public class Main2 {
    public static void main(String[] args) {
        int n = 5;
        char[][] matriu = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i == j) {
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