package com.assignment.cd;

public class CD {
	String singerName;
	String title;
	
	public CD(String singerName, String title) {
		super();
		this.singerName = singerName;
		this.title = title;
	}

	@Override
	public String toString() {
		return "CD singerName=" + singerName +"\t" +"         CD title=" + title ;
	}	
}

