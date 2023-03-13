package com.blz.regex;
import java.util.regex.*;
import java.util.*;

public class Email {
    public static void main(String[] args) {
        List emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

//Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");

        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher("Mani621998@gmail.com");
        boolean b = m.matches();
        System.out.println(b);

    }
}