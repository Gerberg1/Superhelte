import java.util.ArrayList;
public class Database {

    private ArrayList<Superhero> helteListe = new ArrayList<Superhero>();



    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        helteListe.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<Superhero> hentSuperhero(){
        return helteListe;
    }

    public void searchSuperhero(String søgeNavn) {
        for (Superhero p : hentSuperhero()) {
            if (søgeNavn.equalsIgnoreCase(p.getName()) || p.getName().contains(søgeNavn)) {
                System.out.println("Superhelt fundet: " + p.getName());
                break;
            }
                System.out.println("Kunne ikke finde: " + søgeNavn);
        }
    }
    public Superhero findSuperhelt(String navn){
        for (Superhero s: helteListe) {
            if (s.getName().equals(navn)){
                return s;
            }
        }
        return null;
    }
}