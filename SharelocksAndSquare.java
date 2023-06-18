import java.math.*;

public class SharelocksAndSquare {
    public static void main(String[] args) {
        int a = 24;
        int b = 48;
        double e = a;
        double f = b;
        // System.out.println(e);
        // System.out.println(f);
        double c = Math.sqrt(e);
        double d = Math.sqrt(f);
        int g = (int) c;
        int h = (int) d;
        int ans = h - g;
        System.out.println(g);
        System.out.println(h);

        if (c - g == 0) {
            // ans = Math.abs(g - h + 1);
            System.out.println(ans + 1);
        } else {
            System.out.println(Math.abs(ans));
        }

    }
}
