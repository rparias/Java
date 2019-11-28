package Stacks;

import LinkedLists.LinkedList;
import LinkedLists.Node;

public class Stack {

    LinkedList ll;

    public Stack(Node node) {
        ll = new LinkedList(node);
    }

    //Adds a node to the beginning of the linked list
    public void push(Node node) {
        ll.insertNode(node, 1);
    }

    //deletes the node at the beginning of the linked list, and returns the deleted node
    public Node pop() {

        Node node = ll.getNode(1);
        ll.deleteNode(node.getValue());

        return node;
    }


}
