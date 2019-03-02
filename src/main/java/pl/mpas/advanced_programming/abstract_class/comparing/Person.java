package pl.mpas.advanced_programming.abstract_class.comparing;

public class Person implements Comparable <Person>{

    private String name;
    private String surName;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public int compareBySecondLetter(Person o) {
        return this.name.charAt(1) - o.name.charAt(1);
    }


}
