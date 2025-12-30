class Node{
	public int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
}
class SLL{
	private Node first;
	private Node last;
	
	public SLL(){
		first = null;
		last = null;
	}
	
	//insertion at begn
	public void addNodeAtFirst(int item)
	{
		Node newNode = new Node(item);
		
		if(first==null)
		{
			first = newNode;
			last = first;
		}
		else
		{
			newNode.next = first;
			first = newNode;
		}
	}
	
	//insertion at last
	public void addNodeAtLast(int item)
	{
		Node newNode = new Node(item);
		
		if(first==null)
		{
			first = newNode;
			last = first;
		}
		else
		{
			last.next = newNode;
			last = newNode;
		}
	}
	
	// insert at n
	public void addNodeAtN(int item,int n){
		if(n <= 0) {
			System.out.println("Invalid position.");
			return;
		}
		if(n == 1){
			addNodeAtFirst(item);
			return;
		}
		Node temp = first;
		for(int i = 1; i < n-1; i++){
			if(temp == null){
				System.out.println("Position out of range.");
				return;
			}
			temp = temp.next;
		}
		Node newNode = new Node(item);
		newNode.next = temp.next;
		temp.next = newNode;
		if(newNode.next == null) 
			last = newNode; // update last if inserted at end
	}

	
	//deletion at first
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
		}
	}
	
	//deletion last
	public void delNodeAtLast()
	{
		if(first==null){
			System.out.println("LinkedList is Empty.");
		}
		else if(first==last)
		{
			first = null;
			last = null;
		}
		else{
			Node temp = first;
			while(temp.next!=last)
			{
				temp = temp.next;
			}
			temp.next = null;
			last = temp;
		}
	}
	
	//deletion at n
	public void delNodeAtN(int n){
		if(first == null){
			System.out.println("LinkedList is Empty.");
			return;
		}
		if(n <= 0){
			System.out.println("Invalid position.");
			return;
		}
		if(n == 1){
			delNodeAtFirst();
			return;
		}
		Node temp = first;
		for(int i = 1; i < n-1; i++){
			if(temp.next == null){
				System.out.println("Position out of range.");
				return;
			}
			temp = temp.next;
		}
		if(temp.next == null){
			System.out.println("Position out of range.");
			return;
		}
		temp.next = temp.next.next;
		if(temp.next == null) 
			last = temp;
	}

	
	//search
	public void search(int value)
	{
		if(first==null)
			System.out.println("Empty linked list");
		else
		{
			boolean flag = false;
			int pos =1;
			Node temp = first;
			while(temp!=null)
			{
				if(temp.data == value)
				{
					System.out.println("Your item was found at position: "+pos);
					flag = true;
					break;
				}
				temp = temp.next;
				pos++;
			}
			if(!flag)
				System.out.println("Your item doesn't exist in the linked list");
		}
	}
	
	//display
	public void display()
	{
		if(first==null)
			System.out.println("Linked List is empty.");
		else
		{
			System.out.println("Singly Linked List Nodes:\n");
			Node node = first;
			
			while(node!=null)
			{
				System.out.print(node.data+" -> ");
				node = node.next;
			}
			System.out.print("NULL \n");
		}		
	}
}