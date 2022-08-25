package programing_practice;

public class ReverseTheGIvenStringUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India";
		//			01234
		String rev = "";//"",a,ai,aid,aidn,aidnI
		for(int i = s.length()-1; i >= 0; i-- ) {
			//i=5-1=4, 4>=0, 3>=0, 2>=0, 1>=0, 0>=0, -1>=0
			rev = rev + s.charAt(i);//""+a,a+i,ai+d,aid+n,aidn+I
		}
		System.out.println(rev);
	}

}
