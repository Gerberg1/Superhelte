import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> helteListe = new ArrayList<Superhero>();


    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        helteListe.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<Superhero> hentSuperhero() {
        return helteListe;
    }


    public void searchSuperhero(String søgeNavn) {
        for (Superhero p : hentSuperhero()) {
            if (søgeNavn.equalsIgnoreCase(p.getName()) || p.getName().contains(søgeNavn)) {
                System.out.println("Matchende superhelte fundet: " + p.getName());
            } else {
                System.out.println("Kunne ikke finde: " + søgeNavn);
            }
        }
    }


    public Superhero visEnSuperhelt(String søgeNavnBestemt) {
        for (Superhero s : helteListe) {
            if (s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                System.out.println(hentSuperhero());
            } else if (!s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                System.out.println("Superhelten findes ikke:");
            }
        }
        return null;
    }

    public Superhero ændreNavn(String søgeNavnBestemt, String nytNavn) {
        for (Superhero s : helteListe) {
            if (s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                s.setName(nytNavn);
            }
        }
        return null;
    }

    public Superhero ændreVirkeligeNavn(String søgeNavnBestemt, String nytVirkeligeNavn) {
        for (Superhero s : helteListe) {
            if (s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                s.setName(nytVirkeligeNavn);
            }
        }
        return null;
    }

    public Superhero ændreSuperkraft(String søgeNavnBestemt, String nySuperkraft) {
        for (Superhero s : helteListe) {
            if (s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                s.setSuperPower(nySuperkraft);
            }
        }
        return null;
    }

    public Superhero ændreÅrSkabt(String søgeNavnBestemt, int nytÅrSkabt) {
        for (Superhero s : helteListe) {
            if (s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                s.setYearCreated(nytÅrSkabt);
            }
        }
        return null;
    }

    public Superhero ændreErMenneske(String søgeNavnBestemt, String nyErMenneske) {
        for (Superhero s : helteListe) {
            if (s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                s.setIsHuman(nyErMenneske);
            }
        }
        return null;
    }

    public Superhero ændreStyrkeNiveau(String søgeNavnBestemt, String nytStyrkeNiveua) {
        for (Superhero s : helteListe) {
            if (s.getName().equalsIgnoreCase(søgeNavnBestemt)) {
                s.setStrength(nytStyrkeNiveua);
            }
        }
        return null;
    }
}