import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    /**
     * Finds the min and max of an array
     * @param arr: array that we need to find min and max of
     */
    static void miniMaxSum(int[] arr) {
        long sum = 0;
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min>arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.print((sum-max) + " ");
        System.out.print(sum-min);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
