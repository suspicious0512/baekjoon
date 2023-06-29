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
		ArrayList <Integer> x_list = new ArrayList<Integer>();
		ArrayList <Integer> y_list = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			x_list.add(x);
			y_list.add(y);
		}
		
		//System.out.println(x_list);
		//System.out.println(y_list);
		
		int max_x = -10001;
		int min_x = 10001;
		int max_y = -10001;
		int min_y = 10001;
		
		for(int i=0;i<x_list.size();i++) {
			if(x_list.get(i)>max_x) {
				max_x = x_list.get(i);
			}
		}
		for(int i=0;i<x_list.size();i++) {
			if(x_list.get(i)<min_x) {
				min_x = x_list.get(i);
			}
		}
		
		for(int i=0;i<y_list.size();i++) {
			if(y_list.get(i)>max_y) {
				max_y = y_list.get(i);
			}
		}
		for(int i=0;i<y_list.size();i++) {
			if(y_list.get(i)<min_y) {
				min_y = y_list.get(i);
			}
		}
		
		//System.out.printf("max_x : %d\n",max_x);
		//System.out.printf("min_x : %d\n",min_x);
		//System.out.printf("max_y : %d\n",max_y);
		//System.out.printf("min_y : %d\n",min_y);
		
		System.out.println((max_x-min_x)*(max_y-min_y));

	}

}
