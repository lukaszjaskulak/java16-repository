package pl.mpas.null_handling;

public class Chipset {

    private String vendorName;


    public static String getVendorName() {
        return vendorName;
    }

    public Chipset(String vendorName) {
        this.vendorName = vendorName;
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }
}

