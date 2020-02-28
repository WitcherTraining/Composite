import java.util.ArrayList;
import java.util.List;

public class AdministrativeUnit implements Democracy {
    private List<AdministrativeUnit> administrativeUnits = new ArrayList<>();

    @Override
    public void setLaw() {
        for (Democracy state : administrativeUnits) {
            state.setLaw();
        }
    }

    public void addUnit(AdministrativeUnit unit) {
        administrativeUnits.add(unit);
    }

    public void removeUnit(AdministrativeUnit unit) {
        administrativeUnits.remove(unit);
    }

    public List<AdministrativeUnit> getAdministrativeUnits() {
        return administrativeUnits;
    }
}
