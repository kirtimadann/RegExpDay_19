package com.bl.RegExpDay_19;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExp {
//(?=.*[A-Z])
   static Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]*(?=.*[A-Z]).*$");
    public static void main(String[] args) {
        String password = "kirtI";
        Matcher m = p.matcher(password);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
