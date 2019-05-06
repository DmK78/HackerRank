import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        if (s.trim().length() > 0) {

            String res[] = s.trim().split("[ !,?._'@]+");
            System.out.println(res.length);
            for (String str : res) {
                System.out.println(str
                );
            }
        } else System.out.println(0);


    }

}
