import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        String str = "";
        for (int i = 0; i < n; i++) {
            boolean b1 = Character.isLetter(s.charAt(i));
            if (b1) {
                int temp = s.charAt(i) + k;
                boolean b2 = Character.isLowerCase(s.charAt(i));
                boolean b3 = Character.isUpperCase(s.charAt(i));
                if (b2 && temp > 122) {
                    while (temp > 122) {
                        temp = temp - 123 + 97;
                    }
                    char c = (char) temp;
                    str = str + c;
                } else if (b3 && temp > 90) {
                    while (temp > 90) {
                        temp = temp - 91 + 65;
                    }
                    char c = (char) temp;
                    str = str + c;
                } else {
                    char c = (char) temp;
                    str = str + c;
                }

            }
            if (!b1) {
                str = str + s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
