import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int maxInd = 0;
        int minInd = 0;
        long max = arr[0];
        long min = arr[0];
        long sumMax = 0;
        long sumMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxInd = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minInd = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != maxInd) {
                sumMin += arr[i];
            }
            if (i != minInd) {
                sumMax += arr[i];
            }

        }
        System.out.println(sumMin + " " + sumMax);


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
