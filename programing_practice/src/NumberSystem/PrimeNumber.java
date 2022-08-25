package NumberSystem;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 7;
		int i = 2;
		//boolean a = true;
		for(int n = 1; n<=100; n++) {
		while(true) {
			if(n%i == 0)
				break;
			else
				i++;
		}
		if(n==i)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not prime number");
		}

	}

}
