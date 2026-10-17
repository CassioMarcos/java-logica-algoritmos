public class SomaLinhasMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
                {5, 8, 2, 4},
                {10, 3, 7, 1},
                {6, 9, 12, 3}
        };

        int acumula = 0;

        for (int i = 0; i < numeros.length; i++) {
            acumula = 0;

            for (int j = 0; j < numeros[i].length; j++) {
                acumula = acumula + numeros[i][j];
            }

            System.out.println(acumula);
        }
    }
}
