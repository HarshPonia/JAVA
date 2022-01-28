package Regex;

import java.util.regex.Pattern;

/* create a ragular expression that accepts alphanumeric charater only.
it leangth must be six character long only.
 */
public class Regex_Example5 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","2haRAD")); // true
        System.out.println(Pattern.matches("[0-9]{10}","9876543211")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","xdf645h")); // flase more thank 6 char
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","sagfy$")); // false  $ is not defined


    }
}
