package exerciciosCarlo;

public class doWhile {

    public static void main(String[] args) {

        int i = 10;
        int a = 30;
        int b = 40;
        int c = 15;

        i = (a + b + c);

        if (i > 100) {
            System.out.println("centena");
        } else {
            System.out.println("dezena");
        }


        int ano = 2016;


        if (ano < 0) {
            System.out.println("Não é um Ano!");
        } else if ((ano%4==0 && ano%100!=0) || (ano%400==0) ) {
            System.out.println("É Bissexto!");
        } else {
            System.out.println("Não é Bissexto!");
        }

        int x = 0;
        while (x < 10) {
            System.out.println("item " + x);
            x++;
        }

        x = 0;
        do {
            System.out.println("item  " + x);
            x++;
        } while (x < 10);
    }
}


