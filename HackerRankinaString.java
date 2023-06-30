import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankinaString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String str = "hackerrank";

        for (int j = 0; j < q; j++) {
            String s = sc.next();

            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                if (temp == 8) {
                    break;
                }
                if (s.charAt(i) == str.charAt(temp)) {
                    temp++;
                }
            }
            if (temp == 8) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
