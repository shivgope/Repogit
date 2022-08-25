package programing_practice;

import java.util.LinkedHashSet;

public class PrintSubstringsWithLength2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcomecome";
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String res = s.substring(i, j);
				if(res.length()==2)
					set.add(res);
			}
		}
		for (String se : set) {
			System.out.println(se);
		}

	}

}
