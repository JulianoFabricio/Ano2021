package ExerciciosRookies.Thred;

public class ProcessamentoParalelo {

    public static void main(String[] args) {

        System.out.println("Inicio da Thread");

        new PingPong("Ping", 1500).start();
        new PingPong("Pong", 2000).start();

        System.out.println("Fim da Thread");
    }
}
