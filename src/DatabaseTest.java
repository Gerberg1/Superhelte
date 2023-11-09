import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    @Test
    public void testAddSuperhero() {
        Database database = new Database();

        // Tilføjelse af ny superhelt
        database.addSuperhero("Superman", "Clark Kent", "Super stærk", 1938, "Ja", "20");

        // Assert, at Superhero-objektet er blevet tilføjet til databasen
        Superhero superhero = database.showASuperhero("Superman");
        assertEquals("Superman", superhero.getName());
        assertEquals("Clark Kent", superhero.getRealName());
        assertEquals("Super stærk", superhero.getSuperPower());
        assertEquals(1938, superhero.getYearCreated());
        assertEquals("Ja", superhero.getIsHuman());
        assertEquals("20", superhero.getStrength());
    }
}
