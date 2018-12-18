package javaPrograms;

import java.util.LinkedHashMap;

public class MapProgram
{
	public static void main(String[] args)
	{
		String[] str={"hello","riyaz","kariyza","iriyazu","intri"};
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		for(int i=0;i<str.length;i++)
		{
			if(str[i].contains("riy"))
			{
				map.put(i,str[i].substring(str[i].indexOf("riy"),str[i].indexOf('y')+1));
				//str[i].s
			}
		}
		System.out.println(map);
		System.out.println(map.values());
	}
}
