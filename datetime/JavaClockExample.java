package datetime;

import java.time.Clock;
import java.time.Duration;
public class JavaClockExample 
{
	public static void main(String args[])
	{
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1.getZone());//get time zone
		Clock c2=Clock.systemUTC();
		System.out.println(c2.instant());//get current instant of GMT
		Duration d=Duration.ofHours(5);// adding 5 hours to GMT to get  zonal time
		//Duration d=Duration.ofMinutes(330);
		Clock clock=Clock.offset(c2, d);
		System.out.println(clock.instant());//printing current zonal time
	}
}
