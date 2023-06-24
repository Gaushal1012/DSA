import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BigSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = sc.next();
        }

        for (int i = 0; i < n - 1; i++) {
            // int temp = unsorted[i];
            // System.out.println(temp);
            for (int j = i + 1; j < unsorted.length; j++) {
                BigInteger num1 = new BigInteger(unsorted[i]);
                BigInteger num2 = new BigInteger(unsorted[j]);
                if (num1.compareTo(num2) == 1) {
                    String temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
                // if (unsorted[i].compareTo(unsorted[j]) > 0) {
                // String temp = unsorted[i];
                // unsorted[i] = unsorted[j];
                // unsorted[j] = temp;
                // }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(unsorted[i]);
        }
        // System.out.println(Arrays.toString(unsorted));

        // System.out.println(unsorted[1].compareTo(unsorted[0]));
    }
}

// 31415926535897932384626433832795
// 1
// 3
// 10
// 3
// 5
