import java.util.ArrayList;
public class Controller {

    private Database db;


    public Controller(Database db) {
    this.db = db;
    }

    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        db.tilføjSuperhelt(name, realName, superPower, yearCreated, isHuman, strength);
    }

    public void searchSuperhero(String søgeNavn){
        db.searchSuperhero(søgeNavn);
    }

    public ArrayList<Superhero> hentSuperhero() {
        return db.hentSuperhero();
    }
}