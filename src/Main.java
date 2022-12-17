import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Pokemóns dos NPCs
        Pokemon pokemonNpcFogo1 = new Pokemon ("Charmander", 1000, 3,"Scratch", "Ember", "Flame Charge");
        Pokemon pokemonNpcFogo2 = new Pokemon ("Ponyta", 1000, 2, "Tackle", "Ember", "Flame Charge");
        Pokemon pokemonNpcFogo3 = new Pokemon ("Growlithe", 1000, 2, "Bite", "Ember", "Body Slam");

        NPC bruna = new NPC("Bruna", pokemonNpcFogo1, pokemonNpcFogo2, pokemonNpcFogo3);

        //Pokemons do Treinador
        Pokemon pokemonTr1 = new Pokemon("Bellsprout",1000,3, "Acid","Sludge Bomb","Power Whip");
        Pokemon pokemonTr2 = new Pokemon("Bulbassauro", 1000, 3, "Vine Whip", "Sludge Bomb", "Power Whip");
        Pokemon pokemonTr3 = new Pokemon("Oddish",1000, 3,"Moonblast","Seed Bomb","Razor Leaf");

        Map<Integer, Pokemon> listaPokemon = new HashMap<>();
        listaPokemon.put(1, pokemonTr1);
        listaPokemon.put(2, pokemonTr2);
        listaPokemon.put(3, pokemonTr3);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("1 - " + pokemonTr1.getNome());
        System.out.println("2 - " + pokemonTr2.getNome());
        System.out.println("3 - " + pokemonTr3.getNome());
        System.out.println("Escolha o seu primeiro pokemon: ");
        Integer codPokemon1 = scanner.nextInt();
        System.out.println("Escolha o seu segundo pokemon: ");
        Integer codPokemon2 = scanner.nextInt();
        System.out.println("Escolha o seu terceiro pokemon: ");
        Integer codPokemon3 = scanner.nextInt();

        Treinador usuario = new Treinador(nome, listaPokemon.get(codPokemon1), listaPokemon.get(codPokemon2), listaPokemon.get(codPokemon3));

        //Batalha
        Map<Integer, Pokemon> listaPokemonTr = new HashMap<>();
        listaPokemonTr.put(1, usuario.pokemon1);
        listaPokemonTr.put(2, usuario.pokemon2);
        listaPokemonTr.put(3, usuario.pokemon3);

        System.out.println("1 - " + usuario.pokemon1.getNome());
        System.out.println("2 - " + usuario.pokemon2.getNome());
        System.out.println("3 - " + usuario.pokemon3.getNome());
        System.out.println("Escolha um pokemon para batalhar: ");
        Integer codPokemonBatalha = scanner.nextInt();

        Map<Integer, Ataque> listaAtaqueTr = new HashMap<>();
        listaAtaqueTr.put(1, listaPokemonTr.get(codPokemonBatalha).ataque1);
        listaAtaqueTr.put(2, listaPokemonTr.get(codPokemonBatalha).ataque2);
        listaAtaqueTr.put(3, listaPokemonTr.get(codPokemonBatalha).ataque3);

        System.out.println("1 - " + listaPokemonTr.get(codPokemonBatalha).ataque1.getNomeAtaque());
        System.out.println("2 - " + listaPokemonTr.get(codPokemonBatalha).ataque2.getNomeAtaque());
        System.out.println("3 - " + listaPokemonTr.get(codPokemonBatalha).ataque3.getNomeAtaque());
        System.out.println("Escolha um ataque: ");
        Integer codAtaque = scanner.nextInt();

        bruna.pokemon1.setVida(bruna.pokemon1.vida - listaAtaqueTr.get(codAtaque).getDano());
        System.out.println("Após o ataque " + bruna.pokemon1.getNome() + " está com " + bruna.pokemon1.vida);

        if(bruna.pokemon1.vida <= 0){

        }



        /*
        Evoluções

        Pokemon("Bellsprout",1000,"Acid","Sludge Bomb","Power Whip");
        Pokemon aaa = new Pokemon("Weepinbell", 1000, "Acid", "Sludge Bomb", "Power Whip");
        Pokemon aaa = new Pokemon("Victreebel", 1000,"Acid", "Sludge Bomb", "Solar Beam");

        Pokemon aaa = new Pokemon("Bulbassauro", 1000, "Vine Whip", "Sludge Bomb", "Power Whip");
        Pokemon aaa = new Pokemon("Ivyssauro", 1000, "Vine Whip","Sludge Bomb","Razor Leaf");
        Pokemon aaa = new Pokemon("Venussaur
        */

       // Scanner scanner = new Scanner(System.in);

      //  System.out.println();


        //Ataque ata = new Ataque("pika",500,300);
        /*Pokemon pika = new Pokemon("pika", 1000, "raio", "choque", "teia");
        Pokemon bulba = new Pokemon("bulba", 1000, "agua", "jato", "chicote");

        NPC bruna = new NPC("Bruna", bulba);*/

//        new Pokemon("Pika3",1000,"at1","at2","at3");

        //int a = new Ataque("ata",500,300).getDano();
        //System.out.println(a);
        /*System.out.println("Pokemon - " + pika.getNome());
        System.out.println("Ataque1 - " + pika.ataque1.getNomeAtaque() + " - " + pika.ataque1.getDano());
        System.out.println("Ataque2 - " + pika.ataque2.getNomeAtaque() + " - " + pika.ataque2.getDano());
        System.out.println("Ataque3 - " + pika.ataque3.getNomeAtaque() + " - " + pika.ataque3.getDano());

        System.out.println("Pokemon - " + bulba.getNome());
        System.out.println("Ataque1 - " + bulba.ataque1.getNomeAtaque() + " - " + bulba.ataque1.getDano());
        System.out.println("Ataque2 - " + bulba.ataque2.getNomeAtaque() + " - " + bulba.ataque2.getDano());
        System.out.println("Ataque3 - " + bulba.ataque3.getNomeAtaque() + " - " + bulba.ataque3.getDano());*/

//        System.out.println("Pokemon - " + pika.getNome());
//        System.out.println("Ataque1 - " + pika.ataque1.getNomeAtaque() + " - " + pika.ataque1.getDano());
//        System.out.println("Ataque2 - " + pika.ataque2.getNomeAtaque() + " - " + pika.ataque2.getDano());
//        System.out.println("Ataque3 - " + pika.ataque3.getNomeAtaque() + " - " + pika.ataque3.getDano());


        /*Batalha bat1 = new Batalha(pika,bulba);
            bat1.AtaquePok1();
            bat1.AtaquePok2();

        System.out.println(bat1.getPokemon1().vida);





        //pika.setVida(500);
        System.out.println(bat1.getPokemon2().vida);*/



        //pika.ataque1.getDano();
        //pika.ataque2.getDano();
        //pika.ataque3.getDano();
       /* System.out.println(pika.ataque1.getDano1());
        System.out.println(pika.ataque1.getNomeAtaque());
        System.out.println(pika.ataque2.getNomeAtaque());
        System.out.println(pika.ataque3.getNomeAtaque());
        System.out.println(pika.ataque1.getDano1());
        System.out.println(pika.ataque1.getNomeAtaque());
        System.out.println(pika.ataque2.getNomeAtaque());
        System.out.println(pika.ataque3.getNomeAtaque());*/


    }
}