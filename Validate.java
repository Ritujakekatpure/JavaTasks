import java.util.regex.*;
class Validate  
{	public static boolean checkPin(String mypin)
	{
		 String pinformat= "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		 if(mypin==null)return false; 
		 Pattern p = Pattern.compile(pinformat);
		 Matcher m=p.matcher(mypin);
		 return m.matches();
	}
	public static void main(String a[])
	{
	String mypin=a[0];	
	System.out.println("Pin is="+checkPin(mypin));
	}
	
}