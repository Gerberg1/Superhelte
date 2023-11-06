import java.util.Comparator;

public class YearCreatedComparator implements Comparator <Superhero> {
    @Override
    public int compare (Superhero s1, Superhero s2) {
        return Integer.compare(s1.getYearCreated(),s2.getYearCreated());
    }
}
