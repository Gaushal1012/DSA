import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingSort_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int max = Collections.max(list);
        int min = Collections.min(list);
        int length = 100;

        ArrayList<Integer> temp = new ArrayList<>(100);

        for (int i = 0; i < list.size(); i++) {
            temp.add(0);
        }

        for (int i = 0; i < arr.length; i++) {
            temp.set(arr[i], temp.get(arr[i]) + 1);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(temp.get(i) + " ");
        }
    }
}
