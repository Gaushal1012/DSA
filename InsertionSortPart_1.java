import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSortPart_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                if (temp < arr[i - 1]) {
                    arr[i] = arr[i - 1];
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[j] + " ");
                    }
                } else if (temp > arr[i - 1]) {
                    arr[i] = temp;
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[j] + " ");
                    }
                }
                System.out.println(" ");
            } else if (i == 0 && arr[i] > temp) {
                arr[i] = temp;
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}
