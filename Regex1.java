package com.blz.regex;
import java.util.regex.*;

public class Regex1 {
    public static void main(String[] args) {
        Pattern P1=Pattern.compile(".h");
        Matcher m1=P1.matcher("Mh");

        boolean result = m1.matches();
        System.out.println(result);

        Pattern p2 = Pattern.compile("..h");
        Matcher m2 = p2.matcher("Mohth");

        boolean res = m2.matches();
        System.out.println(res);

        boolean rest = Pattern.matches("[a-z A-Z 0-9]{5}","Mani4");
        System.out.println(rest);


    }
}
