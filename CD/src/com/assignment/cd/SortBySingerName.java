package com.assignment.cd;

import java.util.Comparator;

public class SortBySingerName implements Comparator<CD> {

	@Override
	public int compare(CD o1, CD o2) {
		
		return o1.singerName.compareTo(o2.singerName);
	}

}
