package linkedlist;
/**
 * Main Class for Calling List
 * @author sandeep sinha
 *
 */
public class Main {
public static void main(String[] args) {
	List l=new List();
//	l.add(10);
//	l.add(3);
//	l.add(24);
//	l.add(40);
//	l.add(32);
//	l.add(11);
//	l.add(88);
//	l.add(44);
//	l.add(76);
	for(int i=1;i<5;i++) {
		l.add(i*3);
	}
	l.print();
	List l1=new List();
	for(int i=1;i<5;i++) {
		l1.add(i*2);
	}
	
	l1.print();
	System.out.println("\n ================");
	System.out.println("Node count ==> "+l.count());
	//l.insertAtPosition(1, 23);
	System.out.println("\n ");
	//l.deleteAtPosition(3);//for Deleting element
	//l.print();
	//l.getMiddleElement();//For finding middle element
	//l.rotate(3);
	//l.print();
	
	l.merge(l.head, l1.head);
	l.print();
	
}
}
