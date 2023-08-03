import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class StringConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int custo = 0;
            String s = sc.next();
            StringBuilder p = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                String c = String.valueOf(s.charAt(j));
                if (p.indexOf(c) == -1)
                    ++custo;
                p = p.append(c);
            }
            System.out.println(custo);
        }
    }
}