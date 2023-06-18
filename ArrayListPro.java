import java.util.*;

public class ArrayListPro {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");// Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Printing the arraylist object
        System.out.println(list);
        list.set(2, "Pinepple");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.contains("Mango"));
    }
}
