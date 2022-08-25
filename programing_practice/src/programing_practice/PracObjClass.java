package programing_practice;

public class PracObjClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PracObjClass o = new PracObjClass();
		//System.out.println(o);
		
		//String s = "ab";
		//String s1 = "ac";
		
		int n = 851;
		int r = 0;
		while(n!=0) {
			int d = n/10;
			r = r + d*10;
			n = n%10;
		}
		System.out.println(r);
		
		//System.out.println(s.compareTo(s1));
	}

}
