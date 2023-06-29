import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) 
		{
			String s = br.readLine();
			sb= new StringBuilder();
			sb.append(s.charAt(0));
			sb.append(s.charAt(s.length()-1));
			System.out.println(sb);
			
		}
		
		
		
		
		
		
		
		
	}

}
