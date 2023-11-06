import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    File f = new File("SuperheroDatabase.txt");


    public void saveSuperheroes(ArrayList<Superhero> a) {

        PrintStream output = null;
        try {
            output = new PrintStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Superhero s : a) {
            output.println(s.getName().replace(' ', '@') + "," +
                    s.getRealName().replace(' ', '@') + "," +
                    s.getSuperPower().replace(' ', '@') + "," +
                    s.getYearCreated() + "," +
                    s.getIsHuman().replace(' ', '@') + "," +
                    s.getStrength().replace(' ', '@'));
        }
        output.close();
    }


    public void tilføjGemteHelte (ArrayList<Superhero> a) {

        Scanner sc = null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNext()) {
            String linje = sc.next();
            String[] attributter = linje.replace('@', ' ').split(",");

            int yearCreated = Integer.parseInt(attributter[3]);
            a.add(new Superhero(attributter[0], attributter[1], attributter[2], yearCreated, attributter[4], attributter[5]));
        }

    }
}

