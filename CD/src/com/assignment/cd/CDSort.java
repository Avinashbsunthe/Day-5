package com.assignment.cd;

import java.util.TreeSet;

public class CDSort {
	public static void main(String[] args) {
		CD cd1=new CD("Vijay Prakash","Salam Rocky Bhai");
		CD cd2=new CD("Ananya Bhat","Garbadhi");
		CD cd3=new CD("Sachin","Sidila Bharava");
		CD cd4=new CD("Mohan","Dheera Dheera");
		CD cd5=new CD("Shreyaa","Jokae");
		
		SortBySingerName singername=new SortBySingerName();
		
		SortByTitle title=new SortByTitle();
		
		TreeSet<CD> songs=new TreeSet<CD>(singername);
		TreeSet<CD> song=new TreeSet<CD>(title);
		
		songs.add(cd1);
		songs.add(cd2);
		songs.add(cd3);
		songs.add(cd4);
		songs.add(cd5);
		
		song.add(cd1);
		song.add(cd2);
		song.add(cd3);
		song.add(cd4);
		song.add(cd5);

		for(CD s:songs) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------------------");
		
		for(CD s1:song) {
			System.out.println(s1);
		}
			
		}
}
