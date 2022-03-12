package gt.edu.umg.progra3.colas;

import java.util.NoSuchElementException;

public class ColaImplementacion implements Cola{
    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(String item) {
        Node newNode = new Node(item, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    @Override
    public String deque() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot dequeue from empty Queue");
        }
        Object item = head.item;
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return item.toString();
    }

    @Override
    public String peek() {
        if (head == null) {
            throw new NoSuchElementException("Cannot peek from empty Queue");
        }
        return head.item.toString();
    }

    @Override
    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
    class Node {

        private Object item;

        private Node next;

        public Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}