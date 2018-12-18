package javaPrograms;
public class ReverseStringUsingStringBuffer
{
	public static void main(String[] args)
	{
		String str="Hello";
		String str1=new StringBuffer(str).reverse().toString();
		System.out.println(str1);
	}
}
