import java.util.ArrayList;
public class Database {

    private ArrayList<Superhero> helteListe = new ArrayList<Superhero>();



    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        helteListe.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<Superhero> hentSuperhero(){
        return helteListe;
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
