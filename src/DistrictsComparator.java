import java.util.Comparator;

public class DistrictsComparator implements Comparator<District> {
    @Override
    public int compare(District o1, District o2) {
        return o1.getTelephoneCode().compareTo(o2.getTelephoneCode());
    }
}
