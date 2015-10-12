package com.developer.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class ktolast {

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
		System.out.println("Enter the element from the last that you would like to see");
		Scanner in= new Scanner(System.in);
		int klast = in.nextInt();
		int j = klast;
	loop:	for(int i = 0; i<l.size();i++){			
		j=j+1;	
		if(j == l.size() ){
				System.out.println("The "+ klast+" to last element is "+l.get(i));
				break loop;
			}
			
		}

	}
	

}
