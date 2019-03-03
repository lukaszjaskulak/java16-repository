package pl.mpas.advanced_programming.abstract_class.generics;

public class TwoGenericSecrets <T, U>{

    private String secret1;
    private Integer secret2;

    public TwoGenericSecrets(String secret1, Integer secret2) {
        this.secret1 = secret1;
        this.secret2 = secret2;
    }

    public String getSecret1() {
        return secret1;
    }

    public Integer getSecret2() {
        return secret2;
    }

    @Override
    public String toString() {
        return "TwoGenericSecrets{" +
                "secret1='" + secret1 + '\'' +
                ", secret2=" + secret2 +
                '}';
    }
}
