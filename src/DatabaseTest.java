import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    Database db;
    Superhero superhelt;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        db = new Database();
        //  int startSize = hentSuperhero().Size();
        db.hentSuperhero().addAll(List.of(
                new Superhero("Batman", "Bruce Wayne", "Gadgets", 1950, "Ja", "100"),
                new Superhero("Superman", "Clark Kent", "Strength", 1948, "Nej", "1000")));
        superhelt = new Superhero("Ironman", "Tony Stark", "Powersuit", 1951, "Ja", "150");

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void tilføjSuperhelt() {
        int expectedLength = db.hentSuperhero().size() + 1;
        db.tilføjSuperhelt("Spiderman", "Peter Parker", "Spider power", 1949, "ja", "200");
        int actualLength = db.hentSuperhero().size();

        assertEquals(expectedLength, actualLength);


    }

    @org.junit.jupiter.api.Test
    void hentSuperhero() {
        int expectedResult = 2;
        int actualResult = db.hentSuperhero().size();

        assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void searchSuperhero() {
        String expectedName = "Ironman";
        String actualName = superhelt.getName();
        assertNotNull(superhelt);

        assertEquals(expectedName, actualName);
    }




    @org.junit.jupiter.api.Test
    void visEnSuperhelt() {
        String expectedResult = "{"+
                "Navn='Ironman" + '\'' +
                ", Virkelige navn='Tony Stark" + '\'' +
                ", Superkraft='Powersuit"+ '\'' +
                ", Oprindelsesår=1951" +
                ", Er menneske?='Ja" + '\'' +
                ", Styrke='150" + '\'' +
                '}';
        Superhero actualResult = (superhelt);
        assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void ændreNavn() {
        String expectedName = "Jernmand";
        //db.tilføjSuperhelt("Ironman", "Tony Stark", "Powersuit", 1951, "Ja", "150");
        db.ændreNavn(superhelt.getName(), "Jernmand");
        String actualName = superhelt.getName();

        assertEquals(expectedName, actualName);


    }

    @org.junit.jupiter.api.Test
    void ændreVirkeligeNavn() {
        String expectedName = "Tony Hawk";
        db.ændreVirkeligeNavn("Ironman", "Tony Hawk");
        String actualName = superhelt.getRealName();

        assertEquals(expectedName, actualName);
    }

    @org.junit.jupiter.api.Test
    void ændreSuperkraft() {
        String expectedName = "Penge";
        db.ændreSuperkraft("Ironman", "Penge");
        String actualName = superhelt.getSuperPower();

        assertEquals(expectedName, actualName);
    }



    @org.junit.jupiter.api.Test
    void ændreÅrSkabt() {
        int expectedYear = 100;
        db.ændreÅrSkabt("Ironman", 100);
        int actualYear = superhelt.getYearCreated();
        assertEquals(expectedYear, actualYear);
    }

    @org.junit.jupiter.api.Test
    void ændreErMenneske() {
        String expectedAnswer = "nej";
        db.ændreErMenneske("Ironman", "nej");
        String actualAnswer = superhelt.getIsHuman();
        assertEquals(expectedAnswer, actualAnswer);
    }

    @org.junit.jupiter.api.Test
    void ændreStyrkeNiveau() {
        String expectedStrength = "1";
        db.ændreStyrkeNiveau("Ironman", "1");
        String actualStrength = superhelt.getStrength();
        assertEquals(expectedStrength, actualStrength);
    }

}