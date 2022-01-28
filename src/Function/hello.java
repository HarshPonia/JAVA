package Program.Function;




public class hello {
    
    public static void helloword() 
{
    System.out.println("hello world");
    
}
    public static void main(String[] args) {
        hello obj  = new hello();
        helloword();
        helloword();
        helloword();
        obj.name();  // this is useig  object 
    }

    public static void name() {

        System.err.println("My name is harsh ponia");
        
    }
}
