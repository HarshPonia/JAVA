package Regex;

import java.util.regex.Pattern;

public class regex_Example {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as")); // true (2nd char is s)
        System.out.println(Pattern.matches(".s","mk")); // false 2nd char is not s
        System.out.println(Pattern.matches(".s","mst")); // falase has more than 2 char
        System.out.println(Pattern.matches(".s","amms")); //flase has more than 2 char
        System.out.println(Pattern.matches("..s","mas")); // trues third char is s
    }
}
