package Basics;

import java.util.Scanner;

public class tringle_pattern {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = scan.nextInt();
        scan.close();
        for (int i =0;i<=n;i++)
        {
            for (int j =0;j<=i;j++)
            {
                System.out.print("* @");
            }
            System.out.println();
        }
    }
    
}
