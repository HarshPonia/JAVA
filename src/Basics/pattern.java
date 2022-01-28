/*
     Author  -   Harsh Ponia
    Date    -   29/08/2021
    Problem/task    -  
    
            * 
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *

*/

package Basics;

import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter a number : ");
        int n = scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++)
        {
            for (int j = 0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
