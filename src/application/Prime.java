package application;

public class Prime {
	
	public static boolean isPrime(int num) {
		double squared = Math.sqrt(num);
		boolean isPrime = true;
		
		if (num <= 1) {
			isPrime = false;
			return isPrime(num);
		} else {
			for(int i = 2; i <= num/2; i++) {
				if((num % i) == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}
