package exerciciosCarlo;

import java.util.Scanner;

public class OperacoesGoogle {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int soma;
        int subtração;
        int multiplicação;

        System.out.print("Digite Operação: ");
        String operação = entrada.nextLine();
        System.out.print("Digite numero a: ");
        a = entrada.nextInt();
        System.out.print("Digite numero b: ");
        b = entrada.nextInt();

        soma = a + b;
        subtração = a - b;
        multiplicação = a * b;

        switch (operação) {

            case "+":
                System.out.println("soma:" + a + "+" + b + "=" + soma);
                break;
            case "-":
                System.out.println("subtração:" + a + "-" + b + "=" + subtração);
                break;
            case "*":
                System.out.println("multiplicação:" + a + "*" + b + "=" + multiplicação);
                break;
        }

    }
}

