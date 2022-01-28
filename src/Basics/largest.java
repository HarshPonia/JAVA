package Basics;

import java.util.Scanner;

public class largest {

    static void compare(int m,int n) {
        if (n>m)
        System.out.println("largest is : " +n);
        else if(m>n)
        System.out.println("Largest is : " +m);
        else 
        System.out.println("Both are equal ");
    }
    public static void main(String[] args) {
        
        int m,n;
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter two number : ");
        m = scan.nextInt();
        n = scan.nextInt();
        largest.compare(m,n);

    }
    
}
