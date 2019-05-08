import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String aStr = sc.nextLine();
        String bStr = sc.nextLine();
        BigInteger a=new BigInteger(aStr);
        BigInteger b=new BigInteger(bStr);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
