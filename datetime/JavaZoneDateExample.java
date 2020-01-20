package datetime;

import java.time.*;
import java.time.Month;

public class JavaZoneDateExample 
{
	public static void main(String[] args)
	{
		ZonedDateTime zone =ZonedDateTime.parse("2020-01-03T10:00:10+05:30[Asia/Kolkata]");
		System.out.println(zone);
		LocalDateTime Idt=LocalDateTime.of(2020,Month.JANUARY, 03, 10, 26);
		ZoneId india=ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1=ZonedDateTime.of(Idt,india);
		System.out.println("In India Central time zone: "+zone1);
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone2=zone1.withZoneSameInstant(tokyo);
		System.out.println("In India Central time zone: "+zone2);
		ZonedDateTime zone3=ZonedDateTime.now();
		ZonedDateTime m=zone3.minus(Period.ofDays(126));
		System.out.println(m);
		ZonedDateTime p=zone3.plus(Period.ofDays(126));
		System.out.println(p);
	}
}