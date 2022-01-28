package array;

import java.util.Scanner;

public class minimum {
   public static void min(int[] a)
   {
       int m = a[0];
       for( int i =0;i< a.length;i++)
       {
           if (a[i]<m)
               m = a[i];
       }
       System.out.println("the smallest number is  : "+m);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array...");
        int l = sc.nextInt();
        int[] arr =  new int[l];
        for (int i =0; i<l;i++)
        {
            arr[i] =  sc.nextInt();
        }
        min(arr);
    }

}
