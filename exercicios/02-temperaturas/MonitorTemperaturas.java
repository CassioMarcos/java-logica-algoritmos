import java.util.Scanner;

public class MonitorTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[7];
        double mediaSemanal = 0;
        double maior = 0;
        double menor = 0;
        int dia = 0;
        int diaMaiorTemperatura = 0;
        int diasAcimaDaMedia = 0;
        int aumentoTemperatura = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            dia = i + 1;

            System.out.println("Insira a temperatura do dia " + dia);
            temperaturas[i] = scanner.nextDouble();

            mediaSemanal += (temperaturas[i]) / temperaturas.length;

            if (i == 0) {
                maior = temperaturas[0];
                menor = temperaturas[0];
                diaMaiorTemperatura = 1;
            }

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                diaMaiorTemperatura = dia;
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > mediaSemanal) {
                diasAcimaDaMedia++;
            }

            if (i > 0 && temperaturas[i] > temperaturas[i - 1]) {
                aumentoTemperatura++;
            }
        }

        System.out.println(mediaSemanal);
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(diaMaiorTemperatura);
        System.out.println(aumentoTemperatura);
        System.out.println(diasAcimaDaMedia);
    }
}
