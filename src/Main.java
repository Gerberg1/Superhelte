import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Database helteHold = new Database();


        Scanner keyboard = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println("Opret en superhelt");
            System.out.println("Hvad er navnet på din superhelt?");
            String Navn = keyboard.next();
            System.out.println("Hvad er superheltens virkelige navn?");
            String virkeligeNavn = keyboard.next();
            System.out.println("Hvad er superheltens superkraft?");
            String superKraft = keyboard.next();
            System.out.println("Hvilket år udkom din superhelt?");
            int årSkabt = keyboard.nextInt();
            System.out.println("Er din superhelt et menneske?");
            String erMenneske = keyboard.next();
            System.out.println("Hvad er din superhelts styrkelevel?");
            String styrke = keyboard.next();
            i++;

            helteHold.tilføjSuperhelt(Navn, virkeligeNavn, superKraft, årSkabt, erMenneske, styrke);
        }
        while (i<5);

        System.out.println(helteHold.getHero1().getName());




    }




    }

