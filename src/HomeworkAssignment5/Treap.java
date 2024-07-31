package HomeworkAssignment5;

import java.util.Random;

public class Treap<E> {
    private Random priorityGenerator;
    private Node<E> root;

    //Initializes priorityGenerator using Random()
    public Treap() {

    }

    //initializes priorityGenerator using new Random(seed)
    public Treap(long seed) {

    }

    boolean add(E key) {
        Node<E> newNode = new Node<>(key, priorityGenerator.nextInt());
        return newNode.data == key;
    }

    boolean add(E key, int priority) {
        
    }

    boolean delete(E key) {

    }

    private boolean find(Node<E> root, E key) {

    }

    public boolean find(E key) {

    }

    @Override
    public String toString() {
        return "Treap{" +
                "priorityGenerator=" + priorityGenerator +
                ", root=" + root +
                '}';
    }

    private static class Node<E> {
        public E data;
        public int priority;
        public Node<E> left;
        public Node<E> right;

        //creates a new node with given data and priority
        //the pointers to child nodes are null
        //throw exceptions if data is null
        public Node(E data, int priority) {
            this.data = data;
            this. priority = priority;
        }

        public Node<E> rotateRight() {

        }

        public Node<E> rotateLeft() {

        }


    }
}
