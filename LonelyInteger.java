import java.util.Scanner;

public class LonelyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ai = new int[n];
        int i, j;
        int x = 0;
        boolean state;

        for (i = 0; i < n; i++) {
            ai[i] = in.nextInt();
        }

        for (i = 0; i < n; i++) {
            state = true;
            for (j = 0; j < i; j++) {
                if (ai[i] == ai[j]) {
                    j = i;
                    state = false;
                }
            }
            if (state == true) {
                for (j = i + 1; j < n; j++) {
                    if (ai[i] == ai[j]) {
                        j = n;
                        state = false;
                    }
                }
                if (state == true) {
                    x = i;
                    i = n;
                }
            }
        }

        System.out.println(ai[x]);
    }
}
