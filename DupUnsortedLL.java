package com.developer.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DupUnsortedLL {
	/*Removing duplicates from an unsorted LinkedList*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer>l = new LinkedList<Integer>();
		Set <Integer> s = new HashSet<Integer>();
		for(int i=0;i<10;i++){
			l.add((int) (Math.random()*(2000-100)));
			l.add(i);
		}
		l.add(3);
		System.out.println(l);
	for(int i=0;i<l.size();i++){
		if(s.add(l.get(i))){
			
		}else{
			l.remove(i);
		}
	}

	System.out.println(l);
	}

}
