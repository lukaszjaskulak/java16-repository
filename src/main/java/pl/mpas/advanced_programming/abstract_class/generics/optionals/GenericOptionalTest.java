package pl.mpas.advanced_programming.abstract_class.generics.optionals;

import java.util.Optional;
import java.util.function.Predicate;

public class GenericOptionalTest {

    public static void main(String[] args) {

        Optional<String> maybeMyName = Optional.of("Lukasz");

        System.out.println(checkIfNameMatch2("Baba Jaga", maybeMyName));
        System.out.println(checkIfNameMatch2("Lukasz", maybeMyName));
        System.out.println(checkIfNameMatch1("Lukasz", maybeMyName));

        System.out.println(maybeMyName.filter(s -> checkIfNameMatch1("Lukasz", maybeMyName)));
    }



    public static boolean checkIfNameMatch1(String name, Optional<String> maybeMyName) {
        Predicate<CharSequence> check = new Predicate<CharSequence>() {
            @Override
            public boolean test(CharSequence charSequence) {
                return name.equals(charSequence);
            }
        };

        return maybeMyName.filter(s -> s.equals(name)).isPresent();
    }

    public static boolean checkIfNameMatch2(String name, Optional<String> maybeMyName) {
        return maybeMyName.filter(s -> s.equals(name)).isPresent();
    }
}
