import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

// public class ManasaAndStones {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();

// for (int k = 0; k < t; k++) {
// int n = sc.nextInt();
// int a = sc.nextInt();
// int b = sc.nextInt();

// ArrayList<Integer> list = new ArrayList<>();
// int temp1 = a;
// int temp2 = a;
// int temp3 = b;
// int temp4 = b;

// for (int i = 1; i < n - 1; i++) {
// temp1 = temp1 + a;
// temp2 = temp2 + b;
// temp3 = temp3 + a;
// temp4 = temp4 + b;
// if (i == n - 2) {
// list.add(temp1);
// list.add(temp2);
// list.add(temp3);
// list.add(temp4);
// }
// }

// Collections.sort(list);

// Set<Integer> s = new LinkedHashSet<Integer>(list);
// List<Integer> newList = new ArrayList<Integer>(s);
// for (int i = 0; i < newList.size(); i++) {
// System.out.print(newList.get(i) + " ");
// }
// }
// }
// }

public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfTestCases = scan.nextInt();
        for (int i = 0; i < numberOfTestCases; ++i) {
            int numberOfStones = scan.nextInt() - 1;
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (numberOfStones <= 0) {
                System.out.println(0);
            } else {
                Vector<Integer> results = new Vector<Integer>();
                for (int j = 0; j <= numberOfStones; ++j) {
                    results.add((numberOfStones - j) * a + j * b);
                }

                Collections.sort(results);
                System.out.print(results.elementAt(0));
                for (int j = 1; j < results.size(); ++j) {
                    if (results.elementAt(j).equals(results.elementAt(j - 1))) {
                        continue;
                    } else {
                        System.out.print(" " + results.elementAt(j));
                    }
                }
                System.out.println();
            }
        }
    }
}
