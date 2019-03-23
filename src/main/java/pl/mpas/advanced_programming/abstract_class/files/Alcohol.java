package pl.mpas.advanced_programming.abstract_class.files;

public class Alcohol {
    private String brand;
    private String type;
    private int voltage;
    private double price;
    private boolean isTasty;

    public Alcohol(String brand, String type, int voltage, double price, boolean isTasty) {
        this.brand = brand;
        this.type = type;
        this.voltage = voltage;
        this.price = price;
        this.isTasty = isTasty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isTasty() {
        return isTasty;
    }

    public void setTasty(boolean tasty) {
        isTasty = tasty;
    }
}
