package Default;

public class Parent {
	
	public static void main (String[] args)
	{
		
		String s = "kranthi";
		String t = "";
		
		for(int i= s.length()-1;i>=0;i--)
		{
			
			t= t+s.charAt(i);
		}
		System.out.println(t);
	}
	

}
