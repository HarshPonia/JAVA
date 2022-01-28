package Regex;

import java.util.regex.Pattern;

public class Regex_Example66 {
    public static void main(String[] args) {
        System.out.println("By character classes Quantifier......\n");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9897156868")); // true
        System.out.println(Pattern.matches("[999][0-9]{9}","9697150708"));
        System.out.println(Pattern.matches("[789][0-9]{9}","6632587401"));
        System.out.println("By metacharacters............\n");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","85296315"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}","2369818742"));
    }
}
