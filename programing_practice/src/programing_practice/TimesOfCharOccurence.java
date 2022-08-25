package programing_practice;


public class TimesOfCharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbbcab";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					i++;
				}
				else
					break;
			}
			System.out.print(s.charAt(i)+""+count);
			
			
		}
		


	}

}
