package pl.mpas.null_handling;

import java.util.Optional;

public class Example {

    private static GraphicCard maybeCard;

    public static void main(String[] args) {

        Computer fullOne = new Computer(new GraphicCard(new Chipset("nVidia")));
        Computer nofullGrap = new Computer(new GraphicCard(new Chipset(null)));
        Computer nofullComputer = new Computer(new GraphicCard(null));
        Computer onComputer = new Computer(null);
        Computer maybeComputer = null;


        Optional <String> maybeMyName = Optional.ofNullable(null);

        if (maybeMyName.isPresent()) {
            System.out.println(maybeMyName.get());
        }

        maybeMyName.ifPresent(s -> System.out.println(s));
        maybeMyName.ifPresent(System.out::println);
    }




    public static String getVendorNameSuperNativeImpl(Computer computer){
        return computer.getGraphicCard().getChipset().getVendorName();
    }

    public static String getVendorNameSaveImpl(Computer computer) {
        String result = "unknown";
        if (computer != null) {
            GraphicCard graphicCard = computer.getGraphicCard();
            if (maybeCard != null) {
                Chipset maybeChipset = maybeCard.getChipset();
                if (maybeChipset != null) {
                    String maybeVendorName = maybeChipset.getVendorName();
                    if (maybeVendorName != null) {
                        result = maybeVendorName;
                    }
                }
            }}


        return result;
    }

        public static Optional<String> getVendorNameJava8Way (Computer computer){
            Optional.ofNullable(computer)
                    .map(computer1 -> computer1.getGraphicCard())
                    .map(graphicCard -> graphicCard.getChipset())
                    .map(chipset -> chipset.getVendorName());


        }


        public static Optional<String> getVendorNameJava8WayS (Computer computer){
            Optional.ofNullable(computer)
                    .map(Computer::getGraphicCard)
                    .map(GraphicCard::getChipset)
                    .map(Chipset::getVendorName);

        }

    }