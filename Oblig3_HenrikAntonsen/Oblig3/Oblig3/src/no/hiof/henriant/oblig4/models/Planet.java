package no.hiof.henriant.oblig4.models;

public class Planet extends NaturalSatellite{

    public Planet(String name, double radius, double mass, int semiMajorAxis, double eccentricity, double orbitalPeriod, String centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    // Override av radiusInKm og massInKg metodene:
    @Override
    public double radiusInKm() {
        return radius * RJUP_IN_KM;
    }

    @Override
    public double massInKg() {
        return mass * MJUP_IN_KG;
    }

    @Override
    public String toString() {
        return "The planet " + name + " has a radius of " + radius +
                " Rjup, and a mass of " + mass + " Mjup.";
    }


}
