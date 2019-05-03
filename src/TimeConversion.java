import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    // 07:05:45PM
    static String timeConversion(String s) {
        StringBuilder time = new StringBuilder();
        boolean isPm = s.contains("PM");
        int hour = Integer.parseInt(s.substring(0, 2));
        String hourStr = "";
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);
        if (isPm) {
            if (hour < 12) {
                hour += 12;
                hourStr = String.valueOf(hour);
            } else {
                hourStr = String.valueOf(hour);
            }
        } else if (hour == 12) {
            hourStr = "00";
        } else hourStr = "0" + String.valueOf(hour);


        time.append(hourStr).append(":").append(minutes).append(":").append(seconds);
        System.out.println(time);

        return time.toString();

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        //bw.write(result);
        //bw.newLine();

        //bw.close();
    }

}
