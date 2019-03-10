package pl.mpas.advanced_programming.abstract_class.atomic;

import java.util.Objects;

public class Exercise5 {
    public static void main(String[] args) {
        Person youngPerson = new Person("Al", "Fo", null);


        try {
            System.out.println("Before calling ");
            synchronized (youngPerson) {
            youngPerson.wait();}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
