import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Gemstones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        int temp = arr[0].length();
        int p = 0;

        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i].length()) {
                temp = arr[i].length();
                p = i;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(0);
        }

        // for (int index = 0; index < arr.length; index++) {
        // for (int i = 0; i < arr[index].length(); i++) {
        // for (int j = 0; j < temp; j++) {
        // String s = arr[i];
        // System.out.println(s);
        // }
        // }
        // }

        System.out.println(temp);
        System.out.println(arr[p]);
    }
}
