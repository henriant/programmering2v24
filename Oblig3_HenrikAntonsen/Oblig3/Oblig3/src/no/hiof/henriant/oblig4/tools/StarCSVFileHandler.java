package no.hiof.henriant.oblig4.tools;

import no.hiof.henriant.oblig4.interfaces.ObjectFileHandler;
import no.hiof.henriant.oblig4.models.Star;

import java.io.*;

public class StarCSVFileHandler implements ObjectFileHandler<Star> {


    // Metode for å skrive informasjon om en Star til en tekstfil
    @Override
    public void writeObjectsToFile(String fileName, Star star) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(star.getName() + "," + star.getMass() + "," + star.getRadius() + ", " + star.getEffectiveTemp());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Metode for å lese string fra en tekstfil
    @Override
    public String readObjectsFromFile(String fileName) {

        String textContent = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ( (line = bufferedReader.readLine()) != null) {
                textContent += line + "\n";
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return textContent;
    }

}
