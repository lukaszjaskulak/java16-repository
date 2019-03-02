package pl.mpas.advanced_programming.abstract_class.null_handling_optional;

import pl.mpas.null_handling.Chipset;

import java.util.Optional;

public class GraphicCard {
    private Chipset chipset;

    public GraphicCard(Chipset chipset) {
        this.chipset = chipset;
    }

    public Optional <Chipset> getChipset()
    {
        return Optional.ofNullable(chipset);
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "chipset=" + chipset +
                '}';
    }
}

