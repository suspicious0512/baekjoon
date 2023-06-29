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
		int ans= 0;
		
		for(int i=0;i<n;i++) 
		{
			String s = br.readLine();
			ArrayList<Character> check_list = new ArrayList<>();
			boolean check_bool = true;
			
			for(int j=0;j<s.length();j++) 
			{
				
				
				if(!check_list.contains(s.charAt(j)))
				{
					check_list.add(s.charAt(j));
				}
				else 
				{
					if(check_list.get(check_list.size()-1) ==s.charAt(j)) 
						//check_list에 마지막 문자가 지금 문자랑 같다면
						//그냥 넘어가고
					{
						continue;
					}
					else
						//check_list에 마지막 문자가 지금 문자랑 다르다면
						//그룹단어가 아니므로 check_bool을 false로 바꿈
					{
						check_bool=false;
						
					}
				}
			}
			if(check_bool) 
			{
				ans+=1;
			}
			
		}
		
		System.out.println(ans);
	}

}
