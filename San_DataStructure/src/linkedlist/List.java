package linkedlist;

public class List {

	Node head;
	/**
	 * 1.Add the element in the list
	 * @param data
	 */
	public void add(int data) {
		
		if(head==null) {
			head=new Node(data);
		}else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=new Node(data);
		}
	}
	/**
	 *2. iterate till end and print the element in the list
	 */
	public void print() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
			//System.out.print(current.data+" ");
		}
		
	}
	/**
	 * 3.Count number of nodes
	 * @return
	 */
	public int count() {
		int count=0;
		Node current=head;
		
		while(current!=null) {
			
			current=current.next;
			count++;
			
		}
		return count;
	}
	/**
	 * 4.insert at any position in the list
	 * @param pos
	 * @param data
	 */
	public void insertAtPosition(int pos,int data) {
		int count=count();
		Node current=head;
		if(count==0 && pos==1) {
			head=new Node(data);
		}else if(pos>count+1) {
			System.out.println("Invalid position");
		}else if(pos==1) {
			Node node =new Node(data);
			node.next=head;
			head=node;
		}
		else {
			for(int i=1;i<pos-1;i++) {
				current=current.next;
			}
			Node node =new Node(data);
			node.next=current.next;
			current.next=node;
		}
	}
	
	/**
	 * 5.Delete particular position
	 */
	public void deleteAtPosition(int pos) {
		int count=count();

		if(head==null) {
			System.out.println("Invalid");
		}else if(pos==0) {
			System.out.println("Invalid");
		}else if (pos>count) {
			System.out.println("Position cannot be greater than count");
		}else {
			Node current =head;
			for(int i=1;i<pos-1;i++) {
				current=current.next;
			}
			Node temp=current.next;
			current.next=temp.next;
			temp.next=null;
		}
	}
	
	
	/**
	 * 6. Get Middle Element
	 */
	public void getMiddleElement() {
		Node fast=head;
		Node slow=head;
		int count=count();
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		//If the count of list is Even then ,there should be two middle elements
		if(count%2==0) {
			System.out.println(slow.data+" == "+slow.next.data);
		}else {
			System.out.println(slow.data);
		}
	}
	
	/**
	 * 7.get the count of particular Node 
	 */
	
	public int count(Node head) {
		 int count=0;
		Node current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
		
	}
	/**
	 * Finding the the intersection point of two linked list
	 * @param node1
	 * @param node2
	 * Steps
	 * Finding the count of each node
	 * Find the difference
	 * Move onwards the difference
	 * 
	 */
	public void getIntersectionPoint(Node node1,Node node2){
	
	//1.Finding the count
	int node1Count=count(node1);	
	int node2Count=count(node2);
	int diff=0;
	//2. Finding the difference
	if(node1Count>node2Count) {
		diff=node1Count-node2Count;
		//
		Node current1=node1;
		for(int i=0;i<diff;i++) {
			current1=current1.next;
		}
		System.out.println("Node1 >>"+current1.data);
	}else if(node1Count<node2Count){
		diff=node2Count-node1Count;
	}
/*	Node current1=head;
	Node current2=head;
	//3.move onwards the difference
	for(int i=0;i<diff;i++) {
		current1=current1.next;
	}
	while(current1!=null && current2!=null) {
		if(current1.data==current2.data) {
			System.out.println("Intersection point ==> "+current1.data);
		}
		current1=current1.next;
		current2=current2.next;
	}
		System.out.println("Intersection point not found");
	*/
	
	}
	/**
	 * Function to reverse the linked list
	 * Steps:
	 * Using three pointer
	 */
	
	public Node reverse(Node head) {
		Node prev=null;
		Node current=head;
		Node temp=null;
		while(current!=null) {
			temp=current.next;
			current.next=prev;
			
			prev=current;
			current=temp;
		}
		head=prev;
		return head;
		
	}
	
/**
 * Rotate Linked List	
 */
	
	public void rotate(int pos) {
		Node firstPointer=head;
		Node secondPointer=head;
		for(int i=0;i<pos;i++) {
			firstPointer=firstPointer.next;
		}
		
		while(firstPointer.next!=null) {
			firstPointer=firstPointer.next;
			secondPointer=secondPointer.next;
		}
		firstPointer.next=head;
		head=secondPointer.next;
		
	}	
/**
 * Merge two sorted List	
 */
	
	public void merge(Node head1,Node head2) {
		
		Node temp=new Node(10);
		Node temp2=temp;
		while(true) {
		if(head1==null) {
			temp.next=head2;
			break;
		}
		if(head2==null) {
			temp.next=head1;
			break;
		}
		if(head1.data<=head2.data) {
			temp.next=head1;
			head1=head1.next;
		}else {
			temp.next=head2;
			head2=head2.next;
		}
		temp=temp.next;
		
		//temp2.next=null;
		}
		head=temp2.next;
		
	}
	
}
