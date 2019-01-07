public class BinaryToDec
{
	public static void main(String[] args)
	{
		int n=10;
		String s="1245";
		String str="";
		while(n>0)
		{
			int r = n%2;
			str =r+str;
			n=n/2;
		}
		int a=Integer.parseInt(str);
		System.out.println(str);
		System.out.println(a);
	}
}
