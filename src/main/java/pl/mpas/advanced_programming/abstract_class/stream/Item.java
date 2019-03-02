package pl.mpas.advanced_programming.abstract_class.stream;

import java.math.BigDecimal;
import java.util.List;

public class Item {

    private String name;
    private BigDecimal price;
    private List<Ingredients> ingredientsList;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public Item(String name, BigDecimal price, List<Ingredients> ingredientsList) {
        this.name = name;
        this.price = price;
        this.ingredientsList = ingredientsList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredientsList=" + ingredientsList +
                '}';
    }
}
