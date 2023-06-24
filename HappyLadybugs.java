import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HappyLadybugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) != s.charAt(j) && s.charAt(i) != '_') {
                    ans = "NO";
                }
            }
        }

        System.out.println(ans);
    }
}
