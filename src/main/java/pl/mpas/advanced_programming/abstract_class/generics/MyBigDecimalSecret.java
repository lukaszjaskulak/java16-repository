package pl.mpas.advanced_programming.abstract_class.generics;

import java.math.BigDecimal;

public class MyBigDecimalSecret {

    private BigDecimal secret;

    public MyBigDecimalSecret(BigDecimal secret) {
        this.secret = secret;
    }

    public BigDecimal getSecret() {
        return secret;
    }

    @Override
    public String toString() {
        return "MyBigDecimalSecret{" +
                "secret=" + secret +
                '}';
    }
}
