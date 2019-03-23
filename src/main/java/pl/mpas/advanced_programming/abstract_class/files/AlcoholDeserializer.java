package pl.mpas.advanced_programming.abstract_class.files;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class AlcoholDeserializer implements Closeable {

    private String filePath;
    private BufferedReader fileReader;

    public AlcoholDeserializer(String filePath) throws FileNotFoundException {
        this.filePath = Objects.requireNonNull(filePath, " Path cannot be null");

        fileReader = new BufferedReader(new FileReader(filePath));
    }



    public List<Alcohol> readAlco () throws IOException {
        return readAlcoholsJava7();
    }

    public List<Alcohol> readAlcoholJava8() throws IOException{


        final int brandIndex = 0;
        final int typeIndex = 1;
        final int voltageIndex = 2;
        final int priceIndex = 3;
        final int isTastyIndex = 4;
        return fileReader.lines()
                .filter(line -> line.length() > 0)
                .map(s -> s.split(" +"))
                .map(o -> {
                    String voltageWithProc = o[voltageIndex];
                    String patternToCut = "%";
                    voltageWithProc.substring(0, voltageWithProc.length() - patternToCut.length());
                    int voltage = Integer.parseInt(voltageWithProc);
                    return new Alcohol(o[brandIndex],
                                        o[typeIndex],
                                        voltage,
                                        Double.parseDouble(o[priceIndex]),
                                        Boolean.parseBoolean(o[isTastyIndex]));
                })
                .collect(Collectors.toList());

    }

    private List<Alcohol> readAlcoholsJava7() throws IOException {
        List <Alcohol> result = new ArrayList<>();
        String line = null;

        while ((line = fileReader.readLine()) != null ) {
            Scanner scanner = new Scanner(line);
             String brand = scanner.next();
             String type = scanner.next();
             String voltageWithProc = scanner.next();
             String patternToCut = "%";
             voltageWithProc.substring(0, voltageWithProc.length() - patternToCut.length());
             int voltage = Integer.parseInt(voltageWithProc);
             double price = scanner.nextDouble();
             boolean isTasty = scanner.nextBoolean();

             result.add(new Alcohol(brand, type, voltage, price, isTasty));
        }
        return result;
    }

    @Override
    public void close() throws IOException {
        fileReader.close();
    }
}
