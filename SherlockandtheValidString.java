import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SherlockandtheValidString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list1.add(s.charAt(i));
        }

        for (int i = 0; i < list1.size(); i++) {
            int temp = 1;
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i) == list1.get(j)) {
                    temp++;
                    list1.remove(j);
                }
            }
            list2.add(temp);
        }

        int ans = 0;
        String result = "";

        for (int i = 0; i < list2.size(); i++) {
            for (int j = i + 1; j < list2.size(); j++) {
                if ((list2.get(j) - list2.get(i)) == 1) {
                    ans++;
                    if (ans > 1) {
                        result = "NO";
                    } else {
                        result = "YES";
                    }
                }
                if ((list2.get(j) - list2.get(i)) == 0) {
                    result = "YES";
                }
                if ((list2.get(j) - list2.get(i)) > 1) {
                    result = "NO";
                }
            }
            ans = 0;
        }

        System.out.println(list1.size());
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(result);
    }
}
