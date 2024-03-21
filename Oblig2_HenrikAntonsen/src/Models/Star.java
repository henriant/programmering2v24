package Models;

public class Star {
    private String name;
    private Double radius;
    private Double mass;
    private int effectiveTemp;

    // Konstruktør
    public Star(String name, Double radius, Double mass, int effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
    }

    // Gettere og settere
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    //toString()
    @Override
    public String toString(){
        return getName() + " is a star with a radius of " + getRadius() + " and a mass of " + getMass() + ". The stars effective temperature is " + getEffectiveTemp() + ".";
    }

    // Metoder for å konvertere radius til km og masse til kg
    public double getStarRadiusInKm(){
        return radius * 695700;
    }

    public double getStarMassInKg() {
        return mass * 1.98892E30;
    }
}
