package pl.mpas.advanced_programming.abstract_class.comparing;

import java.util.*;

public class Example {
    public static void main(String[] args) {


        List<Person> persons = Arrays.asList(
          new Person("Mariusz", "Pp", 20),
          new Person("Mirek", "Np", 28),
          new Person("Teodor", "Sp", 25),
          new Person("Ben", "Fp", 36),
          new Person("Philip", "PF", 87)
        );

        Collections.sort(persons, Person::compareTo);

        Collections.sort(persons, Person::compareBySecondLetter);

        Collections.sort(persons, Comparator.comparing(Person::getSurName).thenComparing(Person::getName));
    }
}
