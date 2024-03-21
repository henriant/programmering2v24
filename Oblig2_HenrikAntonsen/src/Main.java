import Models.Planet;
import Models.PlanetSystem;
import Models.Star;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

/*  Her prøvde jeg å opprette et objekt kalt solarSystem for å lagre alle planetene. Deretter en ArrayList planetList
    som skulle være solarSystem sin siste parameter. Denne skulle lagre navnet til alle planetene i solsystemet.
    Det fungerer forsåvidt, men i utskriften til solarSystem ramser den opp alle toString()ene til hver eneste planet, fremfor bare navnene.
    Jeg har prøvd å bruke getName() i parentesene, men det tillater den ikke. Hva burde jeg gjort her?
*/
        ArrayList<PlanetSystem> planetList= new ArrayList<>();
        PlanetSystem solarSystem = new PlanetSystem("Solar System", "The Sun", planetList);

        Planet mercury = new Planet("Mercury", 0.03412549655905556,1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);
        Star sun = new Star("The Sun", 1.0, 1.0, 5777);


        planetList.add(mercury);
        planetList.add(venus);
        planetList.add(earth);
        planetList.add(mars);
        planetList.add(jupiter);
        planetList.add(saturn);
        planetList.add(uranus);
        planetList.add(neptune);


        //toString():
        System.out.println(mercury);
        System.out.println(earth);
        System.out.println(jupiter);
        System.out.println(sun);
        System.out.println(solarSystem);


        // Radius til km og masse til kg
        System.out.println();
        System.out.println("------ Radius in km and mass in kg ------");
        System.out.println("Saturn radius: " + saturn.getPlanetRadiusToKm() + " km");
        System.out.println("Saturn mass: " + saturn.getPlanetMassToKg() + " kg");
        System.out.println("Sun radius: " + sun.getStarRadiusInKm() + " km");
        System.out.println("Sun mass: " + sun.getStarMassInKg() + " kg");

        // Regn ut overflategravitasjon
        System.out.println();
        System.out.println("------ Surface gravity in m/s^2 ------");
        System.out.println("Neptune: " + neptune.getSurfaceGravity() + " m/s^2");

    }




}
