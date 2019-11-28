package LinkedLists;

public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void printAllElements() {

        Node current = head;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }

    }

    public void append(Node node) {

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(node);

    }

    //getNode(atPosition:): return the value of the node at a certain position.
    public Node getNode(int position) {

        Node current = head;
        int counter = 1;

        while (current != null) {

            if (position == counter) {
                return current;
            }

            counter++;
            current = current.getNext();
        }

        return null;
    }

    //insertNode(_:at:): add a node to a specific position in the list.
    public void insertNode(Node node, int position) {

        if (position > 0) {

            if (position == 1) {
                node.setNext(head);
                head = node;
            } else {

                Node current = head;
                int counter = 1;

                while (current != null) {

                    if (counter == position - 1) {
                        node.setNext(current.getNext());
                        current.setNext(node);
                        return;
                    }

                    counter++;
                    current = current.getNext();
                }

            }

        }

    }

    //deleteNode(withValue:): delete the first node with the specified value.
    public void deleteNode(int value) {

        Node current = head;
        Node previous = null;

        while (current != null) {

            if (current.getValue() == value) {

                if (previous == null) {
                    head = current.getNext();
                    return;
                } else {
                    previous.setNext(current.getNext());
                    return;
                }

            }

            previous = current;
            current = current.getNext();
        }
    }


    public Node getHead() {
        return head;
    }
}
