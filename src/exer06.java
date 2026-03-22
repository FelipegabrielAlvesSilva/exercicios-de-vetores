import java.util.Scanner;

public class exer06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[10];

        // Preenchendo vetor 1
        System.out.println("Vetor 1:");
        for (int i = 0; i < 5; i++) {
            v1[i] = entrada.nextInt();
        }

        // Preenchendo vetor 2
        System.out.println("Vetor 2:");
        for (int i = 0; i < 5; i++) {
            v2[i] = entrada.nextInt();
        }

        // Unindo vetores
        for (int i = 0; i < 5; i++) {
            v3[i] = v1[i];
            v3[i + 5] = v2[i];
        }

        // Exibindo
        System.out.println("Vetor unido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(v3[i] + " ");
        }
    }
}