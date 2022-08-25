package programing_practice;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateCharactersInTheGivenString {
	
	public static void main(String[] args) {
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
			if(count>1) {
			//Step 4 Print the duplicate character
				System.out.println(character + " " + count);
			}
		}

	}

}
