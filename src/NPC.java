public class NPC{
    public String nomeNpc;
    public String descrNpc;
    public String frase1;
    public String frase2;
    public String frase3;
    public String especilidade;
    public Pokemon pokemon1;
    public Pokemon pokemon2;
    public Pokemon pokemon3;

    public NPC(String nomeNpc, Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3) {
        this.nomeNpc = nomeNpc;
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.pokemon3 = pokemon3;
    }

    public String getNomeNpc() {
        return nomeNpc;
    }
    public String getDescrNpc() {
        return descrNpc;
    }

    public String getFrase1() {
        return frase1;
    }

    public String getFrase2() {
        return frase2;
    }

    public String getFrase3() {
        return frase3;
    }

    public String getEspecilidade() {
        return especilidade;
    }

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }

    public Pokemon getPokemon3() {
        return pokemon3;
    }
}



