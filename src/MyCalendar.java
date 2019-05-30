import java.util.Calendar;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2017, 5 - 1, 23, 0, 0);
        int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
//        String dayOfWeekStr = String.valueOf(dayOfMonth);
        String day;
        switch (dayOfWeek) {
            case 1:
                day = "SUNDAY";
                System.out.println(day);
                break;
            case 2:
                day = "MONDAY";
                System.out.println(day);
                break;
            case 3:
                day = "TUESDAY";
                System.out.println(day);
                break;
            case 4:
                day = "WEDNESDAY";
                System.out.println(day);
                break;
            case 5:
                day = "THURSDAY";
                System.out.println(day);
                break;
            case 6:
                day = "FRIDAY";
                System.out.println(day);
                break;
            case 7:
                day = "SATURDAY";
                System.out.println(day);
                break;
            default:
                break;
        }
//        System.out.println(String.valueOf(dayOfWeekStr));
    }
}
