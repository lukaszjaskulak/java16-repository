package pl.mpas;

@FunctionalInterface
interface SayHello{
    void sayHello();
    default void goodbye() {
        System.out.println("Goodbye!");
    }
}

@FunctionalInterface
interface Test {
   void testMethord(int a, String name);
    default void goHome() {
        System.out.println("ET go Home");
        }
    default void beAlone(){
        System.out.println("ET is alone");
    }
}



public class HelloLambda {
    public static void main(String[] args) {


        SayHello hello = () -> {
            System.out.println("Hello World");
        };
        SayHello hello2 = () -> {
        };
        hello2.sayHello();


        useTest((a,b)-> {
            System.out.println("" + a + a + " -- " + b + b);
        }, 5, "ET.");

        useTest((a,b)-> {
            System.out.println("" + a + a + a + " - - - " +b + b + b);
        }, 5, "ET.");
    }

    static void useTest(Test test, int a, String s){
        test.testMethord(a,s);
    }


}
