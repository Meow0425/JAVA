
public class real {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		
		input a, b, c;
		
		split a, b, c;


		a, b, c = map(int, input(),split());
		
		print((a + b % c));
		print(((a % c) + (b % c)) % c);
		print ((a * b) % c);
		print (((a % c) * (b % c)) % c);

	}

}
