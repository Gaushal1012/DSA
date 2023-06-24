import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FairRation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) % 2 != 0) {
                if (i + 1 < n) {
                    list.set(i, list.get(i) + 1);
                    list.set(i + 1, list.get(i + 1) + 1);
                    temp = temp + 2;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) % 2 != 0) {
                count++;
            }
        }

        // for (int i = 0; i < n; i++) {
        // System.out.print(list.get(i) + " ");
        // }
        if (count == 0) {
            System.out.println(temp);
        } else {
            System.out.println("NO");
        }
    }
}
