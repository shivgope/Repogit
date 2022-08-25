package programing_practice;

import java.util.LinkedHashSet;

public class FindTheNoOfOccurenceOfCharInGIvenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india";
		
		//Step 1 remove duplicate character by creating an set collection
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		//Step 2 Compare each character on the set with all the characters in the given string
		for (Character character : set) {
			int count = 0;
			for(int i = 0; i<s.length(); i++) {
				if(character==s.charAt(i)) {
					//Step 3 if the characters are matching then increase the count
					count++;
				}
			}
			//Step 4 Print char and count
			System.out.print(character + "" + count+" ");
		}
				
	}

}
