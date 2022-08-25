package ArrayPractice;

public class ReverseTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to tyss";
		String[] str = s.split(" ");
		for (int i = str.length-1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}

}
