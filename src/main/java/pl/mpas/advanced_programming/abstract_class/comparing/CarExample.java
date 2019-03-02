package pl.mpas.advanced_programming.abstract_class.comparing;

import pl.mpas.advanced_programming.abstract_class.comparing.ref_method.CompareByBrand;
import pl.mpas.advanced_programming.abstract_class.comparing.ref_method.CompareFew;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarExample {

    public static void main(String[] args) {

        List<Auto> cars = Arrays.asList(
    new Auto("Opel", "Astra", "Red", 2.0),
    new Auto("Opel", "Zafira", "Blue", 1.8),
    new Auto("Polonez", "Caro", "White", 3.0),
    new Auto("Mazda", "6", "Black", 2.2),
    new Auto("Bentley", "Continental", "Grey", 3.5),
    new Auto("Smart", "For2", "Green", 0.8)
        );


        System.out.println(cars);
        Collections.sort(cars, Auto::compareTo);
        System.out.println(cars);
        Collections.sort(cars, Auto::compareByBrand);
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);

        Auto toCompare = new Auto("Ford", "Focus", "Blue", 1.6);
        toCompare.maybeComparing((Auto o) -> 1);

        System.out.println("Colour sorted");
        Collections.sort(cars, new CarBrandComparator());
        System.out.println(cars);

        cars.sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return 0;
            }
        });
        cars.sort((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));

        CompareByBrand brandComparing = new CompareByBrand();

        cars.sort((car1, car2) -> {
            return brandComparing.orderByBrand(car1, car2);
        });

        cars.sort((car1, car2) -> brandComparing.orderByBrand(car1, car2));

        cars.sort(brandComparing::orderByBrand);

        cars.sort(CompareFew::sortAdvanced);
        System.out.println("Advanced sort:\n" + cars);

        cars.sort(Comparator.comparing(Auto::getColor)
                .thenComparing(Auto::getBrand)
                .thenComparing(Auto::getCapacity));



    }
}
