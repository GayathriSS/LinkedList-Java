package com.developer.LinkedList;

import java.util.Scanner;

public class LinkedListImp {
	public static void main(String[] args) {
		int k;
		Node l = new  Node();
		// TODO Auto-generated method stub
		do {
			System.out.println("Enter the number :1.Add 2.Delete 3.View");
			Scanner in = new Scanner(System.in);
			int number = in.nextInt();
			
			switch (number) {
			case 1:
				System.out.println("Enter the number to add");
				int val = in.nextInt();			
				l.appendToTail(val);
				
				break;
			case 2:
				System.out.println("Enter the node u want to delete");
				int del = in.nextInt();	
				l.deleteNode(l, del);
				break;
			case 3:
				System.out.println("The NodeList is");
				l.display(l);			
				break;
			default:
				break;

			}
			System.out.println("Do u want to continue");
			 k = in.nextInt();
		} while (k == 1);
	}
	public LinkedListImp(){
		
	}
	
	

}
