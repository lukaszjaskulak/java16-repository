package pl.mpas.advanced_programming.abstract_class;

import javax.naming.Name;
import java.util.Objects;

public abstract class Animal {

    private static final int NAME_MIN_LEN = 1;
    private String name;

    public Animal(String name) {
       this.name = Objects.requireNonNull(name, "Puste imie");
        if (name.length()< NAME_MIN_LEN) {
            throw new RuntimeException("Name too short, minimal lenght is: " + NAME_MIN_LEN );
        }
    }

    public abstract void eat ();
    public abstract void play();

}
