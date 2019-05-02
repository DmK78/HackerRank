import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat formatted = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatted.format(payment);
        formatted = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatted.format(payment);
        formatted = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatted.format(payment);

        Locale indian = new Locale("en", "IN");
        NumberFormat indianFormat = NumberFormat.getCurrencyInstance(indian);
        String india = indianFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
