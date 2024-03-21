package oppgave2_3;

public class Planet{
    private String planetName;
    public String getPlanetName(){
        return planetName;
    }
    private int planetRadius;
    public int getPlanetRadius(){
        return planetRadius;
    }
    private String planetMass;
    public String getPlanetMass(){
        return planetMass;
    }

    public Planet(String planetName, Integer planetRadius, String planetMass ){
        this.planetName = planetName;
        this.planetRadius = planetRadius;
        this.planetMass = planetMass;
    }
}
