import java.util.Scanner;

public class Main {
		int x, y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		int before = 45;
		int result;
		
		if(y>=before) {
			result=y-before;
			System.out.println(x + "" + result);
		}
		else {
			result=y+60-before;
			if(x==0); {
				System.out.println(23+""+result);
			}
			
			else System.out.println(x-1+""+result);
		}
		}
		
}
