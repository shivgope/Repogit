package NumberSystem;

public class PrintPrimeNumberFrom1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		
		while(n<=100) {
			for(int i = 1; i <= n/2; i++) {
				if(n%i==0) {
					n++;
					break;
				}
				else {
					System.out.println(n);
					n++;
				}
					
			}
		}

	}

}
