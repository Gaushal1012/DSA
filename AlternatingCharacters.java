import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String s = sc.next();

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (j + 1 < s.length()) {
                    if (s.charAt(j) == s.charAt(j + 1)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
