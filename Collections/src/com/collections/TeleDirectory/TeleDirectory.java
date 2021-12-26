package com.collections.TeleDirectory;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TeleDirectory {

	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<String,Integer>();
		map.put("ABC",785565363);
		map.put("DEF",784646433);
		map.put("MNO",634633443);
		map.put("XYZ",634687546);
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Object key=iterator.next();
			Integer value=map.get(key);
			System.out.println(key+" "+value);
		}
	}
}