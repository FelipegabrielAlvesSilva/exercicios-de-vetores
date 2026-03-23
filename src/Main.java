import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
       Scanner entrada = new Scanner(System.in);

       String[]nome = new String[5];
        //usar o vetor.length(i<nome.length) para deixar o proprio sistema definir o tamanho do vetor (i=nome.length) 'exemplo embaixo' -1 para dar 4
        for(int i=0; i< nome.length; i++){
            System.out.println("informe o " +(i+1)+ "º nome" );
            nome[i] = entrada.next();
        }

        // Exibindo na ordem inversa
        System.out.println("\nNomes na ordem inversa:");
        for (int i = nome.length-1; i >= 0; i--) {
            System.out.println(nome[i]);
        }




    }
}
