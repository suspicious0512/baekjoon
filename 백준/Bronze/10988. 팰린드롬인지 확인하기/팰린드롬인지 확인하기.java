import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String reversed_s = "";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			reversed_s+=s.charAt(i);
		}
		
		//System.out.println(s);
		//System.out.println(reversed_s);
		
		if(reversed_s.equals(s)) 
		{
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
