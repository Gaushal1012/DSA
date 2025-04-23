
import java.util.*;

public class MedianOfToSortedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer Array-1
        System.out.print("Enter size of array-1: ");
        int intSize = scanner.nextInt();
        int[] intArray = new int[intSize];

        System.out.println("Enter elements of array-1:");
        for (int i = 0; i < intSize; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Integer Array-2
        System.out.print("Enter size of array-2: ");
        int strSize = scanner.nextInt();
        int[] strArray = new int[strSize];

        System.out.println("Enter elements of array-2:");
        for (int i = 0; i < strSize; i++) {
            strArray[i] = scanner.nextInt();
        }

        // Output to verify
        System.out.println("Integer Array-1:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\nString Array-2:");
        for (int j = 0; j < strArray.length; j++) {
            System.out.print(strArray[j] + " ");
        }

        ArrayList<Integer> finalArray = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) {
            finalArray.add(intArray[i]);
        }

        for (int j = 0; j < strArray.length; j++) {
             finalArray.add(strArray[j]);
        }
        
        Collections.sort(finalArray);

        float median;
        if(finalArray.size()%2==0){
            median =  (finalArray.get(finalArray.size()/2 - 1) + finalArray.get(finalArray.size()/2))/2.0f;
        }else{
            median = finalArray.get(((finalArray.size()+ 1)/2)-1);
        }

        System.out.println("\nfinalArray " + finalArray.size());
        System.out.println("\nmedian: " + median);
    }
}
