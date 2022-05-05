//CDAC Module Exam 3 - ADS
//Question 2 -> Reverse a linked list

class ReverseLinkedList{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node ReverseList(Node node){
		Node Previous = null;
		Node Current = node;
		Node Next = null;
		
		while(Current != null){
			Next = Current.next;
			Current.next = Previous;
			Previous = Current;
			Current = Next;
		}
		node = Previous;
		return node;
	}
	
	void DisplayList(Node node){
		while(node != null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public static void main(String args[]){
		
		ReverseLinkedList List = new ReverseLinkedList();
		
		List.head = new Node(1);
		List.head.next = new Node(2);
		List.head.next.next = new Node(3);
		List.head.next.next.next = new Node(4);
		List.head.next.next.next.next = new Node(5);
		
		System.out.println("Normal Linked List : ");
		List.DisplayList(head);
		
		head = List.ReverseList(head);
		System.out.println("\n Reversed Linked List : ");
		List.DisplayList(head);
	}
}