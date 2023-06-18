import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BillDivision {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int bill[] = new int[n];
        int anna_charged = sc.nextInt();

        System.out.println("n"+n);
        System.out.println("k"+k);
        System.out.println("anna_charged"+anna_charged);
        
        
        for (int i = 0; i < n; i++) {
            bill[i] = sc.nextInt();
        }
        
        int totalAmount = 0;
        int annaAmount = 0;
        for (int i = 0; i < n; i++) {
             totalAmount = totalAmount + bill[i];
             if(n>k){
                 annaAmount = totalAmount - bill[k];
             }
        }
        if(annaAmount == anna_charged){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(anna_charged-annaAmount);
        }
    }
}