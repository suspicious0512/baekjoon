import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList <Integer> basket_list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) 
		{
			basket_list.add(i+1);
		}
		
		//System.out.println(basket_list);
		
		
		for(int i=0;i<m;i++) 
		{
			
			ArrayList <Integer> ans_list = new ArrayList<Integer>();
			//ans_list.addAll(basket_list);
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			List<Integer> reverse_list = basket_list.subList(a-1, b);
			Collections.reverse(reverse_list);
			
			//System.out.printf("reverse_list : %s\n",reverse_list);
			//System.out.printf("%d번째 돔\n",i);
			/*
			for(int j=a-1;j<reverse_list.size();j++) 
			{
				ans_list.set(j,reverse_list.get(i));
			}
			*/
		}
		
		for(int ans : basket_list)
		{
			System.out.printf("%d ",ans);
		}
		

	}

}
