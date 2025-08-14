public class operatorsdemo {
	public static void main(String args[]) {
		int a = 5;
		int b = 10;
		int x = 20;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a;
		int c = ++a + b + a--;
		System.out.println("c value after the operations: " + c);

		int d = c++ + a + b--;
System.out.println("d value after the operations: " + d);
System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);	
//Ternary operator demonstration
		x = (10 == x) ? 1 : 0;	
System.out.println(x);
	}
}


