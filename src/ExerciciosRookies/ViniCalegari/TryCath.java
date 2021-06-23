package ExerciciosRookies.ViniCalegari;

public class TryCath {

    public static void main(String[] args) {

        try {

            int[]myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);

        } catch (Exception e){
            System.out.println("Out of range");
        }finally {
            System.out.println("FINALLY EXECUTED");

        }
    }
}
