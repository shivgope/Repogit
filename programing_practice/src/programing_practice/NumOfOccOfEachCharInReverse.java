package programing_practice;

import java.util.LinkedHashSet;

public class NumOfOccOfEachCharInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Tester";
		s = s.toLowerCase();
		
		//Step 1 remove the duplicate characters from given string
		LinkedHashSet<Character> set = new LinkedHashSet<>();
//		for (int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		
		for(int i = s.length()-1; i >= 0; i--) {
			set.add(s.charAt(i));
		}
		
		//Step 2 compare each character of the set with all the character in the string
		for (Character ch : set) {
			for (int i = s.length()-1; i >= 0; i--) {
				if (ch == s.charAt(i)) {
					//Step 3 print the character and its occurence
					System.out.println(ch + " = " + (i+1) );
					break;
				}
			}
		}

	}

}
