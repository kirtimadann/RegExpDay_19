package com.bl.RegExpDay_19;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExp {
//(?=.*[A-Z])
   static Pattern p = Pattern.compile("^[a-zA-Z[0-9]][a-zA-Z0-9]*(?=.*[0-9]).*$");
    public static void main(String[] args) {
        String password = "kirtI5";
        Matcher m = p.matcher(password);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
