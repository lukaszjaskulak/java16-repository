package pl.mpas.advanced_programming.abstract_class.null_handling_optional;

public class Computer {
    private GraphicCard graphicCard;



    public Computer(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }


    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicCard=" + graphicCard +
                '}';
    }
}
