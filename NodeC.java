package com.developer.LinkedList;

import java.util.Scanner;

public class NodeC {
	int data;
	NodeC next;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeC l = new NodeC();
		int k;
		do {
			System.out.println("Enter the number :1.Add 2.Delete 3.View");
			Scanner in = new Scanner(System.in);
			int number = in.nextInt();
			
			switch (number) {
			case 1:
				System.out.println("Enter the number to add");
				int val = in.nextInt();			
				l.add(val);
				
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
   NodeC(int d){
	data= d;
   }
   NodeC(){
	   
   }
   public void add(int val){
	   NodeC end = new NodeC(val);
	   NodeC n = this;
	   while(n.next != null){
		   n= n.next;
	   }
	   n.next= end;
   }
   public void display(NodeC head){
	   NodeC currentNode = head;
	   while(currentNode != null){
		   System.out.print(currentNode.data+" -> ");
		   currentNode = currentNode.next;
	   }
	   System.out.println();
   }
   public NodeC deleteNode(NodeC head, int val){
	   NodeC currentNode = head;
	   if(currentNode.data ==val){
		   return head.next;
	   }
	   while(currentNode.next != null){
		   if(currentNode.next.data == val){
			   System.out.println("The data deleted is "+val);
			   currentNode.next=currentNode.next.next;
			   return head;
		   }
		   currentNode = currentNode.next;
	   }
	   return head;
   }

}
