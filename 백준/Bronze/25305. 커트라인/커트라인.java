import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList <Integer> n_list = new ArrayList<Integer>();
		
		int x = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for (int i=0;i<x;i++) 
		{
			int n = Integer.parseInt(st.nextToken());
			n_list.add(n);
		}
		
		Collections.sort(n_list);
		Collections.reverse(n_list);
		
		Set <Integer> n_set = new HashSet<Integer>();
		
		System.out.println(n_list.get(n_set.size()+k-1));
	}

}
