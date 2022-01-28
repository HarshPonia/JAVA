package Basics;

import java.util.Scanner;

public class Area_perimeter {


    static void Area(float w,float h) {

        System.out.println("Area is : " +(w*h));
        float p = (2*(w+h));
        System.out.println("Perimeter Is : " + p);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float w,h;
        System.out.println("Enter weidth : ");
        w = scan.nextFloat();
        System.out.println("Enter Height : ");
        h = scan.nextFloat();
        Area_perimeter.Area(w,h);
    }
    
    
}
