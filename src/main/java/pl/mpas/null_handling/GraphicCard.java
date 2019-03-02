package pl.mpas.null_handling;

public class GraphicCard {
    private Chipset chipset;

    public GraphicCard(Chipset chipset) {
        this.chipset = chipset;
    }

    public Chipset getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "chipset=" + chipset +
                '}';
    }
}

