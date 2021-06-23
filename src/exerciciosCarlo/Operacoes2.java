package exerciciosCarlo;

import java.util.Scanner;

public class Operacoes2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite Operação: ");
        String operação = entrada.nextLine();

        int a = 0;
        int b = 0;
        System.out.print("Digite numero a: ");
        a = entrada.nextInt();
        System.out.print("Digite numero b: ");
        b = entrada.nextInt();
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("soma:" + (a+b));
        System.out.println("subtração:" + (a-b));
        System.out.println("multiplicaçaõ:" + (a*b));

        if (operação == "+"){
            System.out.println("soma");
        } else if (operação == "-"){
            System.out.println("subtrcao");
        } else if (operação == "*"){
            System.out.println("multiplicacao");
        } else {
        }
    }
}

