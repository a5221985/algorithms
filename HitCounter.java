import java.util.Date;
import java.text.SimpleDateFormat; // **(M)**
import java.text.ParseException;

public class HitCounter {
    public static void main(String[] args) throws ParseException {
        HitCounter hc = new HitCounter();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy @ hh:mm:ss");
        String timestamp = sdf.format(date);
        Date date2 = sdf.parse("22 May, 1985 @ 06:00:00");
        String timestamp2 = sdf.format(date2);
        System.out.println(timestamp);
        System.out.println(date2);
        System.out.println(timestamp2);
        //hc.record(timespamp);
    }
}
