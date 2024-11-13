import java.util.Calendar;

public class AdapterMain {
    public static void main(String[] args) {
        NewDateInterface newDate = new CalendarToNewDateAdapter(Calendar.getInstance());
        newDate.setDay(1);
        newDate.setMonth(1);
        newDate.setYear(2020);
        System.out.println(newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());

        newDate.advanceDays(10);
        System.out.println(newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());
    }
}
