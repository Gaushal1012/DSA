import java.util.Scanner;

public class AlmostSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i+1] >= arr[i]) {
                temp++;
            }
            if(arr[i+1] < arr[i]) {
                
            }
        }

        if(temp==n) {
            System.out.println('yes');
        }
    }
}
