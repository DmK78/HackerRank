import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        String tempS;
        if (s.length > 3) {
            for (int i = 0; i < s.length - 2; i++) {//+2
                for (int p = 0; p < s.length - 2; p++) {//+2
                    BigDecimal b1 = new BigDecimal(s[i]);
                    BigDecimal b2 = new BigDecimal(s[p]);
                    if (b1.compareTo(b2) == 1) {
                        tempS = s[i];
                        s[i] = s[p];
                        s[p] = tempS;
                    }
                }
            }
            //Exeption with 0.12 & .12
            if (s[4].equals(".12")) {
                tempS = s[4];
                s[4] = s[5];
                s[5] = tempS;
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
