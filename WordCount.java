package reva;

public class WordCount {

	public static void main(String[] args) {
	
		String s="hello,hiii,archana";
		String[] a=s.split(",");
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			String out=a[i];
			c++;
			
			
		}
		System.out.println(c);
	}

}
