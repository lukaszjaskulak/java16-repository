package pl.mpas.advanced_programming.abstract_class.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class AlcoholExample {
    public static void main(String[] args) throws FileNotFoundException {



        List<Alcohol> alcohols = Arrays.asList(
                new Alcohol("Belvedere", "vodka", 40, 39.90, true),
                new Alcohol("Tyskie", "Beer", 5, 2.90, false),
                new Alcohol("Johnie Walker", "whisky", 40, 30, false),
                new Alcohol("Książęce", "Beer", 5, 3.10, true),
                new Alcohol("Smirnoff", "Vodka", 40, 40, false)
        );




        String filePath = "alco.txt";

        try (AlcoholSerializer serializer = new AlcoholSerializer(filePath)) {
            serializer.serializeAlcohols(alcohols);
        } catch (Exception exc) {

        }

        String fileToRead = "alco.txt";
        try (AlcoholDeserializer deserializer = new AlcoholDeserializer(fileToRead)){
            System.out.println(deserializer.readAlco());

        }
        catch (Exception exc) {}
    }

}
