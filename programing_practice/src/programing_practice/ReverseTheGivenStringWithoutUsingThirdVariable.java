package programing_practice;

public class ReverseTheGivenStringWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India";
		for(int i = s.length()-1; i >= 0; i-- ) {
			System.out.print(s.charAt(i));
		}

	}

}
