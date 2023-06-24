import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int upper = 0, lower = 0, number = 0, special = 0;
        String specialCharRegex = "!@#$%^&*()-+";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else if (specialCharRegex.indexOf(ch) != -1) {
                special++;
            }
        }

        int count = 0;
        if (upper == 0) {
            count++;
        }
        if (lower == 0) {
            count++;
        }
        if (number == 0) {
            count++;
        }
        if (special == 0) {
            count++;
        }

        if (count + s.length() >= 6) {
            System.out.println(count);
        }
        if (count + s.length() < 6) {
            System.out.println(6 - s.length());
        }

    }
}
