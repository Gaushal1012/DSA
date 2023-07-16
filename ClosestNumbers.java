import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int temp = Math.abs(arr[1] - arr[0]);

        int k = 0;
        while (k + 1 < n) {
            int diff = Math.abs(arr[k + 1] - arr[k]);
            if (diff < temp) {
                temp = diff;
            }
            k++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while (i + 1 < n) {
            if (Math.abs(arr[i + 1] - arr[i]) == temp) {
                list.add(arr[i]);
                list.add(arr[i + 1]);
            }
            i++;
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }
}
