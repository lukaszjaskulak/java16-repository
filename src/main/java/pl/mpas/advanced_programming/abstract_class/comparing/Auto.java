package pl.mpas.advanced_programming.abstract_class.comparing;

public class Auto implements Comparable<Auto> {

    private String brand;
    private String model;
    private String color;
    private double capacity;


    public Auto(String brand, String model, String color, double capacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;

    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand = " + brand +
                ", model = " + model +
                ", color = " + color +
                ", capacity = " + capacity +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getCapacity() {
        return capacity;
    }



    @Override
    public int compareTo(Auto o) {
        return (int) (this.capacity - o.capacity);
    }
    public int compareByBrand(Auto o){
        return this.brand.charAt(0) - o.brand.charAt(0);
    }

    public void maybeComparing(Comparable<Auto> comparable) {
        System.out.println("Inside maybeCOmparing()");
        System.out.println(comparable.compareTo(this));
    }



}
