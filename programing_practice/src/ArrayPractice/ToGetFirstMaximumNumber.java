package ArrayPractice;

public class ToGetFirstMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20, 30, 40, 50, 10};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
			
		}
		System.out.print(a[0] + " ");
	}

}