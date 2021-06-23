package exerciciosCarlo;

import java.util.Scanner;

public class ListaSimples {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int z = 0;
        int k = 0;

        System.out.println("Digite numero z:");
        z = entrada.nextInt();
        while (k < z) {
            System.out.println("Lista:" + k);
            k = k + 1;
        }
    }
}
