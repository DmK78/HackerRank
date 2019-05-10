import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class D2ArrayDS {
    static int hourglassSum(int[][] arr) {
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
        return maxSum;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
