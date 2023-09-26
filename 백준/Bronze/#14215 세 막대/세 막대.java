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
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		while(!(a+b>c&&b+c>a&&c+a>b)) 
		{
			ArrayList<Integer> n_list = new ArrayList<Integer>();
			n_list.add(a);
			n_list.add(b);
			n_list.add(c);
			
			int max = 0;
			int max_index=0;
			
			for(int i=0;i<3;i++) 
			{
				if(max<n_list.get(i)) 
				{
					max=n_list.get(i);
					max_index=i;
				}
			}
			
			if(max_index==0) 
			{
				a-=1;
			}
			else if(max_index==1) 
			{
				b-=1;
			}
			else if(max_index==2) 
			{
				c-=1;
			}
		}
		
		System.out.println(a+b+c);
		

	}

}
