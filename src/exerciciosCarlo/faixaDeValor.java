package exerciciosCarlo;

import java.util.Scanner;

public class faixaDeValor {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
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
        int s = 0;
        System.out.println("s:" + s);{
            if((s > 0) && (s < 300)){
                System.out.println("faixa de 300");
            } else if((s > 300) && (s < 600));
            System.out.println("faixa de 600");
            System.out.println("faixa 1000");
        }
        entrada.close();
    }
}

