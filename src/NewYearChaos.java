import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        boolean chaotic = false;
        int count = 0;
        int counNew = 0;
        int mod = 0;
        for (int i = 0; i < q.length; i++) {
            //System.out.print((q[i]-1-i)+" ");
            mod = q[i] - (i + 1);

            if (mod > 2 && q[i] > i) {
                chaotic = true;
                //break;
            }

            if (mod > 0) {
                counNew += mod;

            }
            /*if (mod < -1) {
                counNew++;
            }*/


        }
        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            /*int temp;
            int n=q.length;
            for (int p = 0; p < n; p++) {
                for (int i = 1; i < (n); i++) {
                    if (q[i-1] > q[i]) {
                        temp = q[i-1];
                        q[i-1] = q[i];
                        q[i] = temp;
                        count++;
                        break;
                    }
                }
            }*/

            System.out.println(counNew);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {//<=
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
