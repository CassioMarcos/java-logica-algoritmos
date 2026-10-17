import java.util.Scanner;

public class SistemaEstacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorVeiculo = 0;
        double contadorValor = 0;
        int horas;

        do {
            System.out.println("Quantas horas o veículo ficou estacionado: ");
            horas = scanner.nextInt();
            double valorEstacionamento = 6.00;

            if (horas > 2) {
                valorEstacionamento += (horas - 2) * 3;
            } else if (horas == 0) {
                continue;
            } else if (horas < 0) {
                System.out.println("Valor inválido");
                continue;
            }

            if (valorEstacionamento > 24) {
                valorEstacionamento = 24;
            }

            contadorVeiculo++;
            contadorValor = contadorValor + valorEstacionamento;
        } while (horas != 0);

        System.out.println(contadorValor);
        System.out.println(contadorVeiculo);
    }
}
