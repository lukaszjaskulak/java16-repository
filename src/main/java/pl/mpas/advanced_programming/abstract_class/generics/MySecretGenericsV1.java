package pl.mpas.advanced_programming.abstract_class.generics;

import java.util.Objects;

public class MySecretGenericsV1 {

    private Object object;

    public MySecretGenericsV1(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MySecretGenericsV1{" +
                "object=" + object +
                '}';
    }
}
