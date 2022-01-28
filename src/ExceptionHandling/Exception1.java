package ExceptionHandling;

public class Exception1 {
    public static  void new_hello(){
        System.out.println("hello");
    }
    public static void hello(){
        new_hello();
        System.out.println(10/0); // Exception --- Arthematic exception

    }
    public static void main(String[] args) {
        hello();
    }
}
