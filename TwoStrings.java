import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();

            int length1 = str1.length();
            int length2 = str2.length();

            // String result = "";
            int count = 0;

            if (length1 <= length2) {
                for (int j = 0; j < length1; j++) {
                    if (str2.contains(String.valueOf(str1.charAt(j)))) {
                        count++;
                        break;
                    }
                }
            }
            if (length1 > length2) {
                for (int j = 0; j < length2; j++) {
                    if (str1.contains(String.valueOf(str2.charAt(j)))) {
                        count++;
                        break;
                    }
                }
            }

            if (count > 0) {
                System.out.println("YES");
            }
            if (count == 0) {
                System.out.println("NO");
            }
        }
    }
}
