package programing_practice;

public class PrintOccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a2b3c4"; //aabbbcccc
		
		for(int i = 0; i < s.length()-1; ) {//i = 0 0<5, i=2, i=4, i=6
			int n = s.charAt(i + 1) - 48; //n = 2,3,4
			
			while(n>0) {
				System.out.print(s.charAt(i));
				n--;
			}
			i+=2;
		}

	}

}
