package programing_practice;

public class XylemString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is ritu";
		String[] a = s.split(" ");
		
		
		for (int i = 0; i < a.length; i++) 
		{
			String s1 = "";
			for (int j = 0; j < a[i].length(); j++) {
				
				String b = a[i];
				if(j==0)
				{
					s1=s1+b.charAt(j);
					s1= s1.toUpperCase();
					
				}else
					s1=s1+b.charAt(j);
			}
			System.out.print(s1);
			System.out.print("  ");
		}
	}

}
