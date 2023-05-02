package com.bl.RegExpDay_19;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExp {

   static Pattern p = Pattern.compile("^[A-Z a-z]{3,}$");
    public static void main(String[] args) {
        String str = "Madan";
        Matcher m = p.matcher(str);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
