package pl.mpas.advanced_programming.abstract_class.generics;

import pl.mpas.advanced_programming.abstract_class.Animal;
import pl.mpas.advanced_programming.abstract_class.Cat;
import pl.mpas.advanced_programming.abstract_class.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        List<Animal> someList = new ArrayList<>();
        someList.add(new Dog("Pancerny"));
        someList.add(new Cat("QWERTY"));



        List<Dog> dogs = Arrays.asList(
                new Dog("Azor"),
                new Dog("Pimpek")
        );
        List<Cat> cats = Arrays.asList(
                new Cat("Kitkat"),
                new Cat("Kotkotkot")
        );

        displayAnimals(dogs);
        displayAnimals(cats);
        displayAnimals(someList);

       addAnimal(someList);

    }

        public static void displayAnimals (List<? extends Animal> animals){

        for (Animal animal : animals) {
                System.out.println(animal);
            }
        }

        public static void addAnimal(List<? super Animal> animals){
        animals.add(new Dog("MsDOS"));
            System.out.println("Add Dog MsDos       " + animals);

        }
}
