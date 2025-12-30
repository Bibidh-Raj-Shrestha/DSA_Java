class Node{
	public int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
}
class CSLL{
	private Node first;
	private Node last;
	
	public CSLL(){
		first = null;
		last = null;
	}
	
	//insert at first
	public void addNodeAtFirst(int item)
	{
		Node newNode = new Node(item);
		
		if(first==null)
		{
			first = newNode;
			last = newNode;
			newNode.next = newNode;
		}
		else
		{
			newNode.next=first;
			first = newNode;
			last.next = first;
		}
	}
	
	//insert at end
	public void addNodeAtLast(int item)
	{
		Node newNode = new Node(item);
		
		if(first==null)
		{
			first = newNode;
			last = newNode;
			newNode.next = newNode;
		}
		else
		{
			last.next = newNode;
			newNode.next=first;
			last = newNode;
		}
	}
	
	//delete at first
	public void delNodeAtFirst()
	{
		if(first==null)
			System.out.println("LinkedList is Empty.");
		else if(first==last)
		{
			first = null;
			last = null;
		}
		else{
			first = first.next;
			last.next = first;
		}
	}
	
	//delete at end
	public void delNodeAtLast()
	{
		if(first==null)
			System.out.println("LinkedList is Empty.");
		else if(first==last)
		{
			first = null;
			last = null;
		}
		else{
			Node temp = first;
			while(temp.next!=last)
				temp=temp.next;
			last = temp;
			last.next = first;
		}
	}
	
	public void display()
	{
		if(first==null)
			System.out.println("Linked List is empty.");
		else
		{
			System.out.println("Circular Singly Linked List Nodes:\n");
			Node node = first;
			
			do
			{
				System.out.print(node.data+" -> ");
				node = node.next;
			}while(node!=first);
			System.out.println("(back to first)");
		}		
	}
	
}