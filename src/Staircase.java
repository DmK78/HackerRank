import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        StringBuilder line = new StringBuilder();
        for (int p = 1; p <= n; p++) {
            for (int i = n; i > p; i--) {
                line.append(" ");
            }
            for (int t = 0; t < p; t++) {
                line.append("#");
            }

            System.out.println(line);
            line.delete(0, line.length());
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
