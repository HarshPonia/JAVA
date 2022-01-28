package inheritance;

import java.util.Scanner;

public class withdraw {

    public void wd()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter withdraw amount ..");

        int amount = scan.nextInt();
        int am = 100000;
        System.out.println("Your remaining amount : " + (am - amount));

    }
}
