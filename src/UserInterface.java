import java.util.Scanner;

public class UserInterface {
    private Controller controller;
    Scanner keyboard = new Scanner(System.in);

    public void startProgram() {


        UserInterface m = new UserInterface();
        Database db = new Database();
        m.controller = new Controller(db);
        m.addSavedHeroes();

    }

    public void addSavedHeroes() {
        controller.addSavedSuperheroes();
        createSuperhero();
    }

    public void createSuperhero() {

        boolean changedSuperhero = false;


        System.out.println("Velkommen til SUPERHERO UNIVERSET.");
        System.out.println("1. Opret superhelt");
        System.out.println("2. Se dine superhelte");
        System.out.println("3. Søg efter en superhelt");
        System.out.println("4. Ændre din superhelte");
        System.out.println("5. Gem dine superhelte");
        System.out.println("9. Afslut");
        char userchoice = keyboard.next().charAt(0);

        switch (userchoice) {

            case '1':

                System.out.println("Opret en superhelt");
                System.out.println("Hvad er navnet på din superhelt?");
                keyboard.nextLine();
                String Name = keyboard.nextLine();
                System.out.println("Hvad er superheltens virkelige navn?");
                String realName = keyboard.nextLine();
                System.out.println("Hvad er superheltens superkraft?");
                String superPower = keyboard.nextLine();
                System.out.println("Hvilket år udkom din superhelt?");
                if (!keyboard.hasNextInt()) {
                    String text = keyboard.next();
                    System.out.println(text + " er ikke et gyldigt tal. Prøv igen.");
                }
                int yearCreated = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Er din superhelt et menneske?");
                String isHuman = keyboard.nextLine();
                System.out.println("Hvad er din superhelts styrkelevel?");
                String strength = keyboard.nextLine();
                System.out.println("Din superhelt er oprettet!");

                controller.addSuperhero(Name, realName, superPower, yearCreated, isHuman, strength);
                changedSuperhero = true;
                createSuperhero();


            case '2':
                System.out.println("Hvilket kriterie vil du sortere dine superhelte efter?  ");
                System.out.println("1. Alfabetisk efter superheltenavn");
                System.out.println("2. Årstal superhelten er skabt");
                System.out.println("3. Superheltens styrke");
                char sortBy = this.keyboard.next().charAt(0);
                System.out.println("Hvilket kriterie vil du have som anden prioritet?");
                char sortBySecondary = this.keyboard.next().charAt(0);
                if (sortBy == sortBySecondary) {
                    System.out.println("Dit andet kriterie må ikke være det samme som dit første kriterie." +
                            "Vælg en anden prioritet igen.");
                    sortBySecondary = this.keyboard.next().charAt(0);
                }


                controller.getSuperheroByChoice(sortBy, sortBySecondary);
                System.out.println(controller.getSuperhero());
                createSuperhero();


                if (userchoice != '2' && userchoice != '3' && userchoice != '4') {
                    System.out.println("Skriv 1, 2, 3, 4 eller 9 for at vælge. \n");
                    createSuperhero();
                }
            case '3':
                searchSuperhero();
            case '4':
                editSuperhero();
            case '5':
                controller.saveSuperheroes();
                System.out.println("Dine superhelte er gemt!");
                createSuperhero();

            case '9':
                if (changedSuperhero) {
                    controller.saveSuperheroes();
                }

                System.out.println("Dine helte er oprettet og dit program afsluttes");
                System.exit(0);
        }

    }

    public void showSuperhero() {
        System.out.println("Superhelte i din database:");
        for (Superhero s : controller.getSuperhero()) {
            System.out.println(s);
        }
        createSuperhero();
    }

    public void searchSuperhero() {
        System.out.println("Skriv navnet på den superhelt, du vil søge efter:");
        String searchName = keyboard.next();
        System.out.println("Matchende superhelte fundet:" + controller.searchSuperhero(searchName));
        if (controller.searchSuperhero(searchName) == null) {
            System.out.println("Kunne ikke finde: " + searchName);
            createSuperhero();
        }
        System.out.println("Skriv navnet på den superhelt, du vil se informationer om:");
        keyboard.nextLine();
        String specificSearchName = keyboard.nextLine();
        if (controller.showASuperhero(specificSearchName) == null) {
            System.out.println("Kunne ikke finde: " + specificSearchName);
            createSuperhero();
        }
        System.out.println(controller.showASuperhero(specificSearchName));
        createSuperhero();
    }

    public void editSuperhero() {
        System.out.println("Skriv navnet på den superhelt, du vil søge efter:");
        String searchName = keyboard.next();

        if (controller.searchSuperhero(searchName) == null) {
            System.out.println("Superhelten kunne ikke findes.");
            createSuperhero();
        }
        System.out.println("Matchende superhelte fundet: " + controller.searchSuperhero(searchName));
        System.out.println("Skriv navnet på den superhelt, du vil ændre på:");
        keyboard.nextLine();
        String specificSearchName = keyboard.nextLine();
        System.out.println(controller.showASuperhero(specificSearchName));
        if (controller.showASuperhero(specificSearchName) == null) {
            System.out.println("Superhelten kunne ikke findes.");
            createSuperhero();
        }
        System.out.println("Hvad vil du ændre?");
        System.out.println("1. Navn");
        System.out.println("2. Virkelige navn");
        System.out.println("3. Superkraft");
        System.out.println("4. Året superhelten er skabt");
        System.out.println("5. Om superheltet er et menneske");
        System.out.println("6. Styrkeniveauet");
        char superheroChange = keyboard.next().charAt(0);
        if (superheroChange == '1') {
            System.out.println("Hvad vil du ændre navnet til?");
            keyboard.nextLine();
            String newName = keyboard.nextLine();
            System.out.println("Navnet er ændret!");
            controller.changeName(specificSearchName, newName);
            System.out.println("Navnet er ændret!");
            specificSearchName = newName;
            System.out.println(controller.showASuperhero(specificSearchName));
            createSuperhero();
        } else if (superheroChange == '2') {
            System.out.println("Hvad vil du ændre det virkelige navn til?");
            keyboard.nextLine();
            String newRealName = keyboard.nextLine();
            controller.changeRealName(specificSearchName, newRealName);
            System.out.println("Det virkelige navn er ændret!");
            System.out.println(controller.showASuperhero(specificSearchName));
            createSuperhero();
        } else if (superheroChange == '3') {
            System.out.println("Hvad vil du ændre superkraften til?");
            keyboard.nextLine();
            String newSuperPower = keyboard.nextLine();
            controller.changeSuperPower(specificSearchName, newSuperPower);
            System.out.println("Superkraften er ændret!");
            System.out.println(controller.showASuperhero(specificSearchName));
            createSuperhero();
        } else if (superheroChange == '4') {
            System.out.println("Hvad vil du ændre det året til?");
            if (!keyboard.hasNextInt()) {
                String text = keyboard.next();
                System.out.println(text + " er ikke et gyldigt tal. Prøv igen.");
            }
            int newYearCreated = keyboard.nextInt();
            controller.changeYearCreated(specificSearchName, newYearCreated);
            System.out.println("Årstallet er ændret!");
            System.out.println(controller.showASuperhero(specificSearchName));
            createSuperhero();
        } else if (superheroChange == '5') {
            System.out.println("Er din superhelt et menneske?");
            String newIsHuman = keyboard.next();
            controller.changeIsHuman(specificSearchName, newIsHuman);
            System.out.println("Menneskestatus er ændret");
            System.out.println(controller.showASuperhero(specificSearchName));
            createSuperhero();
        } else if (superheroChange == '6') {
            System.out.println("Hvad vil du ændre styrkeniveauet til?");
            keyboard.nextLine();
            String newStrength = keyboard.nextLine();
            controller.changeStrength(specificSearchName, newStrength);
            System.out.println("Styrkeniveauet er ændret");
            System.out.println(controller.showASuperhero(specificSearchName));
            createSuperhero();
        }

    }
}













