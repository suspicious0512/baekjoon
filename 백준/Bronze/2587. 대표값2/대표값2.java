import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <Integer> n_list = new ArrayList<Integer>();
		for (int i=0;i<5;i++) 
		{
			int n = Integer.parseInt(br.readLine());
			n_list.add(n);
		}
		
		//System.out.println(n_list);
		
		Collections.sort(n_list);
		
		//System.out.println(n_list);
		
		
		
		int avg = 0;
		
		for(int i=0;i<n_list.size();i++) 
		{
			avg+=n_list.get(i);
		}
		
		System.out.println(avg/5);
		System.out.println(n_list.get(2));
	}

}
