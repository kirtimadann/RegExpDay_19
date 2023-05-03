package com.bl.RegExpDay_19;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExp {

   static Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z]{8}$");
    public static void main(String[] args) {
        String password = "kirtiMada";
        Matcher m = p.matcher(password);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
