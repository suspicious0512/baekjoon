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
		
		int t = 666;
		
		
		ArrayList <Integer> t_list = new ArrayList<Integer>();
		
		while(t_list.size()<10000) 
		{
			StringBuilder sb = new StringBuilder();
			sb.append(t);
			//System.out.println(sb.toString());
			if(sb.toString().contains("666")) 
			{
				//System.out.println("들어옴");
				t_list.add(t);
				//System.out.println(t_list);
				t+=1;
				//System.out.println(t);
			}
			else {
				t+=1;
				continue;
			}
			
			
		}
		
		System.out.println(t_list.get(n-1));
		
	}

}
