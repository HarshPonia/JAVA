package ExceptionHandling;

public class Null_pointer_exp {
    public static void main(String[] args) throws NullPointerException {
        String st = null;
        try {
            System.out.println(st.length());
        }
        catch (NullPointerException p)
        {
            System.out.println(p.getMessage());
            System.out.println(p.fillInStackTrace());
            System.out.println(p);
        }

    }
}
