package com.developer.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Detifcircular {

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
		int k =0,j=1;
		while(j < l.size()){
			if (l.get(j)==l.get(k)){
				System.out.println("Circular");
				System.out.println(j+ " " +k);
				break;
			
		}
			else{
				k++;
				j=j+2;
			}
		}
		System.out.println("Proper");
	}

}
