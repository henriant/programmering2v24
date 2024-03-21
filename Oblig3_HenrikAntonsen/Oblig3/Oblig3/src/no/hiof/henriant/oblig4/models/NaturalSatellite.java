package no.hiof.henriant.oblig4.models;

public abstract class NaturalSatellite extends CelestialBody{
    public int semiMajorAxis;
    public double eccentricity;
    public double orbitalPeriod;
    public String centralCelestialBody;

    // Static final verdi for 1AU i km
    public static final double AU_IN_KM = 149597871;



    public NaturalSatellite(String name, double radius, double mass, int semiMajorAxis, double eccentricity, double orbitalPeriod, String centralCelestialBody) {
        super(name,radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;


    }

    // Metode for å regne ut avstand mellom objekt og naturlig sattelitt
    // Vil legge til at jeg ble nødt til å få hjelp av ChatGPT her for å forstå hvordan jeg kunne
    // innføre det matematiske sånn kodemessig.
    public double distanceToCentralBody(double r, double a, double e, double degrees){
        double thetaRadians = Math.toRadians(degrees);
        double distance = (a * r * (1 - Math.pow(e, 2))) / (1 + e * Math.cos(thetaRadians));
        return distance * AU_IN_KM;
    }


    // Metode for å regne ut hastigheten til en natural satellite
    public double orbitingVelocity(double G, double M, double r){
        double velocity = Math.sqrt(G * M / r);
        return velocity / 1000;
    }

    // Getters and setters
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(int semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(String centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }

    @Override
    public double radiusInKm() {
        return 0;
    }

    @Override
    public double massInKg() {
        return 0;
    }
}
