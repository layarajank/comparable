package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 
{
	public static void main(String[] args)
	{
		Pattern pattern=Pattern.compile("Fa[a-z]e");
		Matcher m=pattern.matcher("Fake");
		if(m.find())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(Pattern.matches("Fa[ac]e","Fabe"));// false only a or c is allowed here b has came
		System.out.println(Pattern.matches("Do\\[","Do["));//true
		System.out.println(Pattern.matches("Do[\\[\\]]","Do]"));//true([ or ])
		System.out.println(Pattern.matches("Hi\\d","Hi5"));//true (represents digit)
		System.out.println(Pattern.matches("Hi\\D","Hi5"));//false (represents non digits)
		System.out.println(Pattern.matches("Hello\\sWorld","Hello World"));//true (represents white space character)
		System.out.println(Pattern.matches("Hello\\SWorld","Hello World"));//false (represents non white space character
		System.out.println(Pattern.matches("Hi\\wWorld","Hi5World"));//true(represents word character)
		System.out.println(Pattern.matches("Hi\\WWorld","Hi5World"));//false(represents non word character)
		Pattern p1=Pattern.compile("\\A[a-zA-z]");//range of characters from a to z and A to Z
		Matcher m1=p1.matcher("Be strong");
		while(m1.find())
			System.out.println(m1.group());//prints B		
	}
}
