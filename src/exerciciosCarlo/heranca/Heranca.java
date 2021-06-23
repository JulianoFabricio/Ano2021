package exerciciosCarlo.heranca;

public class Heranca {

    public static void main(String[] args) {

        Vaca vaca = new Vaca();
        Preguica preguica = new Preguica();

        vaca.pastar();
        preguica.nadar();

        vaca.produzirLeite();

        preguica.produzirLeite();


    }
}
