package inheritance;

import java.util.Scanner;

public class saving extends curent {

    public void sa()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name of saving  ");
        String name  = scan.nextLine();
        System.out.println("Enter your a/c");
        int ac = scan.nextInt();


    }
    public class op extends withdraw{
        public void operations()
        {
            op call = new op();
            call.wd();

        }

    }
}
