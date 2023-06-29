import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static int length(String s) 
	{
		if(s ==null) return 0;
		return s.length();
	}

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<100;i++) 
		{
			String s = br.readLine();
			
			if(length(s)!=0) 
			{
				sb.append(s);
				sb.append("\n");
			}
			else {
				break;
			}
		}
		
		
		
		System.out.println(sb);
		
	}

}
