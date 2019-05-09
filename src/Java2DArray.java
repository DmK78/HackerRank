import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java2DArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int maxSum = -81;
        int currentSum = 0;
        for (int y = 0; y < arr.length - 2; y++) {
            for (int x = 0; x < arr.length - 2; x++) {
                currentSum += arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x + 1][y + 1] + (arr[x+2][y ] + arr[x + 2][y + 1] + arr[x + 2][y + 2]);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                currentSum = 0;
            }
        }
        System.out.println(maxSum);

    }
}

