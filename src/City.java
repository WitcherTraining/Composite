import java.util.ArrayList;
import java.util.List;

public class City extends District implements Democracy {
    private String name;
    private Integer population;
    private Integer telephoneCode;
    private String akimSurname;
    private List<City> cities = new ArrayList<>();

    public City(String name, Integer population, Integer telephoneCode, String akimSurname) {
        this.name = name;
        this.population = population;
        this.telephoneCode = telephoneCode;
        this.akimSurname = akimSurname;
    }

    public City() {
    }

    @Override
    public void setLaw() {
        System.out.println("Our regionalLaw are city rules and established by " + name + " Akimat");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getPopulation() {
        return population;
    }

    @Override
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public Integer getTelephoneCode() {
        return telephoneCode;
    }

    @Override
    public void setTelephoneCode(Integer telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    public String getAkimSurname() {
        return akimSurname;
    }

    public void setAkimSurname(String akimSurname) {
        this.akimSurname = akimSurname;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", telephoneCode=" + telephoneCode +
                ", akimSurname='" + akimSurname + '\'' +
                '}';
    }
}
