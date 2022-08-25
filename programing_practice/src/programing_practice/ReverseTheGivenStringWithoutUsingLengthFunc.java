package programing_practice;

public class ReverseTheGivenStringWithoutUsingLengthFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India";
		//			01234
		String rev = "";
		int count = s.compareTo(rev);
		for(int i = count - 1; i >= 0; i-- ) {
			
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

	}

}
