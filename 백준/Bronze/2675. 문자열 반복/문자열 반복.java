import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			String s= st.nextToken();
			
			for(int j=0;j<s.length();j++) 
			{
				for(int k=0;k<p;k++) 
				{
				System.out.printf("%c",s.charAt(j));
				}
			}
			System.out.println();
			
		}

	}

}
