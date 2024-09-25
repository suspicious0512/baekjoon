import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) throws IOException
	{
		Stack<Integer> stack_ans = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		for (int i=0;i<n;i++) 
		{
			String s= br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int temp = Integer.parseInt(st.nextToken());

			if(temp==1) 
			{
				//bw.write("1번 실행\n");
				int putNum = Integer.parseInt(st.nextToken());
				stack_ans.add(putNum);
				//bw.write("1번 종료\n");
			}

			else if (temp==2) 
			{
				//bw.write("2번 실행\n");
				if(!stack_ans.isEmpty()) 
				{
					bw.write(String.valueOf(stack_ans.pop()+"\n"));
				}
				else 
				{
					bw.write("-1\n");
				}
				//bw.write("2번 종료\n");
			}
			else if (temp==3) 
			{
				//bw.write("3번 실행\n");
				bw.write(String.valueOf(stack_ans.size()+"\n"));
				//bw.write("3번 종료\n");
			}
			else if (temp==4) 
			{
				//bw.write("4번 실행\n");
				if(stack_ans.isEmpty()) 
				{
					bw.write("1\n");
				}
				else {
					bw.write("0\n");
				}
				//bw.write("4번 종료\n");
			}
			else if (temp==5) 
			{
				//bw.write("5번 실행\n");
				if(!stack_ans.isEmpty()) 
				{
					bw.write(String.valueOf(stack_ans.peek())+"\n");
				}
				else {
					bw.write("-1\n");
				}
				//bw.write("5번 종료\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
