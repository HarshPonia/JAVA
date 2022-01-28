package ExceptionHandling;

public class Try_Catch {
    public static void main(String[] args) {
        int x = 5,y = 0;
        // Syntax of try
        // try{
        //      body of try
        // }

        // catch(Eception_name  obj)
        // {      Body      }
        try {
            int r  = x/y;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage()); // Output >>> / by zero
            System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@3b07d329
            System.out.println(e.getClass()); // it will print tha class name where exception is to be found
            // output >>> class java.lang.ArithmeticException
        }
        System.out.println("Rest of code ... working ");

    }
}
