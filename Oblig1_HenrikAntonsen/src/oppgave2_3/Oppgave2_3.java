package oppgave2_3;

public class Oppgave2_3 {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Mars", 3889, "6.39E23 kg");
        Planet planet2 = new Planet("Neptun", 24622, "1,024E26 kg");

        System.out.println("Planeten " + planet1.getPlanetName() + " har en radius på " + planet1.getPlanetRadius()
                + " km og en masse på " + planet1.getPlanetMass() + ".");
        System.out.println();
        System.out.println("Planeten " + planet2.getPlanetName() + " har en radius på " + planet2.getPlanetRadius()
                + " km og en masse på " + planet2.getPlanetMass() + ".");
    }
}
