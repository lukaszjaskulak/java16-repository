package pl.mpas.advanced_programming.abstract_class.generics;

public class MySecondGeneric <T> {

    private T object;

    public MySecondGeneric(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MySecretGenericsV1{" +
                "object=" + object +
                '}';
    }
    
    
    
}
