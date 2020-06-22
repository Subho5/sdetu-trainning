package basic;

public class Sum {

	public static void main(String[] args) {
		System.out.println(sum(5));
		
		System.out.println(fact(5));
		
		int []numbers = {5,15,-45,68,-123};
		System.out.println(findMin(numbers));
		System.out.println(findMax(numbers));
		System.out.println(findAvg(numbers));
		
	}
	public static int sum(int n) {
		int sum =0;
		for(int i=0;i<= n; i++) {
			sum= sum+i;
		}
		return sum;
	}
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return fact(n-1)*n;
	}
	public static int findMin(int[]arr) {
		int min = arr[0];
		for (int i = 0; i< arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int findMax(int[]arr) {
		int max = arr[0];
		for (int i = 0; i< arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int findAvg(int[]arr) {
		int sum= 0;
		for(int i=0; i< arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	
}
