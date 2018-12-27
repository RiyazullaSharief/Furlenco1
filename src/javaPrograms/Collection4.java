package javaPrograms;
import java.util.HashMap;
import java.util.Map;
public class Collection4
{
	public static void main(String[] args)
	{
		Map<Integer,String> list=new HashMap<>();
		list.put(10, "Saha");
		list.put(11, "Sahar");
		list.put(12, "Saham");
		System.out.println(list.values());
		System.out.println(list.entrySet());
		System.out.println(list.get(10));
		System.out.println(list.replace(10, "Sahana"));
		System.out.println(list);
		System.out.println(list.replace(12,"saharaa"));
		System.out.println(list);
		//System.out.println(list.);
	}
}
