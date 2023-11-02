import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long max = 0;
        long min = 0;
        for (int i = 0; i < 4; i++) {
            min = min + arr[i];
        }
        for (int i = 1; i < 5; i++) {
            max = max + arr[i];
        }
        System.out.println(min + " " + max);
    }
}
