package pl.mpas.advanced_programming.abstract_class;

import pl.mpas.advanced_programming.abstract_class.Animal;
import pl.mpas.advanced_programming.abstract_class.Zoo;

public class AnimalExample{

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.handleAnimal(new Animal("Tiger") {
            @Override
            public void eat() {

            }

            @Override
            public void play() {

            }
        });

        Animal maybeCat;
        new Animal("Cat") {
            @Override
            public void eat() {
                System.out.println("eating");
            }

            @Override
            public void play() {
                System.out.println("play");
            }

            public void miauu(){
                System.out.println("Miauu");
            }
        }.miauu();
    }

}
