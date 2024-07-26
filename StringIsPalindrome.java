package reva;

public class StringIsPalindrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcba";
		String b="";
		for(int i=s.length()-1;i>=0;i--) {
			b+=s.charAt(i);
		}
		if(s.equals(b)) {
			System.out.print("String is Palindrome");
		}else {
			System.out.print("String is Not a Palindrome");
		}

	}

}
