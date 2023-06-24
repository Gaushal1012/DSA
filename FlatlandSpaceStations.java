import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            list.add(n);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = Math.abs(j - c[i]);
                if (temp < list.get(j)) {
                    list.set(j, temp);
                }
            }
        }

        System.out.println(Collections.max(list));
    }
}
