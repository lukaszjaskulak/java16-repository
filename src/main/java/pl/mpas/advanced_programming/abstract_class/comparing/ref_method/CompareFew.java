package pl.mpas.advanced_programming.abstract_class.comparing.ref_method;

import pl.mpas.advanced_programming.abstract_class.comparing.Auto;


public class CompareFew {


    public static int sortAdvanced(Auto car1, Auto car2) {
        if (car1.getBrand().compareTo(car2.getBrand()) == 0) {
            if (car1.getModel().compareTo(car2.getModel()) == 0) {
                return car1.getColor().compareTo(car2.getColor());

            }
        }
        return 1;
    }
}
