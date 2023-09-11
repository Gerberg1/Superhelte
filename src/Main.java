import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Opret en superhelt");
        System.out.println("Hvad er navnet på din superhelt?");
        String Navn = keyboard.next();
        System.out.println("Hvad er superheltens virkelige navn?");
        String virkeligeNavn = keyboard.next();
        System.out.println("Hvad er superheltens superkraft?");
        String superKraft = keyboard.next();
        System.out.println("Hvilket år udkom din superhelt?");
        String årSkabt = keyboard.next();
        System.out.println("Er din superhelt et menneske?");
        String erMenneske = keyboard.next();


    }
}
