package LinkedLists;

public class Main {

    public static void main(String[] args) {

        //Declare first node
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        //declare linked list
        LinkedList ll = new LinkedList(n1);
        ll.append(n2);
        ll.append(n3);

        //ll.printAllElements();

        // Test getNode(atPosition:)
        System.out.println(ll.getHead().getNext().getNext().getValue()); // Should print 3
        System.out.println(ll.getNode(3).getValue());// Should also print 3

        // Test insert
        ll.insertNode(n4, 3);
        System.out.println(ll.getNode(3).getValue()); // Should print 4 now

        // Test delete(withValue:)
        ll.deleteNode(1);
        System.out.println(ll.getNode(1).getValue());// Should print 2 now
        System.out.println(ll.getNode(2).getValue()); // Should print 4 now
        System.out.println(ll.getNode(3).getValue()); // Should print 3
    }
}
