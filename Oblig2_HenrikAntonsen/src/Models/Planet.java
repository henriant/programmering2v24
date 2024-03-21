package Models;


// Jeg slet med å fylle opp ArrayListen for solsystem med planeter, og prøvde derfor å gjøre Planet til en barneklasse av PlanetSystem
// Det løste problemet foreløpig men jeg vet allikevel ikke om det er tillatt eller meningen i denne oppgaven
public class Planet extends PlanetSystem{
    private String name;
    private Double radius;
    private Double mass;


    //Konstruktør
    public Planet(String name, Double radius, Double mass) {
        super();
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }


    // Gettere og settere:
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

    // toString()
    @Override
    public String toString(){
        return getName() + " is a planet with a radius of " + getRadius() + " and a mass of " + getMass() + ".";
    }

    // Metoder for å konvertere radius til km og masse til kg
    public double getPlanetRadiusToKm(){
        return radius * 71492;
    }

    public double getPlanetMassToKg(){
        return mass * 1.898E27;
    }

    // Metode for å regne ut overflategravitasjon
    public double getSurfaceGravity(){
        double G = 0.0000000000667408;
        double R = getPlanetRadiusToKm() * 1000; // Konverterer km til meter
        double M = getPlanetMassToKg();
        G = (G * M) / (R * R);
        return G;
    }
}
