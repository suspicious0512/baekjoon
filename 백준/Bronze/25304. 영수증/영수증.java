
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int howmany = sc.nextInt();
		int howmuch = 0;
		
		for(int i=0;i<howmany;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			howmuch += a*b;
		}
		
		if(howmuch==total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		

	}

}