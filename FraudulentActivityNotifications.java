import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentActivityNotifications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] expenditures = new int[n];

        for (int i = 0; i < expenditures.length; i++) {
            expenditures[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < expenditures.length; i++) {
            list.add(expenditures[i]);
        }

        // Collections.sort(list);

        int notification = 0;
        int m = 0;
        int median = 0;

        for (int i = 0; i < list.size(); i++) {
            while (d + i < n) {
                // for (int j = i; j < d + i; j++) {
                // list1.add(j);
                // }
                // Collections.sort(list1);
                if (d % 2 != 0) {
                    m = (d + 2 * i - 1) / 2;
                    // m = (d - 1) / 2;
                    median = list.get(m);
                    if (list.get(d + i) >= 2 * median) {
                        notification++;
                    }
                }
                if (d % 2 == 0) {
                    m = (d + 2 * i) / 2;
                    median = (list.get(m) + list.get(m - 1)) / 2;
                    if (list.get(d + i) >= 2 * median) {
                        notification++;
                    }
                }
                // list1.clear();
            }
        }
        System.out.println(notification);
    }
}
