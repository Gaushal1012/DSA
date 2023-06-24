import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] width = new int[n];

        for (int i = 0; i < width.length; i++) {
            width[i] = sc.nextInt();
        }

        for (int k = 0; k < t; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int min = width[i];
            for (int j2 = i; j2 <= j; j2++) {
                for (int l = j2 + 1; l <= j; l++) {
                    if (width[l] < min) {
                        min = width[l];
                    }
                }
            }
            System.out.println(min);
        }
    }
}
