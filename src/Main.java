import java.util.Scanner;


public class Main {
    private Controller controller;
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        Database db = new Database();
        m.controller = new Controller(db);
        m.tilføjHelt();
    }



        public void tilføjHelt() {

            System.out.println("Velkommen til SUPERHERO UNIVERSET.");
            System.out.println("1. Opret superhelt");
            System.out.println("2. Se din superhelt");
            System.out.println("9. Afslut");
            char valg = keyboard.next().charAt(0);

            if (valg == '1') {

                System.out.println("Opret en superhelt");
                System.out.println("Hvad er navnet på din superhelt?");
                String Navn = keyboard.next();
                System.out.println("Hvad er superheltens virkelige navn?");
                String virkeligeNavn = keyboard.next();
                System.out.println("Hvad er superheltens superkraft?");
                String superKraft = keyboard.next();
                System.out.println("Hvilket år udkom din superhelt?");
                keyboard.nextLine();
                int årSkabt = keyboard.nextInt();
                System.out.println("Er din superhelt et menneske?");
                String erMenneske = keyboard.next();
                System.out.println("Hvad er din superhelts styrkelevel?");
                String styrke = keyboard.next();
                System.out.println("Din superhelt er oprettet!");

                controller.tilføjSuperhelt(Navn, virkeligeNavn, superKraft, årSkabt, erMenneske, styrke);
                tilføjHelt();


            } else if (valg == '2') {
                visSuperhelt();

                } else if (valg != '1' && valg != '9' && valg != '2') {
                    System.out.println("Skriv 1, 2 eller 9 for at vælge. \n");
                    tilføjHelt();
                } else if (valg == '9') {
                    System.out.println("Dine helte er oprettet og dit program afsluttes");
                }
            }

        public void visSuperhelt() {
            System.out.println("Superhelte i din database:");
            for (Superhero s: controller.hentSuperhero()){
                System.out.println(s);
            }

            }

    }














