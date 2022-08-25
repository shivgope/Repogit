package programing_practice;

public class SegregationOfAlpNumSpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "b@2xAB3y&#$";
		String al = "";
		String num = "";
		String sp = "";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
				al = al + s.charAt(i);
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				num = num + s.charAt(i);
			else
				sp = sp + s.charAt(i);
		}
		System.out.println(al);
		System.out.println(num);
		System.out.println(sp);
	}

}
