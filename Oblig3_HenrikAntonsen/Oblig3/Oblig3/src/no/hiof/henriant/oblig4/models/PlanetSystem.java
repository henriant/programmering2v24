package no.hiof.henriant.oblig4.models;

import java.util.ArrayList;
import java.util.List;

public class PlanetSystem implements Comparable<PlanetSystem>{
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets;
    private final List<CelestialBody> planetList;

    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
        this.planetList = new ArrayList<>();
    }

    // Metode for å legge til en planet i planetList
    public void addPlanet(CelestialBody planet){
    planetList.add(planet);
    }


    // Metode for å iterere gjennom planetList for å finne en planet med samme navn som
    // navnet vi sender inn i metoden. Dersom den finner samme planet, returnerer den navnet
    // Dersom den ikke finner noe, returnerer den null.
    public CelestialBody getPlanetByName(String planetName) {
        for (CelestialBody planet : planetList) {
            if (planet.getName(name).equals(planetName)) {
                return planet;
            }
        }
        return null;
    }

    public Planet getBiggestPlanet() {
        Planet biggestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() > biggestPlanet.getRadius()) {
                biggestPlanet = planet;
            }
            else if (planet.getRadius() == biggestPlanet.getRadius() &&
            planet.getMass() > biggestPlanet.getMass()) {
                biggestPlanet = planet;
            }
        }
        return biggestPlanet;
    }

    public Planet getSmallestPlanet() {
        Planet smallestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = planet;
            }
            else if (planet.getRadius() == smallestPlanet.getRadius() &&
                    planet.getMass() < smallestPlanet.getMass()) {
                smallestPlanet = planet;
            }
        }
        return smallestPlanet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    @Override
    public int compareTo(PlanetSystem otherPlanetSystem) {
        return this.name.compareTo(otherPlanetSystem.name);
    }

    @Override
    public String toString() {
        return "--Planet System--"
                +"\nName: " + name;
    }
}
