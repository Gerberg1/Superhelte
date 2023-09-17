import java.util.ArrayList;

public class Controller {

    private Database db;


    public Controller(Database db) {
        this.db = db;
    }

    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        db.tilføjSuperhelt(name, realName, superPower, yearCreated, isHuman, strength);
    }

    public void searchSuperhero(String søgeNavn) {
        db.searchSuperhero(søgeNavn);
    }

    public void ændreNavn(String søgeNavnBestemt, String nytNavn) {
        db.ændreNavn(søgeNavnBestemt, nytNavn);
    }

    public void ændreVirkeligeNavn(String søgeNavnBestemt, String nytVirkeligeNavn) {
        db.ændreVirkeligeNavn(søgeNavnBestemt, nytVirkeligeNavn);
    }

    public void ændreSuperkraft(String søgeNavnBestemt, String nySuperkraft) {
        db.ændreSuperkraft(søgeNavnBestemt, nySuperkraft);
    }

    public void ændreÅrSkabt(String søgeNavnBestemt, int nytÅrSkabt) {
        db.ændreÅrSkabt(søgeNavnBestemt, nytÅrSkabt);
    }

    public void ændreErMenneske(String søgeNavnBestemt, String nyErMenneske) {
        db.ændreErMenneske(søgeNavnBestemt, nyErMenneske);
    }

    public void ændreStyrkeNiveau(String søgeNavnBestemt, String nytStyrkeNiveau) {
        db.ændreStyrkeNiveau(søgeNavnBestemt, nytStyrkeNiveau);
    }

    public ArrayList<Superhero> hentSuperhero() {
        return db.hentSuperhero();
    }

    public void visEnSuperhelt(String søgeNavnBestemt) {
        db.visEnSuperhelt(søgeNavnBestemt);
    }
}