import java.util.Scanner;

public class Userinterface {
    private Controller controller;
    Scanner keyboard = new Scanner(System.in);
    public void startProgram() {


        Userinterface m = new Userinterface();
        Database db = new Database();
        m.controller = new Controller(db);
        m.tilføjHelt();

    }

        public void tilføjHelt () {

            System.out.println("Velkommen til SUPERHERO UNIVERSET.");
            System.out.println("1. Opret superhelt");
            System.out.println("2. Se dine superhelte");
            System.out.println("3. Søg efter en superhelt");
            System.out.println("4. Ændre din superhelte");
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

            } else if (valg != '1' && valg != '9' && valg != '2' && valg != '3' && valg !='4') {
                System.out.println("Skriv 1, 2, 3 eller 9 for at vælge. \n");
                tilføjHelt();
            } else if (valg == '3') {
                søgSuperhelt();
            } else if (valg == '4') {
                editSuperhero();

            } else if (valg == '9') {
                System.out.println("Dine helte er oprettet og dit program afsluttes");
            }
        }

        public void visSuperhelt () {
            System.out.println("Superhelte i din database:");
            for (Superhero s : controller.hentSuperhero()) {
                System.out.println(s);
            }
            tilføjHelt();
        }

        public void søgSuperhelt () {
            System.out.println("Skriv navnet på den superhelt, du vil søge efter:");
            String søgeNavn = keyboard.next();
            //for (Superhero p : controller.hentSuperhero()) {
            controller.searchSuperhero(søgeNavn);
            System.out.println("Skriv navnet på den superhelt, du vil se informationer om:");
            String søgeNavnBestemt = keyboard.next();
            controller.visEnSuperhelt(søgeNavnBestemt);
            tilføjHelt();
        }

        public void editSuperhero () {
            System.out.println("Skriv navnet på den superhelt, du vil søge efter:");
            String søgeNavnBestemt = keyboard.next();
            controller.visEnSuperhelt(søgeNavnBestemt);
            System.out.println("Hvad vil du ændre?");
            System.out.println("1. Navn");
            System.out.println("2. Virkelige navn");
            System.out.println("3. Superkraft");
            System.out.println("4. Året superhelten er skabt");
            System.out.println("5. Om superheltet er et menneske");
            System.out.println("6. Styrkeniveauet");
            char superhelteÆndring = keyboard.next().charAt(0);
            if (superhelteÆndring == '1') {
                System.out.println("Hvad vil du ændre navnet til?");
                String nytNavn = keyboard.next();
                controller.ændreNavn(søgeNavnBestemt, nytNavn);
                System.out.println("Navnet er ændret!");
                tilføjHelt();
            } else if (superhelteÆndring == '2') {
                System.out.println("Hvad vil du ændre det virkelige navn til?");
                String nytVirkeligeNavn = keyboard.next();
                controller.ændreVirkeligeNavn(søgeNavnBestemt, nytVirkeligeNavn);
                System.out.println("Det virkelige navn er ændret!");
                tilføjHelt();
            } else if (superhelteÆndring == '3') {
                System.out.println("Hvad vil du ændre det virkelige navn til?");
                String nySuperkraft = keyboard.next();
                controller.ændreSuperkraft(søgeNavnBestemt, nySuperkraft);
                System.out.println("Superkraften er ændret!");
                tilføjHelt();
            } else if (superhelteÆndring == '4') {
                System.out.println("Hvad vil du ændre det året til?");
                int nytÅrSkabt = keyboard.nextInt();
                controller.ændreÅrSkabt(søgeNavnBestemt, nytÅrSkabt);
                System.out.println("Årstallet er ændret!");
                tilføjHelt();
            } else if (superhelteÆndring == '5') {
                System.out.println("Er din superhelt stadig et menneske?");
                String nyErMenneske = keyboard.next();
                controller.ændreErMenneske(søgeNavnBestemt, nyErMenneske);
                System.out.println("Menneskestatus er ændret");
                tilføjHelt();
            }else if (superhelteÆndring == '6') {
                System.out.println("Hvad vil du ændre styrkeniveauet til?");
                String nytStyrkeNiveau = keyboard.next();
                controller.ændreStyrkeNiveau(søgeNavnBestemt, nytStyrkeNiveau);
                System.out.println("Styrkeniveauet er ændret");
                tilføjHelt();
            }


        }
    }













