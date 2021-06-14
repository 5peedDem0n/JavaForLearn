package id.felis.capitalize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capitalize {

    /*
    - Mengkapitalkan huruf pertama pada sebuah string
    - hanya huruf pertama dari kata pertama yang akan di kapitalkan
    - Capitalize.firstLetter(null)          = null
    - Capitalize.firstLetter("")            = ""
    - Capitalize.firstLetter("felis")       = "Felis"
    - Capitalize.firstLetter("hello world") = "Hello World
     */

    public static String firstLetter(String string){
        if (string == null || "".equals(string)){
            return string;
        }
        return string.trim().substring(0,1).toUpperCase() +
                string.trim().substring(1).toLowerCase();
    }

    /*
    - mengkapitalkan semua huruf pertama setiap kata pada sebuah string

    - Capitalize.allFirstLetters(null)              = null
    - Capitalize.allFirstLetters("")                = ""
    - Capitalize.allFirstLetters("felis")           = "Felis"
    - Capitalize.allFirstLetters("hello world")     = "Hello World"
     */
    public static String allFirstLetters(String string){
        if (string == null || "".equals(string)){
            return string;
        }
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(string.trim());
        int spaceCount = 0;
        while (matcher.find()){
            spaceCount++;
        }
        List<String> myString = new ArrayList(Arrays.asList(string.trim().split(" ")));
        for (int i = 0; i < spaceCount; i++) {
            myString.set(i, firstLetter(myString.get(i)));
        }
        return myString.toString().replace("[", "").replace("]", "").replace(",", "");
    }

    public static void main(String[] args){
        String sentence = "i run through the wall";

        System.out.println(allFirstLetters(sentence));
    }
}
