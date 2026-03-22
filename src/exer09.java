import java.util.Scanner;

public class exer09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int n = entrada.nextInt();

        int[] fib = new int[n];

        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
