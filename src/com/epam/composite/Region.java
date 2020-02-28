package com.epam.composite;

import java.util.ArrayList;
import java.util.List;

public class Region extends State implements Democracy {
    private String name;
    private Integer population;
    private List<Region> regionUnits = new ArrayList<>();

    public void addUnit(Region region) {
        regionUnits.add(region);
    }

    public void removeUnit(Region region) {
        regionUnits.remove(region);
    }

    public Region() {
    }

    public Region(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public void setLaw() {
        System.out.println("Our regionalLaw are regional rules and established by " + name + " Akimat");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<Region> getRegionUnits() {
        return regionUnits;
    }

    public void setRegionUnits(List<Region> regionUnits) {
        this.regionUnits = regionUnits;
    }

    @Override
    public String toString() {
        return "com.epam.composite.Region{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
