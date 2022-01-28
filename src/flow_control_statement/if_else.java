/*
    Author  -   Harsh Ponia
    Date    -   2/08/2021

*/

/* 
    if else: - 
    syntax :- 
    if(condition ) 
    {
        body of if
    }
    else 
    {
        body of else 
    } 

*/


package flow_control_statement;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        if(n>10)
        {
            System.out.println(" Number is greater than 10 ");
        }
        else
        {
            System.out.println(" Number is less than 10 ");
        }
    }

}