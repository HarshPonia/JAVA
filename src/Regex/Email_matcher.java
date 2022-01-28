package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_matcher {
    public static void main(String[] args) {
        String s = "harsh.ponia_cs20@gla.ac.";
        Pattern p = Pattern.compile("[a-zA-z.]+_cs20@(gmail|gla)[.]ac[.]in");
        Matcher m = p.matcher(s);
        if(m.find()){
            System.out.println("valid");
        }
        else{
            System.out.println("not");
        }
    }
}
