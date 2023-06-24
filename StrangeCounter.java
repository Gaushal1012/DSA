import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrangeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        int a = (int) t;
        long value = 3;
        int temp = (int) value;
        for (int i = 1; i <= (int) t; i++) {
            if (temp != 0) {
                if (i == (int) t) {
                    System.out.println(temp);
                }
                temp--;
            } else if (temp == 0) {
                value = 2 * value;
                temp = (int) value;
                if (i == (int) t) {
                    System.out.println(temp);
                }
                temp--;
            }
        }
    }
}
