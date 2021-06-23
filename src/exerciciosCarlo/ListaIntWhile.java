package exerciciosCarlo;

public class ListaIntWhile {

    public static void main(String[] args) {

        int a = 0;
        while(a < 10){
            System.out.println("Lista:" + a);
            a = a + 1;
        }
        String[] numeros = {"1","2","3","4","5"};

        for (String b: numeros){
            System.out.println("inteiros:" + b);

        }
    }
}
