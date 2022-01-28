package array;

import java.util.Scanner;

public class Sum_of_array {
    static void sum(int[] arr)
    {  int  s = 0;
        for (int i =0;i< arr.length;i++)
        {
            s =  s +arr[i];
        }
        System.out.println("Sum of given array is : "+ s);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array ..");
        int l = scan.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the ele...");
        for (int i =0;i<l;i++)
        {
            arr[i] = scan.nextInt();
        }
        sum(arr);

    }
}
