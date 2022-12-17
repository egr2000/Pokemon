import java.util.Random;

public class Ataque {

    public String nomeAtaque;
    public int danoMaximo;
    public int danoMinimo;
    public int dano;


    public Ataque(String nomeAtaque, int danoMaximo, int danoMinimo) {
        this.nomeAtaque = nomeAtaque;
        this.danoMaximo = danoMaximo;
        this.danoMinimo = danoMinimo;
        Random random = new Random();
        this.dano = danoMinimo + random.nextInt(danoMaximo-danoMinimo);
    }

    public String getNomeAtaque() {
        return nomeAtaque;
    }

    /*public int getDano(){
        Random random = new Random();
        this.dano = danoMinimo + random.nextInt(danoMaximo-danoMinimo);
        return dano;


    }*/

    public int getDano() {
        return dano;

    }

}




