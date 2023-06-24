import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        for (int i = 0; i < grid.size() - 2; i++) {
            String first = grid.get(i);
            String medium = grid.get(i + 1);
            String last = grid.get(i + 2);
            for (int j = 1; j < first.length() - 1; j++) {
                char firstChar = first.charAt(j);
                char mediumChar = medium.charAt(j);
                char mediumLeftChar = medium.charAt(j - 1);
                char mediumRightChar = medium.charAt(j + 1);
                char lastChar = last.charAt(j);
                if (mediumChar > firstChar && mediumChar > mediumLeftChar
                        && mediumChar > mediumRightChar && mediumChar > lastChar) {
                    medium = medium.substring(0, j) + 'X' + medium.substring(j + 1);
                }
            }
            grid.set(i + 1, medium);
        }
        return grid;
    }

}

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String gridItem = bufferedReader.readLine();
            grid.add(gridItem);
        }

        List<String> result = Result.cavityMap(grid);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
