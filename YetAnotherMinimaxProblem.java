import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class YetAnotherMinimaxProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        System.out.println(list);

        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) ^ list.get(i + 1)) > max) {
                max = list.get(i) ^ list.get(i + 1);
            }
        }
        System.out.println(max);
    }
}
