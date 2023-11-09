import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    @Test
    public void addSuperhero() {
        Database database = new Database();

        database.addSuperhero("Superman", "Clark Kent", "Super stærk", 1938, "Ja", "20");


        Superhero superhero = database.showASuperhero("Superman");
        ArrayList<Superhero> superheroArrayList = new ArrayList<>();
        superheroArrayList.add(superhero);
        int expectedResult = 1;
        int actualResult = superheroArrayList.size();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void showSuperhero() {
        Database database = new Database();
        database.addSuperhero("Superman", "Clark Kent", "Super stærk", 1938, "Ja", "20");
        Superhero superhero = database.showASuperhero("Superman");
        assertEquals("Superman", superhero.getName());
        assertEquals("Clark Kent", superhero.getRealName());
        assertEquals("Super stærk", superhero.getSuperPower());
        assertEquals(1938, superhero.getYearCreated());
        assertEquals("Ja", superhero.getIsHuman());
        assertEquals("20", superhero.getStrength());
    }

    @Test
    public void nameComparator() {
        Database database = new Database();



        database.addSuperhero("Superman", "Clark Kent", "Super stærk", 1938, "Ja", "20");
        database.addSuperhero("Batman", "Clark Kent", "Super stærk", 1938, "Ja", "20");
        database.addSuperhero("Spiderman", "Clark Kent", "Super stærk", 1938, "Ja", "20");

        Superhero superhero = database.showASuperhero("Superman");
        Superhero superhero1 = database.showASuperhero("Batman");
        Superhero superhero2 = database.showASuperhero("Spiderman");



        ArrayList<Superhero> superheroArrayList = new ArrayList<>();
        superheroArrayList.add(superhero);
        superheroArrayList.add(superhero1);
        superheroArrayList.add(superhero2);
        Collections.sort(superheroArrayList, new NameComparator());
        String expectedResult = "Batman";
        String actualResult = superheroArrayList.get(0).getName();
        assertEquals(expectedResult, actualResult);


    }

    @Test
    public void yearCreatedComparator() {
        Database database = new Database();



        database.addSuperhero("Superman", "Clark Kent", "Super stærk", 1901, "Ja", "20");
        database.addSuperhero("Batman", "Clark Kent", "Super stærk", 2001, "Ja", "20");
        database.addSuperhero("Spiderman", "Clark Kent", "Super stærk", 1801, "Ja", "20");

        Superhero superhero = database.showASuperhero("Superman");
        Superhero superhero1 = database.showASuperhero("Batman");
        Superhero superhero2 = database.showASuperhero("Spiderman");


        ArrayList<Superhero> superheroArrayList = new ArrayList<>();
        superheroArrayList.add(superhero);
        superheroArrayList.add(superhero1);
        superheroArrayList.add(superhero2);
        Collections.sort(superheroArrayList, new YearCreatedComparator());
        String expectedResult = "Spiderman";
        String actualResult = superheroArrayList.get(0).getName();
        assertEquals(expectedResult, actualResult);


    }

    @Test
    public void strengthComparator() {
        Database database = new Database();


        database.addSuperhero("Superman", "Clark Kent", "Super stærk", 1901, "Ja", "bbb");
        database.addSuperhero("Batman", "Clark Kent", "Super stærk", 2001, "Ja", "aaa");
        database.addSuperhero("Spiderman", "Clark Kent", "Super stærk", 1801, "Ja", "ddd");

        Superhero superhero = database.showASuperhero("Superman");
        Superhero superhero1 = database.showASuperhero("Batman");
        Superhero superhero2 = database.showASuperhero("Spiderman");


        ArrayList<Superhero> superheroArrayList = new ArrayList<>();
        superheroArrayList.add(superhero);
        superheroArrayList.add(superhero1);
        superheroArrayList.add(superhero2);
        Collections.sort(superheroArrayList, new StrengthComparator());
        String expectedResult = "Batman";
        String actualResult = superheroArrayList.get(0).getName();
        assertEquals(expectedResult, actualResult);


    }

}