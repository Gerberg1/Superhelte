import java.util.Comparator;

public class StrengthComparator implements Comparator <Superhero> {
    @Override
    public int compare (Superhero s1, Superhero s2) {
        return s1.getStrength().compareTo(s2.getStrength());
    }
}
