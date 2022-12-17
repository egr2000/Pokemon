public class Pokemon {

    public String nome;
    public Integer vida;
    public Ataque ataque1;
    public Ataque ataque2;
    public Ataque ataque3;

    public String tipoPokemon;
    public Integer nivel;
    public Integer nivelMax;


    public Pokemon(String nomePk, Integer vidaPk, Integer nivelMax, String nomeAtaque1,String nomeAtaque2,String nomeAtaque3) {
        this.nome = nomePk;
        this.vida = vidaPk;
        this.nivel = 1;
        this.nivelMax = nivelMax;
        this.ataque1 = new Ataque(nomeAtaque1,500,300);
        this.ataque2 = new Ataque(nomeAtaque2,500,300);
        this.ataque3 = new Ataque(nomeAtaque3,500,300);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Ataque getAtaque1() {
        return ataque1;
    }
/*
    public void setAtaque1(Ataque ataque1) {
        this.ataque1 = ataque1;
    }

    public Ataque getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(Ataque ataque2) {
        this.ataque2 = ataque2;
    }

    public Ataque getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(Ataque ataque3) {
        this.ataque3 = ataque3;
    }
*/
    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}


