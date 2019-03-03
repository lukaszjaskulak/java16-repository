package pl.mpas.advanced_programming.abstract_class.generics.carExercise;

public class Car extends Vehicle {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car " +
                "brand = " + brand;
    }
}
