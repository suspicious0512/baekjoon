import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		ArrayList<Integer> x_list = new ArrayList<Integer>();
		ArrayList<Integer> y_list = new ArrayList<Integer>();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<3;i++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(x_list.contains(a)) 
			{
				x_list.remove(Integer.valueOf(a));
			}
			else {
				x_list.add(a);
			}
			
			if(y_list.contains(b)) 
			{
				y_list.remove(Integer.valueOf(b));
			}
			else {
				y_list.add(b);
			}
			
		
				
		}
		
		System.out.printf("%d %d",x_list.get(0),y_list.get(0));
		
		
		

	}

}
