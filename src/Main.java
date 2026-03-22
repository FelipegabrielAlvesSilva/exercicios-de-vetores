import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
       Scanner entrada = new Scanner(System.in);

       String[]nome = new String[5];

        for(int i=0; i<5; i++){
            System.out.println("informe o " +(i+1)+ "º nome" );
            nome[i] = entrada.next();
        }

        // Exibindo na ordem inversa
        System.out.println("\nNomes na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(nome[i]);
        }




    }
}
