package basic;

public class Weather {
	public static void main(String[]args) {
		int temparetre = 30;
		String sunCondition ="Sunny";
		if(temparetre > 35) {
			System.out.println("It's a very hot day");
		}
		else if((temparetre > 25) && (sunCondition=="Sunny")) {
			System.out.println("A very plesent weather");
			System.out.println("Too much fun");
		}
		else if((temparetre > 15) || (sunCondition=="overcast") ) {
			System.out.println("Take umbrella with you!");
		}
		else {
			System.out.println("Winter is here!");
		}
	}
}
