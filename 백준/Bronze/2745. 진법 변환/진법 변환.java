import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main 
{

    public static void main(String[] args) 
    {
        //1. 숫자 n과 진법수 b를 String n과 int b에 입력받는다.
    	//2. 10진수로 바꾼 수를 저장할 int ans를 만든다.
    	//3. 알파벳을 입력받으면 대응하는 숫자를 int str_n에 넣는다.
    	//4. 반복문에서 n의 길이에서 1씩 줄어들면서 B^n의 길이*z를 계산해서 ans에 더한다.
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = null;
    	
        try {
            st = new StringTokenizer(br.readLine());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
            
        }
        
        
    	String s = st.nextToken();
    	int b = Integer.parseInt(st.nextToken());
    	
    	long ans =0;
    	
    	ArrayList<Integer> s_list = new ArrayList<Integer>();
    	
    	
    	
    	for(int i=0;i<s.length();i++) 
    	{
    		if(s.charAt(i)>=65&&s.charAt(i)<=90) 
    		{
    			s_list.add(((int)(s.charAt(i))-55));
    		}
    		else 
    		{
    			s_list.add(((int)(s.charAt(i))-48));
    		}
    		
    	}
    	
    	Collections.reverse(s_list);
    	
    	for(int i=0;i<s_list.size();i++)
    	{
    		ans+=Math.pow(b,i)*s_list.get(i);
    	}
    	
    	
    	
    	//System.out.println(s_list);
    	if(ans<=1000000000)
    	System.out.println(ans);
    	
    	


    }

}