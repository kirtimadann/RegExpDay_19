package com.bl.RegExpDay_19;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExp {

   static Pattern p = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9_.]*[a-zA-Z0-9]@[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]+$");
    public static void main(String[] args) {
        String str = "abc.xyz@bl.co.in";
        Matcher m = p.matcher(str);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
