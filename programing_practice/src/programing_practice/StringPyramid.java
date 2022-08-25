package programing_practice;

public class StringPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india";
		String p = "";
		
		for (int i = 0; i < s.length(); i++) {
			p = p + s.charAt(i);
			System.out.println(p);
		}

	}

}
