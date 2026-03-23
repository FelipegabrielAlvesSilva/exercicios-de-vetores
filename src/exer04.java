import java.util.Scanner;

public class exer04 {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];


        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            num[i] = entrada.nextInt();
        }

        // Inicializando maior e menor
        int maior = num[0];
        int menor = num[0];
        int posMaior = 0;
        int posMenor = 0;

        // Percorrendo o vetor
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
                posMaior = i+1;
            }
           //Defenindo a posição
            if (num[i] < menor) {
                menor = num[i];
                posMenor = i+1;
            }
        }

        // Resultado
        System.out.println("Maior valor: " + maior + " na posição: " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição: " + posMenor);


    }

}
