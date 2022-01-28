package Basics;

import java.util.Scanner;

public class even_odd {

    static void func(int n){

        if (n%2==0)
        {
            System.err.println("Even");
        }
        else{
            System.err.println("Odd");
        }
    }
    public static void main(String[] args) {
        
        System.err.println("Enter a number");
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        even_odd.func(n);

    }
    
}
