package array;
import java.util.Scanner;

public class main {

        void ans(int[] arr)
        {
            System.out.println("divisible by  3 or 5");
            for(int i=0;i< arr.length;i++)
            {
                if(arr[i]%3==0 || arr[i]%5==0)
                {
                    if(arr[i]%3==0 && arr[i]%5==0)
                        continue;
                    else
                        System.out.print(arr[i]+" ");
                }
            }
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n;
            int arr[];
            System.out.print("Enter the size of array: \n");
            n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter the Elements of array: \n");
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            main obj = new main();
            obj.ans(arr);
        }
    }

