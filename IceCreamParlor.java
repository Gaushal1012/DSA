import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            ArrayList<Integer> list = new ArrayList<>();
            int temp = 0;

            for (int j = 0; j < arr.length; j++) {
                temp = arr[j];
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    temp = temp + arr[j2];
                    if (temp == m) {
                        list.add(j + 1);
                        list.add(j2 + 1);
                    }
                }
            }

            for (int k = 0; k < list.size(); k++) {
                System.out.print(list.get(k) + " ");
            }
        }
    }
}
