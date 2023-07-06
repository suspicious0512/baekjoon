import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{
	public static int is_zero(String st) 
	{
		if(st.length()==0) 
		{
			return 0;
		}
		else 
		{
			return st.length();
		}
		
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ans=0;
		
		while(st.hasMoreTokens()) 
		{
			double n = Double.parseDouble(st.nextToken());
			
			ans+=Math.pow(n, 2);
		}
		
		System.out.println(ans%10);
		
	}

}
