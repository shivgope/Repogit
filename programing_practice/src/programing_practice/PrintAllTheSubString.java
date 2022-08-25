package programing_practice;

public class PrintAllTheSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome";
		for (int i = 0; i < s.length(); i++) {
			String count = "";
			for (int j = i; j < s.length(); j++) {
				count = count + s.charAt(j);
				System.out.println(count);
			}
//			for (int j = i+1; j <= s.length(); j++) {
//				System.out.println(s.substring(i, j));
//			}
		}

	}

}
