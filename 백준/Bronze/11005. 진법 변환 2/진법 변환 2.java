import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br  = new BufferedReader (new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		ArrayList <Integer> arithmetic_list = new ArrayList<Integer> ();
		
		
		while(n>0) 
		{
			arithmetic_list.add(n%b);
			n/=b;

		}
		
		Collections.reverse(arithmetic_list);
		
		for(int i=0;i<arithmetic_list.size();i++) 
		{
			if(arithmetic_list.get(i)<10) 
			{
				System.out.print(arithmetic_list.get(i));
			}
			else {
				System.out.print((char)(arithmetic_list.get(i)+55));
			}
		}
		
		
		
	}

}
