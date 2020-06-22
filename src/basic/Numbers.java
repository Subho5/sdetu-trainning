package basic;

public class Numbers {
	public static void main(String []args) {
		System.out.println("New Programe");
		
		printName();
		int numA=10;
		int numB= 20;
		addNumber(numA, numB);
		System.out.println(multiplyNumber(numA, numB));
	}
	static void printName() {
		System.out.println("My name is Subhra");
	}
	static void addNumber(int numberA, int numberB ) {
		int sum= numberA + numberB;
		System.out.println("sum of two numbers: "+sum);
	}
	static int multiplyNumber(int valueA, int valueB) {
		int product= valueA*valueB;
		return product;
	}
}
