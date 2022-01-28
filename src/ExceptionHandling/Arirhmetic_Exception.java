package ExceptionHandling;

public class Arirhmetic_Exception {
    public static void main(String[] args) {
        try {
            int x = 50/0;
        }
        catch (ArithmeticException xe) {
            System.out.println(xe);
            System.out.println(xe.getMessage());
            System.out.println(xe.getCause());
            System.out.println(xe.hashCode());
            System.out.println(xe.toString());
        }
    }
}
