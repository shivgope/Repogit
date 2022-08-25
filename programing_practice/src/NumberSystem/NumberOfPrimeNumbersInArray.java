package NumberSystem;

public class NumberOfPrimeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 3, 4, 5, 7, 8, 9};
		
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int j = 2;
			while(true) {
				if(n%j==0)
					break;
				else
					j++;
			}
			if(n==j)
				System.out.println(n + " is a prime number");
		}

	}

}
