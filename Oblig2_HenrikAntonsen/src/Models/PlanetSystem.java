package Models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlanetSystem {
    private String name;
    private String centerStar;
    private ArrayList<PlanetSystem> planets;

    public PlanetSystem(String name, String centerStar, ArrayList<PlanetSystem> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public PlanetSystem() {

    }


    // Gettere og settere:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(String centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<PlanetSystem> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<PlanetSystem> planets) {
        this.planets = planets;
    }

    // toString()
    @Override
    public String toString() {
        return getName() + " is a solar system, and its center star is called " + getCenterStar() + ". This solar system contains the following planets: " + getPlanets() + ".";
    }
}
