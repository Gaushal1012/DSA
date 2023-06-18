import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            // int n = 10;
            // int c = 2;
            // int m = 5;
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            int num = n / c;
            int count = num;
            int temp = num;

            while (temp > 1 && temp >= m) {
                int x = temp / m;
                temp = temp % m + x;
                count = count + x;
            }
            System.out.println(count);
        }
    }
}
