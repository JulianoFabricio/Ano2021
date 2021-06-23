package exerciciosCarlo;

public class ForIntAniversario {

    public static void main(String[] args) {


        for(int j = 0; j < 10; j++){
            System.out.println("Linha ["+ j + "]");
        }
        int k = 0;

        while(k < 10){
            System.out.println("Lista:" + k);
            k = k + 1;
        }

        String[] nomes = {"joao","maria","pedro","saulo"};
        for(String s : nomes){
            System.out.println("aniversariante:" + s);

        }
    }
}
