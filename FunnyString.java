import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FunnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String s = sc.next();

            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            int k = 0;
            while (k + 1 <= s.length() - 1) {
                int temp = Math.abs(s.charAt(k) - s.charAt(k + 1));
                list1.add(temp);
                k++;
            }

            int j = s.length() - 1;
            while (j - 1 >= 0) {
                int count = Math.abs(s.charAt(j) - s.charAt(j - 1));
                list2.add(count);
                j--;
            }

            if (list1.equals(list2) == true) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
    }
}
