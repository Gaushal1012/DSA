import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 6 arr[] size n = 6
        // 7 1 3 4 1 7 arr = [7, 1, 3, 4, 1, 7]
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int distance = -1;
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(-1);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    // if (list.contains(-1)) {
                    // list.remove(Integer.valueOf(-1));
                    // }
                    int temp = j - i;
                    list.add(temp);
                }
            }
        }
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        if (list.size() != 0) {
            System.out.print(Collections.min(list) + " ");
        } else {
            System.out.println(-1);
        }
    }
}
