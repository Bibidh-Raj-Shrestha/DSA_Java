class Node{
	public int value;
	Node prev;
	Node next;
	public Node(int value)
	{
		this.value = value;
		prev = null;
		next = null;
	}
}
public class CDLL{
	private Node first;
	private Node last;
	public CDLL()
	{
		first = null;
		last = null;
	}
	
	//insertion at first
	public void insertFirst(int value)
	{
		Node newNode = new Node(value);
		if(first == null)
		{
			first = last = newNode;
			newNode.prev = newNode;
			newNode.next = newNode;
		}
		else{
			newNode.next = first;
			newNode.prev = last;
			first.prev = newNode;
			first =newNode;
			last.next = newNode;
		}
	}
	
	//insertion at last
	public void insertLast(int value)
	{
		Node newNode = new Node(value);
		if(first == null)
		{
			first = last = newNode;
			newNode.prev = newNode;
			newNode.next = newNode;
		}
		else{
			newNode.prev = last;
			newNode.next = first;
			last.next = newNode;
			last = newNode;
			first.prev = newNode;
		}
	}
	
	//deletion at first
	public void deleteFirst(){
		if(first==null)
		{
			System.out.println("Empty Linked list");
		}
		else if(first == last)
		{
			first = last = null;
		}
		else{
			first = first.next;
			first.prev = last;
			last.next = first;
		}
	}
	
	//deletion at last
	public void deleteLast(){
		if(first==null)
		{
			System.out.println("Empty Linked list");
		}
		else if(first == last)
		{
			first = last = null;
		}
		else{
			last = last.prev;
			last.next = first;
			first.prev = last;
		}
	}
	
	//display
	public void display() 
	{
		if(first == null) {
			System.out.println("Empty linked list");
			return;
		}
		
		System.out.println("Existing Circular linked list:");
		//traversing from first(using next)
		System.out.println("Forward: ");
		Node temp = first;
		System.out.print("(Last)  <-> ");
		do{
			System.out.print(temp.value + " <-> ");
			temp = temp.next;
		}while(temp != first);
		System.out.println("(First)");
		System.out.println();
		
		//traversing from last(using prev)
		System.out.println("Backward: ");
		System.out.print("(First) <-> ");
		temp = last;
		do{
			System.out.print(temp.value + " <-> ");
			temp = temp.prev;
		}while(temp != last);
		System.out.println("(Last)");
		System.out.println();
	}
}