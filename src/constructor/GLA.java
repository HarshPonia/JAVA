package constructor;

class Amity
{
    Amity()
    {
        System.out.println("constructor.Amity .. non para ..cons..base");
    }
}


public class GLA extends Amity {



    GLA()
    {
        System.out.println("Non para cons  ..");
    }
    GLA(int a)
    {
        System.out.println("para cons");

    }

    public static void main(String[] args) {

        GLA con1 = new GLA(8);
        GLA con2 = new GLA();
    }

}


