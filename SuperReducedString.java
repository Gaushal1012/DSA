import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (ans.isEmpty() || ans.charAt(ans.length() - 1) != s.charAt(i)) {
                ans = ans + s.charAt(i);
            } else if (ans.charAt(ans.length() - 1) == s.charAt(i)) {
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        if (ans.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(ans);
        }
    }
}
