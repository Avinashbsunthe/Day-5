package com.assignment.cd;

import java.util.Comparator;

public class SortByTitle implements Comparator<CD> {

	@Override
	public int compare(CD o1, CD o2) {
		
		return o2.title.compareTo(o1.title);
	}

}
