import java.util.ArrayList;

public class Controller {

    private Database db;


    public Controller(Database db) {
        this.db = db;
    }

    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        db.addSuperhero(name, realName, superPower, yearCreated, isHuman, strength);
    }

    public String searchSuperhero(String searchName) {
        return db.searchSuperhero(searchName);
    }

    public void changeName(String specificSearchName, String newName) {
        db.changeName(specificSearchName, newName);
    }

    public void changeRealName(String specificSearchName, String newRealName) {
        db.changeRealName(specificSearchName, newRealName);
    }

    public void changeSuperPower(String specificSearchName, String newSuperPower) {
        db.changeSuperPower(specificSearchName, newSuperPower);
    }

    public void changeYearCreated(String specificSearchName, int newYearCreated) {
        db.changeYearCreated(specificSearchName, newYearCreated);
    }

    public void changeIsHuman(String specificSearchName, String newIsHuman) {
        db.changeIsHuman(specificSearchName, newIsHuman);
    }

    public void changeStrength(String specificSearchName, String newStrength) {
        db.changeStrength(specificSearchName, newStrength);
    }

    public ArrayList<Superhero> getSuperhero() {
        return db.getSuperhero();
    }

    public String showASuperhero(String specificSearchName) {
        return db.showASuperhero(specificSearchName);
    }
}