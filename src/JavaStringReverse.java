import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalidrome = true;
        for (int i = 0; i < A.length() / 2; i++) {

            if (A.charAt(i) == A.charAt(A.length() - i-1)) {
                isPalidrome = true;
            } else isPalidrome = false;

        }
        if (isPalidrome) {
            System.out.println("Yes");
        } else System.out.println("No");

    }

}
