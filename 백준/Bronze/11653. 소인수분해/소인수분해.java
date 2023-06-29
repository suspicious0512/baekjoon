import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//11653
public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int t = 2;
		
		while(a>1) 
		{
			
			if(a%t==0) 
			{
				a=a/t;
				System.out.println(t);
			}
			else {
				t+=1;
			}
		}
	}

}
