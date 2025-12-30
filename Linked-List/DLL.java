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
class DLL{
	private Node first;
	private Node last;
	public DLL()
	{
		first = null;
		last = null;
	}
	
	//insert at first
	public void insertFirst(int value)
	{
		Node newNode = new Node(value);
		if(first == null)
		{
			first = newNode;
			last = newNode;
		}
		else{
			newNode.next = first;
			first.prev = newNode;
			first =newNode;
		}
	}
	
	//insert at last
	public void insertLast(int value)
	{
		Node newNode = new Node(value);
		if(first == null)
		{
			first = newNode;
			last = newNode;
		}
		else{
			newNode.prev = last;
			last.next = newNode;
			last = newNode;
		}
	}
	
	//delete at first
	public void deleteFirst()
	{
		if(first == null)
			System.out.println("Empty linked list");
		else if(first==last)
		{
			first = null;
			last = null;
		}
		else{
			first = first.next;
			first.prev= null;
		}
	}
	
	//delete at last
	public void deleteLast()
	{
		if(first == null) {
			System.out.println("Empty linked list");
		} else if(first == last) {
			first = last = null;
		} else {
			last = last.prev;
			last.next = null;
		}

	}
	
	//display
	public void display() {
		if(first == null) {
			System.out.println("Empty linked list");
			return;
		}

		System.out.print("Forward: ");
		Node temp = first;
		while(temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}

		System.out.print("\nBackward: ");
		temp = last;
		while(temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.prev;
		}
		System.out.println();
	}

}