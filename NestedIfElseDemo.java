
public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=14, 
        b=25, 
        c=1;
		System.out.println("The largest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
		}

	}
}
