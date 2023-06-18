public class ReverseNumber {
    public static void main(String[] args) {
        int n = 24331;
        int reverseNum = 0;
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            reverseNum = reverseNum * 10 + temp;
        }
        System.out.println(reverseNum);
    }
}
