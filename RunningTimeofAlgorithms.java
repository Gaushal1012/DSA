import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RunningTimeofAlgorithms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int a = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = a;
                    temp = temp + 1;
                } else {
                    break;
                }
            }
        }
        System.out.println(temp);
    }
}
