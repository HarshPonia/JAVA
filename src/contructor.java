class Amity
{
    Amity()
    {
        System.out.println("Amity .. Non Para ..cons Base");
    }
    Amity(int a)
    {
        System.out.println("AMity.. para.. cons....");
    }
}

public class contructor extends Amity {

    contructor()
    {
        System.out.println("GLA constructor");
    }
    contructor(int a)
    {
        super(a);  // super must be First Statement in method
        System.out.println("GLA constructor .. para");
    }
    public static void main(String[] args) {

        contructor con = new contructor(15);

    }
    
}
