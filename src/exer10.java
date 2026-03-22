import java.util.Scanner;

public class exer10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] estoque = new int[5];

        // Entrada
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome do produto:");
            produtos[i] = entrada.nextLine();

            System.out.println("Quantidade em estoque:");
            estoque[i] = entrada.nextInt();
            entrada.nextLine(); // limpar buffer
        }

        // Verificando estoque crítico
        System.out.println("\nProdutos com estoque crítico:");
        for (int i = 0; i < 5; i++) {
            if (estoque[i] < 5) {
                System.out.println(produtos[i] + " - Quantidade: " + estoque[i]);
            }
        }
    }
}
