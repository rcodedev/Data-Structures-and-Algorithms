package LinkedList;

public class SingleLinkedList {
 
	public static void main(String[] args) {
		SLL sll=new SLL();
		 sll.creationOfSLL(5);     
	        sll.insertion(0, 10);    
	        sll.insertion(1, 20);     
	        sll.insertion(1, 15);     

	        sll.frdTraverse();      

	        System.out.println("Backward Traversal:");
	        sll.BwdTraverse(sll.head); 

	        sll.search(15);           

	        sll.delete();  
	}
}

class Node{
	int value;
	Node next;
}

class SLL{
	Node head, tail;
	int size;
	
	public void creationOfSLL(int value) {
		Node node = new Node();
		node.value=value;
		node.next=null;
		head=tail=node;
		size=1;
	}

	public void insertion(int location, int value) {
		Node node= new Node();
		node.value=value;
		if(head == null) {
			creationOfSLL(value);
			return;
		}
		if(location == 0) {
			node.next=head;
			head=node;
		}
		else if (location >= size) { 
	        node.next = null;
	        tail.next = node;
	        tail = node;
	    }
		else {
			Node temp = head;
	        for (int i = 0; i < location - 1; i++) {
	            temp = temp.next;
	        }
	        node.next = temp.next;
	        temp.next = node;
		}
		size++;
	}
	
	public void frdTraverse() {
		Node temp=head;
		while(temp != null) {
			System.out.println(temp.value+ " ");
			temp=temp.next;
		}
	}
	
	public void BwdTraverse(Node node) {
		Node temp = reverse();
		while(temp != null) {
			System.out.println(temp.value+ " ");
			temp = temp.next;
		}
	}
	
	public Node reverse() {
		Node prev = null;
	    Node curr = head;

	    while (curr != null) {
	        Node next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }
	    return prev;
	}
	
	
	public void search(int value) {
	    Node temp = head;
	    int index = 0;

	    while (temp != null) {
	        if (temp.value == value) {
	            System.out.println("Value found at index " + index);
	            return;
	        }
	        temp = temp.next;
	        index++;
	    }
		System.out.println("The value is not present");
	}
	
	public void delete() {
		head = tail = null;
		size=0;
		System.out.println("SingleLinkedList is deleted");
	}
	
}