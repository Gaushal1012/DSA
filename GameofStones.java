import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class GameofStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int temp = t;
            if (t < 2) {
                System.out.println("Second");
            }
            int count = 0;
            while (temp >= 2) {
                if (temp >= 3) {
                    if (temp >= 5) {
                        temp = temp - 5;
                        count++;
                    } else {
                        temp = temp - 3;
                        count++;
                    }
                } else {
                    temp = temp - 2;
                    count++;
                }
            }
            System.out.println(count);
            if (count > 0) {
                if (count % 2 == 0) {
                    System.out.println("Second");
                }
                if (count % 2 != 0) {
                    System.out.println("First");
                }
            }
        }
    }
}
