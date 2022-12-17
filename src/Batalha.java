public class Batalha {

    public Pokemon pokemon1;
    public Pokemon pokemon2;

    public Batalha(Pokemon poke1, Pokemon poke2) {
        this.pokemon1 = poke1;
        this.pokemon2 = poke2;

    }

    public void AtaquePok1() {
        this.pokemon2.vida = this.pokemon2.vida - pokemon1.ataque1.getDano();

    }

    public void AtaquePok2() {
        this.pokemon2.vida = this.pokemon2.vida - pokemon1.ataque2.getDano();

    }



    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }


}

