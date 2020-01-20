package datetime;

import java.time.LocalTime;

public class TimeExample1
{
	public static void main(String args[])
	{
		//current time
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		//specific Time
		LocalTime localTime2=LocalTime.of(4,30,45);
		System.out.println(localTime2);
		System.out.println("Hour : "+localTime.getHour());
		System.out.println("Minute : "+localTime.getMinute());
		System.out.println("Second : "+localTime.getSecond());
		
		//LocalTime's plus methods
		System.out.println("Addition of hours : "+localTime.plusHours(2));
		System.out.println("Addition of minutes : "+localTime.plusMinutes(30));
		System.out.println("Addition of seconds : "+localTime.plusSeconds(20));
		System.out.println("Addition of nanos : "+localTime.plusNanos(60000));
    		
		//LocalTime's minus methods
		System.out.println("Subtraction of hours : "+localTime.minusHours(2));
		System.out.println("Subtraction of minutes : "+localTime.minusMinutes(30));
		System.out.println("Subtraction of seconds : "+localTime.minusSeconds(20));
		System.out.println("Subtraction nanos : "+localTime.minusNanos(60000));
		
		LocalTime localTime3=LocalTime.of(11, 45,20);
		
		//compareTo() example
		if(localTime.compareTo(localTime2)==0)
		{
			System.out.println("localTime and localTime2 are equal");
		}
		else
		{
			System.out.println("loca1Time and localTime2 are not equal");
		}	
		    	
		//isBefore() example
		if(localTime2.isBefore(localTime3))
		{
			System.out.println("localTime2 comes before localTime3");
		}
		
		//isAfter() example
		if(localTime3.isAfter(localTime))
		{
			System.out.println("localTime3 comes before localTime");
		}
	}
}
