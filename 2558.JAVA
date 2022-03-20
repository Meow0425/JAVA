import java.util.Scanner;
public class Muti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int sum = num1 * num2 ;
		
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2/10) % 10));
		System.out.println(num1 * num2/100);
		System.out.println(sum);
		
		
	}

}
