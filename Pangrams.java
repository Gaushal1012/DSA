import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "abcdefghijklmnopqrstuvwxyz";

        s = s.replaceAll("\\s", "");
        s = s.toLowerCase();

        String match = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                boolean b1 = Character.isLetter(s.charAt(j));
                if (b1) {
                    if (str.charAt(i) == s.charAt(j)) {
                        match = match + String.valueOf(str.charAt(i));
                        break;
                    }
                }
            }
        }

        if (match.length() == str.length()) {
            System.out.println("pangrams");
        } else {
            System.out.println("no pangrams");
        }

    }
}
