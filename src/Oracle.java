


package inheritance;


class SunmicroSystem {
    void java ()
    {
        System.out.println("Java Program.... ");
    }

    
}

class Oracle extends SunmicroSystem {

    public static void main(String[] args) {
        Oracle Obj =  new Oracle();
        Obj.java();

    }
    
}
