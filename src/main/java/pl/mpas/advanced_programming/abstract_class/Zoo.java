package pl.mpas.advanced_programming.abstract_class;

import pl.mpas.advanced_programming.abstract_class.Animal;

public class Zoo {


       public Zoo() {
    }


    public void handleAnimal (Animal animal) {
        animal.eat();
        animal.play();
        animal.play();
    }


}
