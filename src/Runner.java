import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        State kazakhstan = new State("Kazakhstan");

        Region karagandaRegion = new Region("Karaganda region", 700000);
        Region westKazakhstan = new Region("West Kazakhstan", 500000);
        Region eastKazakhstan = new Region("East Kazakhstan", 400000);
        Region allRegions = new Region();

        District ulytau = new District("Ulytau district", 110000, 71035);
        District nura = new District("Nura district", 180000, 72144);
        District karkaralinsk = new District("Karkaraly district", 170000, 7213);
        District allDistricts = new District();

        City temirtau = new City("Temirtau", 50000, 7213, "Abdygaliuly");
        City almaty = new City("Almaty", 1800000, 727, "Shalmagambetov");
        City shymkent = new City("Temirtau", 10031000, 7252, "Dusetaev");
        City karagandaCity = new City("Karaganda", 700000, 7212, "Abishev");
        City allCities = new City();

        // Объявление коллекций для сортировки
        List<State> stateList = kazakhstan.getStates();
        List<Region> regions = allRegions.getRegionUnits();
        List<District> districts = allDistricts.getDistricts();
        List<City> cities = allCities.getCities();

        stateList.add(kazakhstan);
        stateList.add(karagandaRegion);
        stateList.add(eastKazakhstan);
        stateList.add(ulytau);
        stateList.add(karkaralinsk);
        stateList.add(almaty);
        stateList.add(shymkent);

        Comparator<State> stateComparator = new Comparator<State>() {
            @Override
            public int compare(State o1, State o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // сортировка через объявление компаратора в анонимном классе
        Collections.sort(stateList, stateComparator);

        regions.add(karagandaRegion);
        regions.add(eastKazakhstan);
        regions.add(westKazakhstan);
        regions.add(ulytau);
        regions.add(nura);
        regions.add(almaty);
        regions.add(karagandaCity);

        // сортировка через объявление компаратор в лямбде
        Comparator<Region> regionComparator = Comparator.comparing(obj -> obj.getPopulation());
        regions.sort(regionComparator);

        districts.add(karkaralinsk);
        districts.add(nura);
        districts.add(ulytau);
        districts.add(shymkent);
        districts.add(karagandaCity);
        districts.add(temirtau);

        // сортировка через статический метод, реализующий quickSort
        List<District> sortedByQuickSort = District.quickSort(districts);

        // Добавление объектов в компоновщик
        AdministrativeUnit regionUnits = new AdministrativeUnit();
        regionUnits.addUnit(karagandaRegion);
        regionUnits.addUnit(westKazakhstan);
        regionUnits.addUnit(eastKazakhstan);

        AdministrativeUnit districtUnits = new AdministrativeUnit();
        districtUnits.addUnit(ulytau);
        districtUnits.addUnit(nura);
        districtUnits.addUnit(karkaralinsk);

        AdministrativeUnit cityUnits = new AdministrativeUnit();
        cityUnits.addUnit(temirtau);
        cityUnits.addUnit(almaty);
        cityUnits.addUnit(shymkent);
        cityUnits.addUnit(karagandaCity);

        AdministrativeUnit allUnits = new AdministrativeUnit();
        allUnits.addUnit(kazakhstan);
        allUnits.addUnit(regionUnits);
        allUnits.addUnit(districtUnits);
        allUnits.addUnit(cityUnits);

        allUnits.setLaw();
    }
}
