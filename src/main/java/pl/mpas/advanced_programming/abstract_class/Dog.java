package pl.mpas.advanced_programming.abstract_class;

public class Dog    extends Animal {

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    public Dog(String name) {
        super(name);
    }

}
