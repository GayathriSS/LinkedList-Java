package com.developer.LinkedList;

public class NodeList {
	int data;
	NodeList next;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public NodeList(int d) {
		data=d;
	}
	public void setdata(int d){
		data=d;
	}
	public int getData(){
		
		return data;
	}
	public void setnext(NodeList next){
		this.next =next;
	}
	public NodeList getnext(){
		return this.next;
	}
	 int ListLength(NodeList head){
		int length =0;
		NodeList currentNode = head;
		while(currentNode != null){
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}
	NodeList InsertInLinkedList( NodeList headNode, NodeList nodeToInsert , int position){
		return headNode;
	}
	void addtotail(int head, int d){
		
	}
}
