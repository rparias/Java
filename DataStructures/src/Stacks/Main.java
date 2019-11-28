package Stacks;

import LinkedLists.Node;

public class Main {

    public static void main(String[] args) {

        // Test cases
        // Set up some nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        // Start setting up a Stack
        Stack stack = new Stack(n1);

        // Test stack functionality

        stack.push(n2);
        stack.push(n3);

        System.out.println(stack.pop().getValue()); // Should be 3
        System.out.println(stack.pop().getValue()); // Should be 2
        System.out.println(stack.pop().getValue()); // Should be 1
        //System.out.println(stack.pop().getValue()); // Should be nil
        stack.push(n4);
        System.out.println(stack.pop().getValue()); // Should be 4
        /**/
    }
}
