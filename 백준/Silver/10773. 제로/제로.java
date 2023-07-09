import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList <Integer> num_list = new ArrayList <Integer> ();
		int ans = 0;
		
		for(int i=0;i<n;i++) 
		{
			int m = Integer.parseInt(br.readLine());
			if(m==0) 
			{
				num_list.remove(num_list.size()-1);
			}
			else {
				num_list.add(m);
			}
		}
		
		for(int i=0;i<num_list.size();i++) 
		{
			ans+=num_list.get(i);
		}
		
		System.out.println(ans);

	}

}
