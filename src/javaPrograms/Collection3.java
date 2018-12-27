package javaPrograms;
import java.util.LinkedHashSet;
public class Collection3
{
	public static void main(String[] args)
	{
		LinkedHashSet lst=new LinkedHashSet();
		lst.add("rol");
		lst.add("tre");
		lst.add("abc");
		System.out.println(lst);
		lst.forEach(System.out::println);
		System.out.println("===================");
		lst.forEach(lt->System.out.println(lt));
	}
}
