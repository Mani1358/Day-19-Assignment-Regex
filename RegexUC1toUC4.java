package com.blz.regex;

import java.util.regex.Pattern;

public class RegexUC1toUC4 {
    public static void main(String[] args) {
        boolean first = Pattern.compile("^[A-Z][a-z]{3}").matcher("Mani").matches();
        boolean last = Pattern.compile("^[A-Z][a-z]{2}").matcher("Vem").matches();
        boolean email = Pattern.compile("[a-z]{3}.[a-z]{3}@[a-z]{2}.[a-z]{2}.[a-z]{2}").matcher("bac.abc@co.in.do").matches();
        boolean phone = Pattern.compile("^[0-9]{2}[ \t][0-9]{10}").matcher("91 6309662908").matches();
        boolean eight = Pattern.compile("^[0-9]{2}[ \t][0-9]{10}").matcher("91 6309662908").matches();


        System.out.println(first);
        System.out.println(last);
        System.out.println(email);
        System.out.println(phone);

    }

}

