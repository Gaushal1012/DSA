import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingSort_2 {
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
        int length = max + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            temp.add(0);
        }

        for (int i = 0; i < temp.size(); i++) {
            temp.set(arr[i], temp.get(arr[i]) + 1);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(temp.get(i) + " ");
        }

        // System.out.println();

        ArrayList<Integer> temp2 = new ArrayList<>();
        // for (int i = 0; i < length; i++) {
        // temp2.add(0);
        // }

        for (int i = 0; i < length; i++) {
            if (temp.get(i) != 0) {
                for (int j = 0; j < temp.get(i); j++) {
                    temp2.add(i);
                }
            }
        }

        // for (int i = 0; i < temp2.size(); i++) {
        // System.out.print(temp2.get(i) + " ");
        // }
    }
}
