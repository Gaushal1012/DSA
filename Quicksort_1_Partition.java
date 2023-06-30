import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Quicksort_1_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pivot = arr[0];
        // String left = "";
        // String equal = "";
        // String right = "";
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // String s = String.valueOf(arr[i]);
            if (arr[i] > pivot) {
                // right = right + s;
                right.add(arr[i]);
            } else if (arr[i] < pivot) {
                // left = left + s;
                left.add(arr[i]);
            } else if (arr[i] == pivot) {
                // equal = equal + s;
                equal.add(arr[i]);
            }
        }

        // String ans = left + equal + right;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < left.size(); i++) {
            ans.add(left.get(i));
        }
        for (int i = 0; i < equal.size(); i++) {
            ans.add(equal.get(i));
        }
        for (int i = 0; i < right.size(); i++) {
            ans.add(right.get(i));
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}