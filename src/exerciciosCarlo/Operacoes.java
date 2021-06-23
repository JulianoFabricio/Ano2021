package exerciciosCarlo;

import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = 0;
        int b = 0;
        System.out.print("Digite numero a: ");
        a = entrada.nextInt();
        System.out.print("Digite numero b: ");
        b = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite Operador: ");
        String operador = entrada.nextLine();

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("operador:" + "" + operador);

        if (operador.equals("+")) {
            System.out.println("soma:" + (a + b));
        } else if (operador.equals("-")) {
            System.out.println("subtração:" + (a - b));
        } else {
            System.out.println("multiplicaçaõ:" + (a * b));
        }
    }
}
