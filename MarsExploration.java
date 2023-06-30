import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String str = "SOS";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < 3) {
                if (s.charAt(i) != str.charAt(i)) {
                    count++;
                }
            }
            if (i >= 3) {
                if (s.charAt(i) != str.charAt(i % 3)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
