import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br  = new BufferedReader (new InputStreamReader(System.in));
		
		int [] dot_arr = new int [15];
		int start = 3;
		
		for(int i=0;i<15;i++) 
		{
			dot_arr[i]=(int) Math.pow(start, 2);
			start=start+start-1;
		}
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(dot_arr[n-1]);
		
		
	}

}
