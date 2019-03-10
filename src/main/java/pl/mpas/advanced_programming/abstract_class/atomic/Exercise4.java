package pl.mpas.advanced_programming.abstract_class.atomic;

import java.util.Objects;

class Person implements Cloneable{
    String name;
    String surname;

        private Person partner;

    public Person(String name, String surname, Person partner) {
        this.name = name;
        this.surname = surname;
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", partner=" + partner +
                '}';
    }

    public Person getPartner() {
        return partner;
    }

    public Person performCloning(){
        Person newYou = null;

        try {
            newYou  = (Person) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newYou;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class Exercise4  {
    public static void main(String[] args) {


        Person firstPerson = new Person("Andrzej", "Wu", null);
        Person secondPerson = new Person("Waldek", "En", firstPerson);


        System.out.println("Me " + firstPerson);
        System.out.println("Friend " + secondPerson);

        Person clonedPerson = secondPerson.performCloning();
        System.out.println(clonedPerson);



    }
}
