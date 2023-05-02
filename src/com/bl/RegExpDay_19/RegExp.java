package com.bl.RegExpDay_19;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExp {

   static Pattern p = Pattern.compile("^(0|91)\s?[7-9][0-9]{9}$");
    public static void main(String[] args) {
        String str = "91 9919819801";
        Matcher m = p.matcher(str);
        if (m.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }


    }
}
