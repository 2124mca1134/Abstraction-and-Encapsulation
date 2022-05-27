package fundamental;
interface Icalcu{
	public int add(int a, int b);
	
	public int sub(int a, int b);
	
	public int multipli(int a, int b);
	
	public int min(int a, int b);
}
 
 class Calculator implements Icalcu{
	int a,b;
	public int add(int a, int b) {
		System.out.println("Addition of "+a+"and"+b);
		return a+b;
	}
	
	public int sub(int a, int b) {
		System.out.println("Subtraction of "+a+"and"+b);
		return a-b;
	}
	public int multipli(int a, int b) {
		System.out.println("Multiplication of " +a+ "and"+b);
		return a*b;
	}
	public int min(int a, int b) {
		System.out.println("Greater than between "+a+ "and"+b);
		if(a<b)
			return a;
		else
			return b;
	}
	//
	}
public class DemoCalculator {

	public static void main(String[] args) {
		Calculator ob1 = new Calculator();
		System.out.println(ob1.add(10,5));
		System.out.println(ob1.sub(10, 6));
		System.out.println(ob1.multipli(10, 3));
		System.out.println(ob1.min(8, 5));
		//System.out.println(ob1.crossSum(5));

	}

}
