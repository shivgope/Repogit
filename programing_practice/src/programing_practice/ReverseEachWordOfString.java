package programing_practice;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to bangalore";
		String[] a = s.split(" ");
		
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			String p = a[i];
			String rev = "";
			for (int j = p.length()-1; j >= 0; j--) {
				rev = rev + p.charAt(j);
			}
			System.out.print(rev + " ");
		}
		
		

	}

}
