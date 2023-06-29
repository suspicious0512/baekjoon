import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int ans=0;
		
		for(int i=0;i<s.length();i++) 
		{
			if(65<=(int)s.charAt(i)&&(int)s.charAt(i)<=67) 
			{
				ans+=3;
			}
			else if(68<=(int)s.charAt(i)&&(int)s.charAt(i)<=70) 
			{
				ans+=4;
			}
			else if(71<=(int)s.charAt(i)&&(int)s.charAt(i)<=73) 
			{
				ans+=5;
			}
			else if(74<=(int)s.charAt(i)&&(int)s.charAt(i)<=76) 
			{
				ans+=6;
			}
			else if(77<=(int)s.charAt(i)&&(int)s.charAt(i)<=79) 
			{
				ans+=7;
			}
			
			else if(80<=(int)s.charAt(i)&&(int)s.charAt(i)<=83) 
			{
				ans+=8;
			}
			else if(84<=(int)s.charAt(i)&&(int)s.charAt(i)<=86) 
			{
				ans+=9;
			}
			else if(87<=(int)s.charAt(i)&&(int)s.charAt(i)<=90) 
			{
				ans+=10;
			}
			else 
			{
				continue;
			}
			
		}
		
		System.out.println(ans);
		
		
		
	}

}
