package pl.mpas.advanced_programming.abstract_class.generics;

import java.math.BigDecimal;

public class ClassWithGenericMethod {

    private String maybeName;
    private Double maybeIncome;
    private BigDecimal hugeNumber;

    public ClassWithGenericMethod(String maybeName, Double maybeIncome, BigDecimal hugeNumber) {
        this.maybeName = maybeName;
        this.maybeIncome = maybeIncome;
        this.hugeNumber = hugeNumber;

        validateGeneric(hugeNumber);
    }



    private String validateString(String toCheck){
        if(toCheck == null) {
            throw new RuntimeException("Cannot be null!");
        }
    return toCheck;}

    private Double validateString(Double toCheck){
        if(toCheck == null) {
            throw new RuntimeException("Cannot be null!");
        }
        return toCheck;}

    private BigDecimal validateString(BigDecimal toCheck){
        if(toCheck == null) {
            throw new RuntimeException("Cannot be null!");
        }
        return toCheck;
    }

        private <T> T validateGeneric(T toCheck){
        if (toCheck == null)
        {throw new RuntimeException("no!!");
        }
        return toCheck;
    }



}
