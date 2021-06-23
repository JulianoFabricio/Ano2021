package exerciciosCarlo;

import java.util.Scanner;

public class IntervalosInfantilFundamental {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome:");
        String nome = entrada.nextLine();
        System.out.print("Digite sua idade:");

        int idade = entrada.nextInt();

        if ((idade >= 0) && (idade <= 5)){
            System.out.println("Infantil");
        } else if ((idade >= 6) && (idade <= 12)){
            System.out.println("Fundamental");
        } else if ((idade >= 13) && (idade <= 16)){
            System.out.println("Médio");
        }
        for (int i= 0; i < idade; i++){
            System.out.println("Wipro");
        }
    }
}



