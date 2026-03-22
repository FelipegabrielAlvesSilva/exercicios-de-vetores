import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] salarios = new double[5];

        double soma = 0;

        // Entrada
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o salário:");
            salarios[i] = entrada.nextDouble();
            soma += salarios[i];
        }

        double media = soma / 5;

        int acima = 0, abaixo = 0, igual = 0;

        // Verificação
        for (int i = 0; i < 5; i++) {
            if (salarios[i] > media) acima++;
            else if (salarios[i] < media) abaixo++;
            else igual++;
        }

        System.out.println("Média: " + media);
        System.out.println("Acima: " + acima);
        System.out.println("Abaixo: " + abaixo);
        System.out.println("Igual: " + igual);
    }
}

