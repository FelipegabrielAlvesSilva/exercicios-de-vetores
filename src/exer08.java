import java.util.Scanner;

public class exer08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        // Entrada
        for (int i = 0; i < 5; i++) {
            numeros[i] = entrada.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Saída
        System.out.println("Ordem crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
