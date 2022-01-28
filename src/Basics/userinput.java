package Basics;

import java.util.Scanner;

public class userinput {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        String  s = scan.next();
        System.out.println("My name is :" + s);
    }
}
