package datetime;
import java.time.LocalDate;
import java.time.Month;
public class DateTimeExample
{
	public static void main(String ars[])
	{
		//current date
		LocalDate localDate=LocalDate.now();
		System.out.println("Today's Date is:"+localDate);
		//specific date
		LocalDate localDate2=LocalDate.of(2020,Month.JANUARY,02);
		System.out.println(localDate2);
		LocalDate localDate3=LocalDate.of(1947,Month.AUGUST,15);
		System.out.println(localDate3);
		
		System.out.println("Year :"+localDate.getYear());
		System.out.println("Month :"+localDate.getMonth().getValue());
		System.out.println("Year :"+localDate.getDayOfMonth());
		
		//localDates plus methods
		System.out.println("Addition of days : "+localDate.plusDays(5));
		System.out.println("Addition of months : "+localDate.plusMonths(15));
		System.out.println("Addition of weeks : "+localDate.plusWeeks(45));
		System.out.println("Addition of years : "+localDate.plusYears(5));
		
		//localDates minus methods
		System.out.println("Substraction of days : "+localDate.minusDays(5));
		System.out.println("substraction of months : "+localDate.minusMonths(15));
		System.out.println("Substraction of weeks : "+localDate.minusWeeks(45));
		System.out.println("Substraction of years : "+localDate.minusYears(5));
		
		//isEqual() example
		if(localDate.isEqual(localDate2))
		{
			System.out.println("localDate1 and LocalDate2 are equal");
		}
		else
		{
			System.out.println("localDate1 and LocalDate2 are not equal");
		}
		
		//isAfter() example
		if(localDate2.isAfter(localDate3))
		{
			System.out.println("localDate2 comes after LocalDate3");
		}
		
		//isBefore() example
		if(localDate2.isBefore(localDate))
		{
		    System.out.println("localDate3 comes before LocalDate");
		}
    }
}
