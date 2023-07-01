import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{


	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float subject_count = 0;
		float score_grade = 0;
		
		for(int t=0;t<20;t++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String subject = st.nextToken();
			//System.out.println(subject);
			double score = Double.parseDouble(st.nextToken());
			//System.out.println(score);
			String grade = st.nextToken();
			//System.out.println(grade);
			
			subject_count+=score;
			
			if(grade.equals("P")) 
			{
				subject_count-=score;
				continue;
			}
			else if(grade.equals("F"))
			{
				score_grade+=score*0.0;
			}
			else if(grade.equals("D0"))
			{
				score_grade+=score*1.0;
			}
			else if(grade.equals("D+")) 
			{
				score_grade+=score*1.5;
			}
			else if(grade.equals("C0")) 
			{
				score_grade+=score*2.0;
			}
			else if(grade.equals("C+")) 
			{
				score_grade+=score*2.5;
			}
			else if(grade.equals("B0")) 
			{
				score_grade+=score*3.0;
			}
			else if(grade.equals("B+")) 
			{
				score_grade+=score*3.5;
			}
			else if(grade.equals("A0")) 
			{
				score_grade+=score*4.0;
			}
			else if(grade.equals("A+"))
			{
				score_grade+=score*4.5;
			}
			else {
				System.out.println("쳐 맞는게 없네요");
			}
			
			//System.out.printf("%s : %.4f\n",subject,score_grade);
		
		}
		//System.out.println(subject_count);
		System.out.println(score_grade/subject_count);
		
		
	}

}
