package pl.mpas.advanced_programming.abstract_class;

import java.util.ArrayList;
import java.util.List;

public class Auto {

    String brand;
    String model;
    String color;
    double capacity;

    public Auto(String brand, String model, String color, double capacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
    }

    List<Auto> cars = new ArrayList<>();

}
