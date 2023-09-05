import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class LuckBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] L = new int[n];
        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            L[i] = sc.nextInt();
            T[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < T.length; i++) {
            if (T[i] == 1) {
                list.add(L[i]);
            }
        }

        Collections.sort(list);

        int sum = -2 * L[k];
        ;
        for (int i = 0; i < L.length; i++) {
            sum = sum + L[i];
        }

        // sum = sum - 2 * L[k - 1];
        System.out.println(sum);
    }
}
