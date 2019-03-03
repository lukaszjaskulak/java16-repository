package pl.mpas.advanced_programming.abstract_class.generics.carExercise;

public class Plane extends Vehicle {

    private String brand;

    public Plane(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Plane " +
                "brand = " + brand;
    }

}
