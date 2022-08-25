package ArrayPractice;

public class ToGetSumOfFirstThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20, 30, 40, 50, 10};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
			
		}
		for(int i = 0; i < 3; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

	}

}
