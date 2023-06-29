import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s_arr = {"","","","","","","","","","","","","","",""};
		
		
		
		for(int i=0;i<5;i++) 
		{
			String s = br.readLine();
			
			for(int j=0;j<s.length();j++) 
			{
				s_arr[j]+=s.charAt(j);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s_arr.length;i++) 
		{
			if(s_arr[i]==null) 
			{
				continue;
			}
			else {
				sb.append(s_arr[i]);
			}
			
		}
		
		System.out.println(sb);
		
		
		
		
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	}

}
