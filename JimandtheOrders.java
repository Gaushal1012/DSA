import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JimandtheOrders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] o = new int[n];
        boolean[] oo = new boolean[n];
        int[] sol = new int[n];
        for (int i = 0; i < n; i++) {
            o[i] = (in.nextInt() + in.nextInt());
            oo[i] = false;
        }
        for (int c = 0; c < n; c++) {
            int best = o[c];
            int r = 1;
            for (int i = 0; i < n; i++) {

                if (c != i && o[c] > o[i]) {
                    r++;
                }
            }
            if (oo[r - 1]) {
                r++;
            } else {
                oo[r - 1] = true;
            }
            sol[r - 1] = c + 1;
        }
        for (int c = 0; c < n; c++) {
            System.out.print(sol[c] + " ");
        }
    }
}
