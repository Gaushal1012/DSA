import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MaximizingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int result = 0;

        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                if ((i ^ j) > result) {
                    result = i ^ j;
                }
            }
        }
        System.out.println(result);
    }
}
