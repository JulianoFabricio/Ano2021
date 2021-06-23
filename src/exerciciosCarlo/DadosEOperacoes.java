package exerciciosCarlo;

import java.util.Scanner;

public class DadosEOperacoes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome:");
        String nome = entrada.nextLine();
        System.out.print("Digite sobrenome:");
        String sobrenome = entrada.nextLine();
        System.out.print("idade:");
        String idade = entrada.nextLine();
        System.out.print("Digite nacionalidade:");
        String nacionalidade = entrada.nextLine();
        System.out.print("Digite a cidade:");
        String cidade = entrada.nextLine();
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Nome Completo: " + nome +" "+ sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Digite numero A:");
        int a = entrada.nextInt();
        System.out.println("Numero digitado:" +a);
        int x,y,z;

        System.out.println("Digite numero x: ");
        x = entrada.nextInt();
        System.out.println("Digite numero y: ");
        y = entrada.nextInt();
        System.out.println("Digite numero z: ");
        z = entrada.nextInt();

        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);

        System.out.println("Soma:" + (x+y+z));

        if((x+y+z) > 1000){
            System.out.println("Superior que 1000");
        } else {
            System.out.println("Inferior ou igual a 1000");
        }
        int s;

        s = (x + y + z);

        if ( (s > 0) && (s<300)) {
            System.out.println("Faixa 300");
        } else if ( (s > 300) && (s < 600)) {
            System.out.println("Faixa 600");
        } else {
            System.out.println("Faixa 1000");
        }

        entrada.close();
    }
}
