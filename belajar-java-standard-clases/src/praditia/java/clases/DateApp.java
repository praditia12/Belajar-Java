package praditia.java.clases;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date();
        Date setTanggal = new Date(1490207497000L);

        System.out.println(tanggal);
        System.out.println(setTanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH,Calendar.MARCH);
        calendar.set(Calendar.DATE, 9);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
