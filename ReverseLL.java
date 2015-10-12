package com.developer.LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class ReverseLL {

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
		for(int j=0;j<l.size()/2;j++) {
			int temp = l.get(j);
			l.remove(j);
			l.remove(l.size()-1-j);
			l.add(j, l.get(l.size()-1-j));
			l.add(l.size()-j, temp);
			//System.out.println(l);	
		}
		System.out.println(l);

	}

}
