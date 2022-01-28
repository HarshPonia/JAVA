package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class String_tokens {
    static int count(String str){
     String[] r = str.split("[, '@_.?!]+");
     return r.length;
    }
    static void sub(String str){
        String[] r = str.split("[, '@_.?!]+");
        for(int i =0;i<r.length;i++)
        {
            System.out.println(r[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = count(str);
        System.out.println(l);
        sub(str);

    }
}
