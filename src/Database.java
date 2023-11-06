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
        return heroList;
    }

    public String showAllSuperheroes(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Superhero p : heroList) {
           stringBuilder.append(showASuperhero(p.getName())+"\n") ;
        }
       return stringBuilder.toString();
    }

    public ArrayList<Superhero> getSuperheroByChoice(char sortBy, char sortBySecondary){

        switch (sortBy) {
            case '1':
                if (sortBySecondary == '2') {
                    Collections.sort(heroList, new NameComparator().thenComparing(new YearCreatedComparator()));
                    break;
                }
                if (sortBySecondary == '3') {
                    Collections.sort(heroList, new NameComparator().thenComparing(new StrengthComparator()));
                    break;
                }
            case '2':
                if (sortBySecondary == '1') {
                    Collections.sort(heroList, new YearCreatedComparator().thenComparing(new NameComparator()));
                    break;
                }
                if (sortBySecondary == '3') {
                    Collections.sort(heroList, new YearCreatedComparator().thenComparing(new StrengthComparator()));
                    break;
                }
            case '3':
                if (sortBySecondary == '1') {
                    Collections.sort(heroList, new StrengthComparator().thenComparing(new NameComparator()));
                    break;
                }
                if (sortBySecondary == '2') {
                    Collections.sort(heroList, new StrengthComparator().thenComparing(new YearCreatedComparator()));
                    break;
                }
        }

        return heroList;
    }



    public void saveSuperheroes(ArrayList helteListe) {
        fh.saveSuperheroes(helteListe);
    }

    public void addSavedSuperheroes(ArrayList helteListe) {
        fh.addSavedSuperheroes(helteListe);
    }


    public String searchSuperhero(String searchName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Superhero p : heroList) {
            if (p.getName().toLowerCase().contains(searchName.toLowerCase()))
            stringBuilder.append(p.getName() + ". ");
            }
        return stringBuilder.toString();
        }

    public void deleteSuperhero(String specificSearchName) {
        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).equals(showASuperhero(specificSearchName))) {
                heroList.remove(heroList.get(i));
            }
        }
    }




    public Superhero showASuperhero(String specificSearchName) {
        for (Superhero s : heroList) {
            if (s.getName().equalsIgnoreCase(specificSearchName)) {
                return s;
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