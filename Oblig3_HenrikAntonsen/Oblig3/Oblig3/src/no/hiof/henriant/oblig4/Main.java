package no.hiof.henriant.oblig4;

import no.hiof.henriant.oblig4.models.Planet;
import no.hiof.henriant.oblig4.models.PlanetSystem;
import no.hiof.henriant.oblig4.models.Star;
import no.hiof.henriant.oblig4.interfaces.ObjectFileHandler;
import no.hiof.henriant.oblig4.tools.StarCSVFileHandler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Oppretter Star-objektet som representerer solsystemets sol
        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        // Oppretter en rekke med planet-objekter
        // NB! Noen av tallene i semiMajorAxis er ikke nøyaktige, da de fikk erroren "too large".
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 57910000, 0.205630, 115.88, "Sun");
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 108200000, 0.007, 225, "Sun");
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 149598023, 0.017, 365, "Sun");
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 228000000, 0.934, 687, "Sun");
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 778000000, 0.0484, 4300, "Sun");
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 1433530000, 0.0565, 10756, "Sun");
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 29000000, 0.0472, 30687, "Sun");
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 28000000, 0.0086, 60190, "Sun");

        // Legger til planet-objektene i en arrayliste
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        // Oppretter planetsystemet "Solar system"
        PlanetSystem planetSystem = new PlanetSystem("Solar system", sun, planets);

/*
        // Bruk av metode for å regne ut distanceToCentralBody for Earth:
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 0) + "km to the Sun at 0 degrees.");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 90) + "km to the Sun at 90 degrees.");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 180) + "km to the Sun at 180 degrees.");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 270) + "km to the Sun at 270 degrees.");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 360) + "km to the Sun at 360 degrees.");
        // Jeg tror matematikken min er feil da jeg ikke får samme svar som i oppgaveteksten.

        System.out.println();
        // Bruk av metode for å regne ut orbitingVelocity til Earth:
        System.out.println("At a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 0) + ", Earth has a velocity of " + earth.orbitingVelocity(6.67408E-11, 1.99 * Math.pow(10, 30), earth.distanceToCentralBody(1, 149598023, 0.017, 0)) + " m/s.");
        System.out.println("At a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 90) + ", Earth has a velocity of " + earth.orbitingVelocity(6.67408E-11, 1.99 * Math.pow(10, 30), earth.distanceToCentralBody(1, 149598023, 0.017, 90)) + " m/s.");
        System.out.println("At a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 180) + ", Earth has a velocity of " + earth.orbitingVelocity(6.67408E-11, 1.99 * Math.pow(10, 30), earth.distanceToCentralBody(1, 149598023, 0.017, 180)) + " m/s.");
        System.out.println("At a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 270) + ", Earth has a velocity of " + earth.orbitingVelocity(6.67408E-11, 1.99 * Math.pow(10, 30), earth.distanceToCentralBody(1, 149598023, 0.017, 270)) + " m/s.");
        System.out.println("At a distance of " + earth.distanceToCentralBody(1, 149598023, 0.017, 360) + ", Earth has a velocity of " + earth.orbitingVelocity(6.67408E-11, 1.99 * Math.pow(10, 30), earth.distanceToCentralBody(1, 149598023, 0.017, 360)) + " m/s.");
        // Hver av disse ga under 1m/s som svar, noe som ÅPENBART er feil. Igjen, her er det fullt mulig at det er matematikken min som ikke er riktig.

 */

        // Bruk av metoder for sortering

        System.out.println(mars.compareTo(earth));

        StarCSVFileHandler starCSVFileHandler = new StarCSVFileHandler();
        starCSVFileHandler.writeObjectsToFile("StarInformation.txt", sun);
        starCSVFileHandler.readObjectsFromFile("StarInformation.txt");

        /* -----KOMMENTAR ------
        Koden min kjører uten noen error, men den gjør ikke som forventet.

        Metoden for å sortere listen med planeter fungerte ikke. Tanken bak var å sortere de i alfabetisk rekkefølge. Jeg tror jeg endte opp med en metode som sammenligner to planeter opp mot hverandre?
        Utskriften blir -1 og jeg har ikke helt skjønt hvorfor. Metoden er iallfall ikke korrekt.

        Metoden writeObjectsToFile() som jeg har overridet i StarCSVFileHandler
        skriver ingenting til den valgte tekstfilen. I metoden for readObjectFromFile() har jeg prøvd å gjøre den så lik som den vi brukte i forelesning, uten hell.
        Jeg er ikke helt sikker på hvor problemet ligger, og jeg er derfor ikke i stand til å fikse det. Google og chatGPT har heller ikke vært noe særlig hjelp.
         */
    }
}
