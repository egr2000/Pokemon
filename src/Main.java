import java.util.*;

public class Main {
    public static Random random = new Random();
    public static Pokemon pokemonNpc;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Pokemóns dos NPCs
        Pokemon pokemonNpcFogo1 = new Pokemon ("Charmander", 1000, 3,"Scratch", "Ember", "Flame Charge");
        Pokemon pokemonNpcFogo2 = new Pokemon ("Ponyta", 1000, 2, "Tackle", "Ember", "Flame Charge");
        Pokemon pokemonNpcFogo3 = new Pokemon ("Growlithe", 1000, 2, "Bite", "Ember", "Body Slam");
        NPC bruna = new NPC("Bruna", pokemonNpcFogo1, pokemonNpcFogo2, pokemonNpcFogo3);

        Pokemon pokemonNpcGrama1 = new Pokemon("Bellsprout",1000,3, "Acid","Sludge Bomb","Power Whip");
        Pokemon pokemonNpcGrama2 = new Pokemon("Bulbassauro", 1000, 3, "Vine Whip", "Sludge Bomb", "Power Whip");
        Pokemon pokemonNpcGrama3 = new Pokemon("Oddish",1000, 3,"Moonblast","Seed Bomb","Razor Leaf");
        NPC eduardo = new NPC("Eduardo", pokemonNpcGrama1, pokemonNpcGrama2, pokemonNpcGrama3);

        Pokemon pokemonNpcAgua1 = new Pokemon("Squirtle",1000,3, "Aqua Jet","Water Pulse","Aqua Tail");
        Pokemon pokemonNpcAgua2 = new Pokemon("Psyduck", 1000, 2, "Water Gun", "Zen Headbutt", "Aqua Tail");
        Pokemon pokemonNpcAgua3 = new Pokemon("Poliwag",1000, 3,"Water Pulse","Defense Curl","Bubble");
        NPC matheus = new NPC("Matheus", pokemonNpcAgua1, pokemonNpcAgua2, pokemonNpcAgua3);

        //Pokemons do Treinador
        Pokemon pokemonTr1 = new Pokemon("Pikachu",1000,2, "Thunder Shock","Quick Attack","Discharge");
        Pokemon pokemonTr2 = new Pokemon("Articuno", 1000, 1, "Frost Beath", "Icy Wind", "Ice Beam");
        Pokemon pokemonTr3 = new Pokemon("Doduo",1000, 2,"Peck","Quick Attack","Swift");
        Pokemon pokemonTr4 = new Pokemon("Clefable",1000, 2,"Pound","Dazzling Gleam","Moonblast");
        Pokemon pokemonTr5 = new Pokemon("Jigglypuff",1000, 2,"Pound","Disarming Voice","Play Rough");
        Pokemon pokemonTr6 = new Pokemon("Dragonair",1000, 3,"Dragon Breath","Dragon Pulse","Aqua Tail");

        ArrayList<Pokemon> listaTodosPokemonsTr = new ArrayList<Pokemon>();
        listaTodosPokemonsTr.add(pokemonTr1);
        listaTodosPokemonsTr.add(pokemonTr2);
        listaTodosPokemonsTr.add(pokemonTr3);
        listaTodosPokemonsTr.add(pokemonTr4);
        listaTodosPokemonsTr.add(pokemonTr5);
        listaTodosPokemonsTr.add(pokemonTr6);

        System.out.println("Bem-vindo Treinador!");
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        int[] codPokemon = new int[3];

        for(int i = 0; i < 3; i++){
            do {
                for (Pokemon j : listaTodosPokemonsTr) {
                    System.out.println((listaTodosPokemonsTr.indexOf(j) + 1) + " - " + j.getNome());
                }
                System.out.println("Escolha o seu " + (i + 1) + "° pokemon: ");
                codPokemon[i] = scanner.nextInt() - 1;
            } while(codPokemon[i] < 0 || codPokemon[i] > (listaTodosPokemonsTr.size()-1));
            //listaTodosPokemonsTr.remove(codPokemon[i]);
        }

        Treinador usuario = new Treinador(nome, listaTodosPokemonsTr.get(codPokemon[0]), listaTodosPokemonsTr.get(codPokemon[1]), listaTodosPokemonsTr.get(codPokemon[2]));

        //Batalha
        ArrayList<Pokemon> listaPokemonTr = new ArrayList<Pokemon>();
        listaPokemonTr.add(usuario.pokemon1);
        listaPokemonTr.add(usuario.pokemon2);
        listaPokemonTr.add(usuario.pokemon3);

        System.out.println("Hora de batalhar!");
        escolherPokemonBatalhar(usuario);
        int codPokemonTreinador = scanner.nextInt();
        Pokemon pokemonTr = listaPokemonTr.get(codPokemonTreinador-1);
//        listaPokemonTr.remove(codPokemonTreinador);

        Map<Integer, NPC> listaNpc = new HashMap<>();
        listaNpc.put(1, bruna);
        listaNpc.put(2, eduardo);
        listaNpc.put(3, matheus);

        Integer codNpc = 1 + random.nextInt(3);
        NPC npc = listaNpc.get(codNpc);

        ArrayList<Pokemon> listaPokemonNpc = new ArrayList<Pokemon>();
        listaPokemonNpc.add(npc.pokemon1);
        listaPokemonNpc.add(npc.pokemon2);
        listaPokemonNpc.add(npc.pokemon3);

        sortearPokemonNpc(listaPokemonNpc);

        System.out.println("Olá, sou seu rival " + npc.getNomeNpc());
        System.out.println("O inimigo escolheu " + pokemonNpc.getNome());

        Map<Integer, Ataque> listaAtaqueTr = new HashMap<>();
        listaAtaqueTr.put(1, pokemonTr.ataque1);
        listaAtaqueTr.put(2, pokemonTr.ataque2);
        listaAtaqueTr.put(3, pokemonTr.ataque3);

        Map<Integer, Ataque> listaAtaqueNpc = new HashMap<>();
        listaAtaqueNpc.put(1, pokemonNpc.ataque1);
        listaAtaqueNpc.put(2, pokemonNpc.ataque2);
        listaAtaqueNpc.put(3, pokemonNpc.ataque3);

        Boolean batalhaTerminou = false;
        do {
            escolherAtaque(pokemonTr, codPokemonTreinador);
            Integer codAtaque = scanner.nextInt();

            Integer dano = listaAtaqueTr.get(codAtaque).getDano();
            realizarAtaque(pokemonNpc, dano);

          //  if (pokemonNpc.vida <= 0){
          //      listaPokemonNpc.remove(pokemonNpc);
          //  }

            if (pokemonNpc.vida <= 0 && listaPokemonNpc.size() > 0) {
                sortearPokemonNpc(listaPokemonNpc);
                System.out.println("\nO inimigo escolheu " + pokemonNpc.getNome());
            }
            if (pokemonNpc.vida <= 0 && listaPokemonNpc.size() == 0) {
                System.out.println("Vencedor é " + usuario.getNome());
                batalhaTerminou = true;
                break;
            }

            dano = sortearAtaqueNpc(listaAtaqueNpc);
            realizarAtaque(pokemonTr, dano);

            //if (pokemonTr.vida <=0 ) {
            //    listaPokemonTr.remove(pokemonTr);
            //}
            if (pokemonTr.vida <= 0 && listaPokemonTr.size() > 0) {


                listaPokemonTr.remove(codPokemonTreinador-1);
                int a=1;
                for (Pokemon i : listaPokemonTr) {
                    System.out.println(a+" - "+i.getNome());
                    a++;
                }
                if (listaPokemonTr.size() ==0){
                    System.out.println("Vencedor é " + npc.getNomeNpc());
                    batalhaTerminou = true;
                    break;
                }
                System.out.println("Escolha um pokemon para batalhar: ");
                codPokemonTreinador = scanner.nextInt();
                pokemonTr = listaPokemonTr.get(codPokemonTreinador-1);
                System.out.println("Você escolheu " + pokemonTr.getNome());
            }
            if (pokemonTr.vida <= 0 && listaPokemonTr.size() == 0) {
                System.out.println("Vencedor é " + npc.getNomeNpc());
                batalhaTerminou = true;
            }

        } while(!batalhaTerminou);


        /*
        Evoluções

        Pokemon("Bellsprout",1000,"Acid","Sludge Bomb","Power Whip");
        Pokemon aaa = new Pokemon("Weepinbell", 1000, "Acid", "Sludge Bomb", "Power Whip");
        Pokemon aaa = new Pokemon("Victreebel", 1000,"Acid", "Sludge Bomb", "Solar Beam");

        Pokemon aaa = new Pokemon("Bulbassauro", 1000, "Vine Whip", "Sludge Bomb", "Power Whip");
        Pokemon aaa = new Pokemon("Ivyssauro", 1000, "Vine Whip","Sludge Bomb","Razor Leaf");
        Pokemon aaa = new Pokemon("Venussaur
        */

    }
    public static void escolherPokemonBatalhar(Treinador usuario){
        System.out.println("1 - " + usuario.pokemon1.getNome());
        System.out.println("2 - " + usuario.pokemon2.getNome());
        System.out.println("3 - " + usuario.pokemon3.getNome());
        System.out.println("Escolha um pokemon para batalhar: ");
    }

    public static void sortearPokemonNpc(ArrayList listaPokemonNpc){
        int codPokemonNpc = random.nextInt(listaPokemonNpc.size());
        pokemonNpc = (Pokemon) listaPokemonNpc.get(codPokemonNpc);
        listaPokemonNpc.remove(codPokemonNpc);
    }

    public static Integer sortearAtaqueNpc(Map<Integer, Ataque> listaAtaqueNpc){
        Integer codAtaque = 1 + random.nextInt(3-1);
        return listaAtaqueNpc.get(codAtaque).getDano();
    }

    public static void escolherAtaque(Pokemon pokemonTr, Integer codPokemonBatalha){
        System.out.println("1 - " + pokemonTr.ataque1.getNomeAtaque());
        System.out.println("2 - " + pokemonTr.ataque2.getNomeAtaque());
        System.out.println("3 - " + pokemonTr.ataque3.getNomeAtaque());
        System.out.println("Escolha um ataque: ");
    }

    public static void realizarAtaque(Pokemon pokemon, Integer dano){
        pokemon.setVida(pokemon.vida - dano);
        if (pokemon.vida <= 0){
            System.out.println("Após o ataque " + pokemon.getNome() + " Morreu!\n");


        } else {
            System.out.println("Após o ataque " + pokemon.getNome() + " está com " + pokemon.vida);
        }
    }
}