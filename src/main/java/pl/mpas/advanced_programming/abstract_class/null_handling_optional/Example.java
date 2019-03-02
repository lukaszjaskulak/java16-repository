package pl.mpas.advanced_programming.abstract_class.null_handling_optional;

import pl.mpas.null_handling.Chipset;

import java.util.Optional;

public class Example {

    private static GraphicCard maybeCard;

    public static void main(String[] args) {

        Computer fullOne = new Computer(new GraphicCard(new Chipset("nVidia")));
        Computer nofullGrap = new Computer(new GraphicCard(new Chipset(null)));
        Computer nofullComputer = new Computer(new GraphicCard(null));
        Computer onComputer = new Computer(null);
        Computer maybeComputer = null;

    }

//    public static String getVendorNameJava8Way(Computer computer) {
//
//       return Optional.ofNullable(computer)
//                .map(Computer::getGraphicCard)
//                .map(GraphicCard::getChipset)
//                .orElseGet(() -> "brak");
//
//    }


    }