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
		
		int n = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(st.nextToken());
		ArrayList <Integer> measure_list = new ArrayList<Integer>();
		
		
		for(int i=1;i<n;i++) 
		{
			if(n%i==0) 
			{
				measure_list.add(i);
			}
		}
		
		measure_list.add(n);
		//System.out.println(measure_list);
		if(measure_list.size()>=m) 
		{
			System.out.println(measure_list.get(m-1));
		}
		else {
			System.out.println("0");
		}
		

	}

}
