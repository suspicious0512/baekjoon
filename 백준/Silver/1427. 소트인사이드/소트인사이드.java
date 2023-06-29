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
		
		ArrayList <Character> n_list = new ArrayList<>();
		
		String s = br.readLine();
		
		for(int i=0;i<s.length();i++) 
		{
			n_list.add(s.charAt(i));
		}
		
		Collections.sort(n_list);
		Collections.reverse(n_list);
		
		for(int i=0;i<n_list.size();i++) {
			System.out.print(n_list.get(i));
		}
		
		
		
		
		
		
		
		
	}

}
