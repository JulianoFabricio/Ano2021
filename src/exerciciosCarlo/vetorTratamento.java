package exerciciosCarlo;

public class vetorTratamento {


    public static void main(String[] args) {

    int lista[] = new int[5];

    for(int i=0; i < 10; i++){

        try{
            lista[i] = i;
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    for(int i=0; i < 5; i++){

        System.out.println("Vetor =>" + lista[i]);

    }
  }
}
