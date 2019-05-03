import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairsCount = 0;
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            //System.out.println("Looking size " + i);
            int size = i;
            for (int p = 0; p < ar.length; p++) {
                if (size == ar[p]) {
                    count++;
                    //      System.out.println("Found coincidence " + count + ", размер " + i);
                    if (count == 2) {
                        pairsCount++;
                        count = 0;
                        //System.out.println("Another one pair!!!");
                    }
                }
            }
            count = 0;

        }
        //System.out.println(pairsCount);
        return pairsCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }

}
