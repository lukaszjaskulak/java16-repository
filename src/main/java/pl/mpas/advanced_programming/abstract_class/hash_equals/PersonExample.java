package pl.mpas.advanced_programming.abstract_class.hash_equals;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonExample {
    public static void main(String[] args) {
        Person me = new Person("Łukasz", "J");
        Person me2 = new Person("Łukasz", "J");
        Person me3 = new Person("Łukasz", "J");


        HashSet<Person> persons = new HashSet<>();
        persons.add(me);
        persons.add(me2);
        persons.add(me3);

        System.out.println(me.equals(me2));

         System.out.println("Set size = " + persons.size());

        Set<Person> sortedSet = new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
        sortedSet.add(me);
        sortedSet.add(me2);
        sortedSet.add(new Person("Ala", "Korala"));

        for (Person p: sortedSet) {
            System.out.println("Person " + p);

        }

    }


}
