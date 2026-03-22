import java.util.Scanner;

public class exer03 {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva o " + (i + 1) + "º número");
            num[i] = entrada.nextInt();

            if(num[i] <0 ){
                num[i] =0;
            }
        }

        System.out.println("Apresentação do vetor");
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }


    }
}
