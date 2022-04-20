
public class Pallindrome {

	public static void main(String[] args) {
		
		String a ="malayalam";
		String rev = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev+=a.charAt(i);
			
		}
		if(rev.equals(a))
		{
			System.out.println("pallindrome");
			
		}
		else
		{
			System.out.println("not pallindrome");
		}

}}