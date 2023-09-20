import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MarkandToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

        int count = 0;
        int diff = k;

        for (int i = 0; i < n; i++) {
            if (diff >= prices[i]) {
                count++;
                diff = diff - prices[i];
            }
        }

        System.out.println(count);
    }
}
