import java.util.Scanner;

public class exer05 {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        String[]nome = new String[10];
        String bnome = new String();

        for(int i=0; i< nome.length; i++){
            System.out.println("informe o " +(i+1)+ "º nome" );
            nome[i] = entrada.next();
        }

        System.out.println("Qual nome você deseja procurar?");
        bnome = entrada.next();
        boolean encontrado = false;//usado para saber se é verdadeiro ou falso

        // Percorrendo o vetor
        for (int i = 1; i < nome.length; i++) {
            if (nome[i].equalsIgnoreCase(bnome)) {
                System.out.println("Posição do nome "+bnome+" encontrado na "+i);
                encontrado = true;
                break;
            }
            }

        if(!encontrado){
            System.out.println("Nome não cadastrado na lista");
        }
    }

}
