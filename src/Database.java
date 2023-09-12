import java.util.ArrayList;
public class Database {

    private ArrayList<Superhero> helteListe = new ArrayList<Superhero>();
    int count = 0;


    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        helteListe.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<Superhero> hentSuperhero(){
        return helteListe;
    }

}
