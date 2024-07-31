package Notes;

public class DoublyLinkedList {

    class Node {
        int item;
        Node previous;
        Node next;

        public Node( int item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    public  void addNode(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }

        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        else {
            System.out.println("The nodes in the doubly linked list");
            while(current != null) {
                System.out.println(current.item + " ");
                current = current.next;
            }
        }
    }

    public void deleteHead() {
        if(head != null) {
            this.head = this.head.next;
        }
        else {
            System.out.println("The list is empty, Can't delete head");
        }
    }

    public void getHead() {
        System.out.print("I was getting some head: ");
        System.out.println(head.item);
    }

    public static void main(String[] args) {
        DoublyLinkedList dlList = new DoublyLinkedList();

        dlList.addNode(10);
        dlList.addNode(20);
        dlList.addNode(30);
        dlList.addNode(40);
        dlList.addNode(50);

        dlList.printNodes();;

        dlList.getHead();
    }
}
