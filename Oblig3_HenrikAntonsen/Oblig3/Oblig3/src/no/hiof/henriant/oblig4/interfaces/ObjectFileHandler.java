package no.hiof.henriant.oblig4.interfaces;

import no.hiof.henriant.oblig4.models.Star;

public interface ObjectFileHandler <T>{
    void writeObjectsToFile(String fileName, T t);

    String readObjectsFromFile(String fileName);

}
