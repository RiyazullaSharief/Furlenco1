package javaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Collection1 {

	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add("gjkgk");
		list.add("ghgk");
		list.add("ryu");
		list.add("yui");
		list.add("iop");
		list.forEach(System.out::println);
		list.forEach(lst->System.out.println(lst));
		System.out.println(list.clone());
		System.out.println(list.subList(0, 3));
		
		System.out.println(list);
//		LinkedList list1=new LinkedList();
//		list1.add("rttt");
//		list1.add("dddd");
//		list1.add("rrrr");
//		
//		System.out.println(list.get(2));
//		System.out.println(list.addAll(2, list1));
//		list.forEach(lst->System.out.println(lst));
//		list.forEach(System.out::println);
//		Object oc = list.clone();
//		System.out.println(fg);
//		System.out.println(list);
//		list.forEach(System.out::println);
	}

}

