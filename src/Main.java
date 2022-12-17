import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       // Scanner scanner = new Scanner(System.in);

      //  System.out.println();


        //Ataque ata = new Ataque("pika",500,300);
        Pokemon pika = new Pokemon("pika", 1000, "raio", "choque", "teia");
        Pokemon bulba = new Pokemon("bulba", 1000, "agua", "jato", "chicote");

        NPC bruna = new NPC("Bruna", bulba);

//        new Pokemon("Pika3",1000,"at1","at2","at3");

        //int a = new Ataque("ata",500,300).getDano();
        //System.out.println(a);
        System.out.println("Pokemon - " + pika.getNome());
        System.out.println("Ataque1 - " + pika.ataque1.getNomeAtaque() + " - " + pika.ataque1.getDano());
        System.out.println("Ataque2 - " + pika.ataque2.getNomeAtaque() + " - " + pika.ataque2.getDano());
        System.out.println("Ataque3 - " + pika.ataque3.getNomeAtaque() + " - " + pika.ataque3.getDano());

        System.out.println("Pokemon - " + bulba.getNome());
        System.out.println("Ataque1 - " + bulba.ataque1.getNomeAtaque() + " - " + bulba.ataque1.getDano());
        System.out.println("Ataque2 - " + bulba.ataque2.getNomeAtaque() + " - " + bulba.ataque2.getDano());
        System.out.println("Ataque3 - " + bulba.ataque3.getNomeAtaque() + " - " + bulba.ataque3.getDano());

//        System.out.println("Pokemon - " + pika.getNome());
//        System.out.println("Ataque1 - " + pika.ataque1.getNomeAtaque() + " - " + pika.ataque1.getDano());
//        System.out.println("Ataque2 - " + pika.ataque2.getNomeAtaque() + " - " + pika.ataque2.getDano());
//        System.out.println("Ataque3 - " + pika.ataque3.getNomeAtaque() + " - " + pika.ataque3.getDano());


        Batalha bat1 = new Batalha(pika,bulba);
            bat1.AtaquePok1();
            bat1.AtaquePok2();

        System.out.println(bat1.getPokemon1().vida);





        //pika.setVida(500);
        System.out.println(bat1.getPokemon2().vida);



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