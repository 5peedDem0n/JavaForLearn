package id.felis.removeVowels;
import java.util.Scanner;

public class Remove_Vowels {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        //enter full sentence or words
        System.out.println("Enter word");
        String str = s.nextLine();

        String[] a = str.split("");
        String result = "";

        //here is the process to remove the vowels
        for(int i = 0; i < a.length; i++){
            if (a[i].equalsIgnoreCase("a") ||
                    a[i].equalsIgnoreCase("e") ||
                a[i].equalsIgnoreCase("i") ||
                    a[i].equalsIgnoreCase("u") ||
                    a[i].equalsIgnoreCase("o")
            ){
                continue;
            }
            result = result + a[i];
        }
        System.out.println("After removing vowels");
        System.out.println(result);
    }



}
