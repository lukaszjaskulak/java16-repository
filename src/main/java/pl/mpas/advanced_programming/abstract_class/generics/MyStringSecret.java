package pl.mpas.advanced_programming.abstract_class.generics;

import java.math.BigDecimal;

public class MyStringSecret {

    private String secret;


    @Override
    public String toString() {
        return "MyStringSecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public String getSecret() {
        return secret;
    }



    public MyStringSecret(String secret) {
        this.secret = secret;
    }
}
