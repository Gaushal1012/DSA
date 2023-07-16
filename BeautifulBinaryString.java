import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int answer = 0;
        int i = 0;
        while (i < n - 2){
            if (input.substring(i, i + 3).equals("010")){
                answer++;
                i += 3;
                continue;
            }
            i++;
        }
        System.out.println(answer);
    }
}
