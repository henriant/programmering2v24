package no.hiof.henriant.oblig4.models;

public abstract class CelestialBody implements Comparable<CelestialBody>{
    public String name;
    public double radius;
    public double mass;

    // Konstanter for astronomiske enheter til "vanlige" enheter
    public static final double MJUP_IN_KG = 1.898E27;
    public static final double RJUP_IN_KM = 71492;
    public static final double MSUN_IN_KG = 1.98892E30;
    public static final double RSUN_IN_KM = 695700;
    public static final double MEARTH_IN_KG = 5.972E24;
    public static final double REARTH_IN_KM = 6371;

    public CelestialBody(String name, double mass, double radius) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    // Abstrakte metoder som overrides i Planet og Star
    public abstract double radiusInKm();


    public abstract double massInKg();


    public double radiusInRearth() {
        return radiusInKm()/ REARTH_IN_KM;
    }

    public double massInMearth() {
        return massInKg()/MEARTH_IN_KG;
    }

    // --------------------------------------------------

    public double getSurfaceGravity() {
        return (6.67408E-11 * massInKg()) / Math.pow(radiusInKm()*1000, 2);
    }
    // Getters og setters
    public void setName(String name) {
        this.name = name;
    }

    public String getPlanetName() {
        return name;
    }


    public String getName(String name) {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    // Overrider compareTo-metoden for å sortere alle CelestialBody etter størrelse på radius
    @Override
    public int compareTo(CelestialBody otherCelestialBody) {
        return Double.compare(this.radius, otherCelestialBody.radius);
    }

    // Overrider toString for å skrive ut navn og radius for hver CelestialBody
    @Override
    public String toString() {
        return "--Celestial Body--" +
                "\nName: " + name
                + "\nRadius: " + radius;
    }

}
