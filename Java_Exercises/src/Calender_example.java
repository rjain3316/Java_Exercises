import java.util.Calendar;

public class Calender_example {

	public static void main(String[] args) {

		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
