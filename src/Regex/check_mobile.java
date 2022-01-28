package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check_mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
        Matcher m = p.matcher(s);
        if(m.find() && m.group().equals(s))
        {
            System.out.println("nubmer valid");
        }
        else {
            System.out.println("not vlid");
        }
    }
}
