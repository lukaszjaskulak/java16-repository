package pl.mpas.advanced_programming.abstract_class.generics;

import pl.mpas.advanced_programming.abstract_class.Animal;
import pl.mpas.advanced_programming.abstract_class.Cat;
import pl.mpas.advanced_programming.abstract_class.Dog;

import java.util.Objects;

public class ArraysTest {
    public static void main(String[] args) {


    Dog[] dogs = new Dog[2];
    dogs[0]  = new Dog("Azor");
    dogs[1]  = new Dog("Szarik");


    Cat[] cats = new Cat[2];
        cats[0] = new Cat("KitKat");
        cats[1] = new Cat("KitiKiti");

        Animal[] animals = dogs;
        Object[] object = animals;

    displayAnimals(cats);
    displayAnimals(dogs);
    displayAnimals(animals);
    addDog(cats);
    addDog(dogs);
}
        public static void addDog(Animal[] animals){

        animals[0] = new Dog("Pimpek");
            System.out.println("Z nowym psem " + animals);
        }


    public static void displayAnimals (Animal[] animals) {
        for (Animal animal: animals) {
            System.out.println(animals);
        }
    }


}
