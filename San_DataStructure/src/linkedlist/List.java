package linkedlist;

public class List {

	Node head;
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
	 * iterate till end
	 */
	public void print() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		
	}
	
	public int count() {
		int count=0;
		Node current=head;
		
		while(current!=null) {
			
			current=current.next;
			count++;
			
		}
		return count;
	}
	//insert at any position in the list
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
	
}
