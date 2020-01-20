package dateClassical;
import java.util.Calendar;

public class JavaCalenderExample 
{
	public static void main (String args[])
	{
		Calendar calendar = Calendar.getInstance();
		System.out.println("The current date is :"+calendar.getTime());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15 days ago : "+calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4 months later : "+calendar.getTime());
		calendar.add(Calendar.YEAR,2);
		System.out.println(" 2 years later : "+calendar.getTime());
		System.out.println("at present calendar's year : "+calendar.get(Calendar.YEAR));
		System.out.println("at present calendar's day : "+calendar.get(Calendar.DATE));
		System.out.println("at present date and time is : "+(calendar.getTime()));
		int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("maximum number of days in a week : "+maximum);
		int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("maximum number of days in a week : "+minimum);
		minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("maximum number of weeks in a year : "+minimum);
		
		
		
		
		
		
	}

}
