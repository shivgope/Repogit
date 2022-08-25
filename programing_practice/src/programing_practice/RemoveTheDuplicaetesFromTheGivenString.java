package programing_practice;

import java.util.LinkedHashSet;

public class RemoveTheDuplicaetesFromTheGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india";
		
		//Step 1 remove duplicate character by creating an set collection
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		//Step 2 print the set
		for (Character ch : set) {
			System.out.print(ch);
		}

	}

}
