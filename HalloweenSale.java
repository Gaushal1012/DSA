import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HalloweenSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        int totalBudget = p;
        int x = p;
        int count = 0;
        while (totalBudget <= s) {
            if (x - d > m) {
                x = x - d;
            } else {
                x = m;
            }
            totalBudget = totalBudget + x;
            count++;
        }
        System.out.println(count);
    }
}
