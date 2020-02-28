package com.epam.composite;

import java.util.ArrayList;
import java.util.List;

public class State extends AdministrativeUnit implements Democracy {
    private String name;
    private List<State> states = new ArrayList<>();

    public State(){}

    public State(String name) {
        this.name = name;
    }

    private List<AdministrativeUnit> administrativeUnits = new ArrayList<>();

    @Override
    public void setLaw() {
        System.out.println("I set the Constitution law for " + name);
    }

    public void addUnit(State state){
        administrativeUnits.add(state);
    }

    public void removeUnit(State state){
        administrativeUnits.remove(state);
    }

    public List<AdministrativeUnit> getAdministrativeUnits() {
        return administrativeUnits;
    }

    public void setAdministrativeUnits(List<AdministrativeUnit> administrativeUnits) {
        this.administrativeUnits = administrativeUnits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "com.epam.composite.State{" +
                "name='" + name + '\'' +
                '}';
    }
}
