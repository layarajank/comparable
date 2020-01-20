package datetime;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class JavazoneIdExample 
{
	public static void main(String args[])
	{
		ZoneId zoneid1=ZoneId.of("Asia/Kolkata");//create zone id object
		ZoneId zoneid2=ZoneId.of("Asia/Tokyo"); 
		LocalTime id1=LocalTime.now(zoneid1);//get zone id
		LocalTime id2=LocalTime.now(zoneid2);
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id1.isBefore(id2));
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		String s=zone.getId();
		System.out.println(s);
		//get Zone id in style TextStyle.FULL
		//Locale for getting specific region
		System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));
	}
}
