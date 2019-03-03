package pl.mpas.advanced_programming.abstract_class.generics;

import pl.mpas.advanced_programming.abstract_class.Cat;
import pl.mpas.advanced_programming.abstract_class.Dog;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class SecretExample {

    public static void main(String[] args) {

        MyStringSecret dream = new MyStringSecret("hahaha");
        MyBigDecimalSecret incomes = new MyBigDecimalSecret(BigDecimal.ZERO);

        MySecretGenericsV1 integer = new MySecretGenericsV1(Integer.valueOf(1));

        Integer secretInteger = (Integer) integer.getObject();

        checkMySecret(integer);


        List animals = new ArrayList();
        animals.add(new Cat("Fifi"));
        animals.add(new Dog("Azor"));

       checkAnimals(animals);

       MySecondGeneric <String> stringSecret = new MySecondGeneric<>("secret");
        MySecondGeneric<BigDecimal> futureIncome = new MySecondGeneric<>(BigDecimal.valueOf(1000000));
        MySecondGeneric objectSecret = new MySecondGeneric(new Object());
        MySecondGeneric<Object> objectSecret2 = new MySecondGeneric<>(new Object());

        TwoGenericSecrets< String, Integer> doubleSecret = new TwoGenericSecrets<>("How much?!", 9000);

    }

    public static void checkMySecret(MySecretGenericsV1 secretGenericsV1){
        if (secretGenericsV1.getObject() instanceof  Integer) {
            Integer secret = (Integer) secretGenericsV1.getObject();
            System.out.println("Secret: " + secret);
        }
    }
    public static void checkAnimals(List animals){
        for (Object animal: animals) {
            if (animal instanceof Dog) {
                System.out.println("Dog");
            } else if (animal instanceof Cat){
                System.out.println("Cat");
            } else {
                System.out.println("unknown Animal");
            }
        }
    }

}
