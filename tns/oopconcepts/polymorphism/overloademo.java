public class overloademo{

	public int add(int a,int b) {
		int result=a+b;
		return result;
	}
	
	public float add(float a,float b,float c) {
		float result=a+b+c;
		return result;
	}
	
	public double add(double a,double b) {
		double result=a+b;
		return result;
	}
	
	public static void main(String[] args) {
		overloademo ob=new overloademo();
		System.out.println("the addition of integer values"+ob.add(10, 20));
		System.out.println("the addition of float values"+ob.add(1.2f, 1.3f, 1.7f));
		System.out.println("the addition of double values"+ob.add(1.23, 2.34));
	}

}

