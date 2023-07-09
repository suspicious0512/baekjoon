import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		
		
		for(int i=0;i<t;i++) 
		{
			Stack<Character> VPS_stack = new Stack<Character>();
			boolean VPS_check = true;
			String s=br.readLine();
			//System.out.println(s);
			
			for(int j=0;j<s.length();j++) 
			{
				
				if(s.charAt(j)=='(') 
				{
					VPS_stack.add(s.charAt(j));
					//System.out.printf("%d번째 스택입니다 : %s\n",j+1,VPS_stack);
				}
				else if(s.charAt(j)==')') 
				{
					//System.out.printf("%d번째에 ')'에 들어왓습니다\n",j+1);
					if(VPS_stack.size()==0) 
					{
						//System.out.println("사이즈가 0이라 VPS 아닙니다\n");
						VPS_check = false;
					}
					else {
						//System.out.println("pop할게 남아잇어서 VPS 맞습니다\n");
						VPS_stack.pop();
					}
				}
			}
			
			if(VPS_check==false||VPS_stack.size()!=0) 
			{
				System.out.println("NO");
			}
			else 
			{
				System.out.println("YES");
			}
		}
	}
}
