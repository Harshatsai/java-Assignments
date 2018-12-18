package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean name1(String sname)
	{
		Pattern p=Pattern.compile("[A-Z],[a-z],{2,5}");
		Matcher m=p.matcher(sname);
		  return m.matches();
		
	}
	public boolean dept1(String sdept)
	{
		Pattern p=Pattern.compile("[A-Z],[a-z],{3,6}");
		Matcher m=p.matcher(sdept);
		  return m.matches();
		
	}
	public boolean id1(String sid)
	{
		Pattern p=Pattern.compile("[0-9],[1-8],{8}");
		Matcher m=p.matcher(sid);
		  return m.matches();
		
	}
	

}
