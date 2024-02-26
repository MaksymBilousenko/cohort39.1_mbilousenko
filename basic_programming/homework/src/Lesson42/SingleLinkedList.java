package Lesson42;

public class SingleLinkedList<T> {
    private Node<T> first;
    private int count;

    public SingleLinkedList() {
        first = null;
        count = 0;
    }

    public boolean isEmty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value, first);
        first = newNode;
        count++;
    }


    public void add(T value) {
        if (isEmty()) {
            first = new Node<>(value, null);
            count = 1;
            return;
        }
        Node<T> current = first;
        while (current.hasNext()) {
            current = current.getNext();
        }
        Node<T> newNode = new Node<>(value, null);
        current.setNext(newNode);
        count++;
    }

    public void add(T value, int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index out of bounds for length " + count);
        } else if (index == 0) {
            addFirst(value);
            return;
        } else if (index == count) {
            add(value);
            return;
        }
        Node<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Node<T> newNode = new Node<>(value, current.getNext());
        current.setNext(newNode);
        count++;
    }

    public T get(int index) {
        if (isEmty()) {
            return null;
        }
        Node<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }
    public int indexOf(T value){
        if (isEmty()) {
            return -1;
        }
        Node<T> current = first;
        for (int i = 0; current != null; i++) {
            if (current.getValue().equals(value)) {
                return i;
            }
        }

        for (int i = 0; current != null; i++) {
            if (current.getValue().equals(value)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }
        return remove(index);
    }
    public boolean remove(int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current =  current.getNext();
        }
        current.setNext(current.getNext().getNext());
        count--;
        return true;
    }




    private class Node<T> {

        private T value;

        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }


    }
}
