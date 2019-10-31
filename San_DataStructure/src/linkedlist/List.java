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
}
