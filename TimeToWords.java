import java.util.StringTokenizer;

public class TimeToWords {
    private String[] timeToText = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    public String convert(String time) {
        StringTokenizer st = new StringTokenizer(time, ":");
        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());
        if (minutes == 0)
           return timeToText[hours - 1] + " o' clock";
        if (minutes == 1)
           return timeToText[minutes - 1] + " minute past " + timeToText[hours - 1];
        if (minutes == 15)
           return timeToText[minutes - 1] + " past " + timeToText[hours - 1];
        if (minutes < 21)
           return timeToText[minutes - 1] + " minutes past " + timeToText[hours - 1];
        if (minutes < 30)
           return timeToText[minutes / 10 * 10 - 1] + " " + timeToText[minutes % 10 - 1] + " minutes past " + timeToText[hours - 1];
        if (minutes == 30)
           return "half past " + timeToText[hours - 1];
        if (minutes == 59)
           return "one minute to " + timeToText[hours];
        if (minutes == 45)
           return timeToText[59 - minutes] + " to " + timeToText[hours];
        if (minutes >= 40)
           return timeToText[59 - minutes] + " minutes to " + timeToText[hours];
        if (minutes < 40) {
           int minutes2 = 60 - minutes;
           return timeToText[minutes2 / 10 * 10 - 1] + " " + timeToText[minutes2 % 10 - 1] + " minutes to " + timeToText[hours];
        }
        return "";
    }

    public static void main(String[] args) {
        TimeToWords ttw = new TimeToWords();
        System.out.println(ttw.convert("5:00"));
        System.out.println(ttw.convert("5:01"));
        System.out.println(ttw.convert("5:10"));
        System.out.println(ttw.convert("5:15"));
        System.out.println(ttw.convert("5:30"));
        System.out.println(ttw.convert("5:40"));
        System.out.println(ttw.convert("5:45"));
        System.out.println(ttw.convert("5:47"));
        System.out.println(ttw.convert("5:28"));
        System.out.println(ttw.convert("6:35"));
    }
}
