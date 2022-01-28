package Basics;

import java.util.Scanner;

public class user_input {

    static void name(int var1, String var2){

        System.out.println(var1);
        System.out.println(var2);
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        String var2 = scan.nextLine();
        int var1 = scan.nextInt();
        scan.close();

        user_input.name(var1,var2);
    }

}
