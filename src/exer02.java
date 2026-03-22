import java.util.Scanner;

public class exer02 {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int[]num = new int[8];
        int soma=0;

        for(int i=0; i<8; i++){
            System.out.println("Escreva o "+(i+1)+ "º número");
             num[i] = entrada.nextInt();

             if(num[i] %2==0  ){
                 soma += num[i];
             }

        }
        System.out.println("A soma dos números pares é: " + soma);

    }
}
