import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Flippingbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int j = 0; j < q; j++) {
            Long n = sc.nextLong();
            String binary = "";
            for (int i = 31; i >= 0; i--) {
                Long k = n >> i;
                if ((k & 1) > 0)
                    binary += String.valueOf(1);
                else
                    binary += String.valueOf(0);
            }

            String temp = "";
            for (int k = 0; k < binary.length(); k++) {
                if (binary.charAt(k) == '1') {
                    temp += '0';
                } else {
                    temp += '1';
                }
            }
            System.out.println(Long.parseLong(temp, 2));
        }
    }
}
