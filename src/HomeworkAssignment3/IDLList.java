//Charles Mercer
package HomeworkAssignment3;

import java.util.ArrayList;

public class IDLList<E> {
    Node<E> head;
    Node<E> tail;
    int size;
    ArrayList<Node<E>> indices;

    //creates an empty double-linked list
    public IDLList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.indices = new ArrayList<Node<E>>();
    }

    //add elem at position index from wherever head is //throw Expection if index is out of bounds of indices
    public boolean add(int index, E elem) throws Exception {
        Node<E> newNode = new Node<E>(elem);
        if (index < 0 || index >= indices.size()) {
            throw new Exception("Index is out of bounds for Array List");
        }

        if (index == 0) {
            add(elem);
        }

        if (index == indices.size()) {
            append(elem);
        }

        if (index != 0 && index != indices.size()) {
            head.next = newNode;
            tail.prev = newNode;
            newNode.next = tail;
            newNode.prev = head;
            size++;
            indices.add(index, newNode);
            return true;
        }


        return true;
    }

    //adds elem at the head
    public boolean add(E elem) {
        //you will implement an if else condition.
        //in the 'if', check if the head is null, head = new Node<>(elem); tail = head; size++; indices.add(0, head); return true;
        //in the 'else'.
        Node<E> newNode = new Node<E>(elem);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
            size++;
            indices.add(0, head);
        } else {
            tail.next = null;
            newNode.prev = null;
            head = newNode;
            head.next = tail;
            tail.prev = newNode;
            size++;
            indices.add(0, head);
        }

        return true;
    }


    //add elem as the new last elem as new last elem of list
    public boolean append(E elem) {
        Node<E> newNode = new Node<E>(elem);
        if(indices.isEmpty()) {
            add(elem);
        }

        if(indices.size() == 1) {
            head.prev = null;
            head.next = newNode;
            tail = newNode;
            tail.prev = head;
            indices.add(newNode);
            return true;
        }

        if(indices.size() == 2) {
            head.prev = null;
            tail = newNode;
            head.next.next = tail;
            tail.prev = head.next;
            tail.next = null;
            indices.add(newNode);
            return true;
        }

        if (indices.size() == 3) {
            head.prev = null;
            tail = newNode;
            head.next.next.next = tail;
            tail.prev = head.next.next;
            tail.next = null;
            indices.add(newNode);
            return true;
        }

        if(indices.size() == 4) {
            head.prev = null;
            tail = newNode;
            head.next.next.next.next = tail;
            tail.prev = head.next.next.next;
            tail.next = null;
            indices.add(newNode);
            return true;
        }

        if(indices.size() == 5) {
            head.prev = null;
            tail = newNode;
            head.next.next.next.next.next = tail;
            tail.prev = head.next.next.next.next;
            tail.next = null;
            indices.add(newNode);
            return true;
        }

        return true;
    }

    //returns object at position index from head get(0) returns head elem of list
    public E get(int index) {
        return indices.get(index).data;
    }

    //returns object at the head
    public E getHead() {
        return head.data;
    }

    //returns object at the tail
    public E getLast() {
        Node<E> newNode = new Node<E>(tail.data);
        return newNode.data;
    }

    //returns size of the list add when adding increment size. removing decrement size.
    public int size() {
        Node<E> newNode = head;
        if (indices.add(newNode)) {
            size++;
        }

        if (indices.remove(newNode)) {
            size--;
        }

        return size;
    }

    //removes and returns the element at the head
    public E remove() {
        Node<E> newNode = head;
        head = newNode.next;
        indices.remove(newNode);
        return indices.getFirst().data;
    }

    //removes and returns the element at the tail
    public E removeLast() {
        Node<E> newNode = tail;
         indices.remove(newNode);
         return newNode.data;
    }


    //removes and returns the element at the index
    public E removeAt(int index) throws Exception{
        Node<E> newNode = new Node<>(this.head.data);
        if(indices.isEmpty()) {
            throw new Exception("List is empty, no element to remove");
        }

        if (index >= indices.size()) {
            throw new Exception("Index out ouf bounds");
        }

        if(index > 0) {
            E obj = indices.get(index).data;
            indices.remove(indices.get(index));
            return obj;
        }

        return newNode.data;
    }

    //removes the first occurrence of elem in the list returns true. False if elem is not in list
    public boolean remove(E elem) throws Exception{
        int i;
        for(i = 0; i <indices.size(); i++) {
            if(indices.get(i).data == elem) {
                removeAt(i);
                return true;
            }

            if(indices.get(i).data != elem) {
                throw new Exception("Element not found in list");
            }

        }
        return false;
    }

    //string representation of the list
    public String toString() {
        //loop through the linkedlist
        Node<E> cur = head;
        String res = "";
        while(cur != null){
            res += " " + cur.data.toString();
            cur = cur.next;
        }

        return res;
    }

    private class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        private Node(E elem) {
            this.data = elem;
        }

        private Node(E elem, Node<E> prev, Node<E> next) {
            this.data = elem;
            this.prev = prev;
            this.next = next;
        }
    }
}
