package ArrayPractice;

public class Sorting1and0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0, 0, 1, 1, 0, 1, 0};
		int[] b = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0)
				b[count++]=a[i];
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
				b[count++]=a[i];
		}
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
