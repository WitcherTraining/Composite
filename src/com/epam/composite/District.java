package com.epam.composite;

import com.epam.composite.comparators.DistrictsComparator;

import java.util.ArrayList;
import java.util.List;

public class District extends Region implements Democracy {
    private String name;
    private Integer population;
    private Integer telephoneCode;
    private List<District> districts = new ArrayList<>();

    public District() {
    }

    public District(String name, Integer population, Integer telephoneCode) {
        this.name = name;
        this.population = population;
        this.telephoneCode = telephoneCode;
    }

    @Override
    public void setLaw() {
        System.out.println("Our regionalLaw are district rules and established by " + name + " Akimat");
    }

    public static List<District> quickSort(List<District> list) {
        if (list.size() <= 1)
            return list;

        DistrictsComparator comparator = new DistrictsComparator();

        List<District> sorted = new ArrayList<District>();
        List<District> lesser = new ArrayList<>();
        List<District> greater = new ArrayList<>();
        District pivot = list.get(list.size() - 1);
        for (int i = 0; i < list.size() - 1; i++) {
            if (comparator.compare(list.get(i), pivot) < 0)
                lesser.add(list.get(i));
            else
                greater.add(list.get(i));
        }

        lesser = quickSort(lesser);
        greater = quickSort(greater);

        lesser.add(pivot);
        lesser.addAll(greater);
        sorted = lesser;

        return sorted;
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

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(Integer telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "com.epam.composite.District{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", telephoneCode=" + telephoneCode +
                ", akimSurname='" + '\'' +
                '}';
    }
}
