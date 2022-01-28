package OOPS;

public class Students {
    String firstname= "Harsh ";
    String lastname = "ponia";
    int roll_no= 18 ;
    char section = 'G';
    String fullname;
    void fullname ()
    {
        System.out.println(firstname+lastname);
    }
//      constructor -->
    Students(){
        System.out.println("this is constructor of Students...");
    }


}
