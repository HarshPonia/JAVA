package inheritance;


class youtube extends google{
    void video()
    {
        System.out.println("this is youtube class ");
    }
}

class SunMicroSystem extends  youtube{
    void Java()
    {
        System.out.println("This java by sunmicrosystem");
    }
}


public class Oracle extends SunMicroSystem {

    public static void main(String[] args) {
        Oracle call = new Oracle();
        call.Java();
        call.search();
        call.video();


    }
}
