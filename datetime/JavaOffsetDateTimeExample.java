package datetime;

import java.time.OffsetDateTime;

public class JavaOffsetDateTimeExample 
{
	public static void main(String args[])
	{
		OffsetDateTime offset=OffsetDateTime.now();
		System.out.println(offset.getDayOfMonth());
		System.out.println(offset.getDayOfYear());
		System.out.println(offset.getDayOfWeek());
		System.out.println(offset.toLocalDate());
		OffsetDateTime value1=offset.minusDays(240);
		System.out.println(value1);
		OffsetDateTime value2=offset.plusDays(240);
		System.out.println(value2);
	}

}
