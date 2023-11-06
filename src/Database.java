import java.util.ArrayList;
import java.util.Collections;

public class Database {

    FileHandler fh;

    public Database() {
        fh = new FileHandler();
    }

    private ArrayList<Superhero> heroList = new ArrayList<Superhero>();


    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        heroList.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<Superhero> getSuperhero() {
        Collections.sort(heroList, new NameComparator());
        return heroList;
    }

    public void saveSuperheroes(ArrayList helteListe) {
        fh.saveSuperheroes(helteListe);
    }

    public void tilføjGemteHelte(ArrayList helteListe) {
        fh.tilføjGemteHelte(helteListe);
    }


    public String searchSuperhero(String searchName) {
        StringBuilder stringbuilder = new StringBuilder();
        for (Superhero p : heroList) {
            if (searchName.equalsIgnoreCase(p.getName()) || p.getName().contains(searchName)) {
                stringbuilder.append(p.getName()).append(". ");
            }
        }
        return stringbuilder.toString();
    }


    public String showASuperhero(String specificSearchName) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                return s.toString();
            }

            }

       return null;
    }

    public void changeName(String specificSearchName, String newName) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                s.setName(newName);
            }
        }
    }

    public void changeRealName(String specificSearchName, String newRealName) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                s.setRealName(newRealName);
            }
        }

    }

    public void changeSuperPower(String specificSearchName, String newSuperPower) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                s.setSuperPower(newSuperPower);
            }
        }
    }

    public void changeYearCreated(String specificSearchName, int newYearCreated) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                s.setYearCreated(newYearCreated);
            }
        }
    }

    public void changeIsHuman(String specificSearchName, String newIsHuman) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                s.setIsHuman(newIsHuman);
            }
        }
    }

    public void changeStrength(String specificSearchName, String newStrength) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                s.setStrength(newStrength);
            }
        }
    }
}