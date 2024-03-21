package no.hiof.henriant.oblig4.models;

public class Star extends CelestialBody{
    private int effectiveTemp;


    // Override av radiusInKm og massInKg metodene:
    @Override
    public double radiusInKm() {
        return radius * RSUN_IN_KM;
    }

    @Override
    public double massInKg() {
        return mass * MSUN_IN_KG;
    }

    public Star(String name, double radius, double mass, int effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11 * massInKg()) / Math.pow(radiusInKm()*1000, 2);
    }

    @Override
    public String toString() {
        return "The star " + name + " has a radius of " + radius +
                " Rsun, and a mass of " + mass + " Msun. It's effective temperature is " +
                effectiveTemp + " kelvin.";
    }

    public String getName() {
        return name;
    }



    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public int compareTo(CelestialBody o) {
        return 0;
    }
}
