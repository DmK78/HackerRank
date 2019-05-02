import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaDateAndTime {


    public static void main(String[] args) {


        System.out.println(findDay(4, 5, 1999));


    }


    public static String findDay(int month, int day, int year) {
        String sDate1 = day + "/" + month + "/" + year;
        Date date1 = new Date();
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            default:
                return "SATURDAY";

        }

    }
}
