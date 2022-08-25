package ArrayPractice;


public class UniqueNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] b = {11, 22, 3, 4, 5, 6, 7, 8};
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b[i])
				count++;
			else
				System.out.println(a[i] + " , " + b[i]);
		}
		System.out.println(count + " common numbers are there");
	}

}
