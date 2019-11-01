package linkedlist;

public class Main {
public static void main(String[] args) {
	List l=new List();
	l.add(10);
	l.add(3);
	l.add(24);
	l.add(40);
	l.add(32);
	l.print();
	System.out.println("\n ================");
	System.out.println("Node count ==> "+l.count());
	//l.insertAtPosition(1, 23);
	System.out.println("\n ");
	//l.deleteAtPosition(3);//for Deleting elemnt
	//l.print();
	l.getMiddleElement();//For finding middle element
	
	
	
	
}
}
