import java.util.Scanner;

public class exer05 {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        String[]nome = new String[10];
        String bnome = new String();

        for(int i=0; i<10; i++){
            System.out.println("informe o " +(i+1)+ "º nome" );
            nome[i] = entrada.next();
        }

        int posnome = 0;

        System.out.println("Qual nome você deseja procurar?");
        bnome = entrada.next();

        // Percorrendo o vetor
        for (int i = 1; i < 10; i++) {
            if (nome[i].equalsIgnoreCase(bnome)) {
                posnome = i+1;

                System.out.println("Posição do nome"+bnome+" é a "+posnome+"º");
            }
            else
                System.out.println("Nome não presente na lista");break;
            }
    }

}
