package mavendemo.junittest;

public class App 
{
    	public static String rem(String string) 
    	{
    		String sub=string.substring(0,2);
    		sub=sub.replaceAll("A","");
    		String replace=string.substring(2);
    		sub=sub+replace;
    		return sub;
    	}
}
