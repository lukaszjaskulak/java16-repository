package pl.mpas.advanced_programming.abstract_class.lambda_this;

public class Main {

    private String name = "Main";

    public void move(){
        System.out.println("move() inside Main");
    }

    public Main(String name) {
        this.name = name;
    }

    public Movable makeOne(){


        return new Movable() {
            private String name = "Movable";
            @Override
            public void move() {
                System.out.println("inside anonymous class - move()");
                System.out.println("name" + Main.this.name);
                System.out.println("name" + this.name);
                System.out.println("name" + name);

            }
        };
    }

    public Movable makeOnewWithLambda(){
        String name = "haha";
        return () -> {
            this.move();
            System.out.println(this.name);
            System.out.println(name);
        };
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {


    }
}
